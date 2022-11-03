package com.sns;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.aws.autoconfigure.context.ContextRegionProviderAutoConfiguration;
import org.springframework.cloud.aws.autoconfigure.context.ContextStackAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.amazonaws.services.sns.AmazonSNSClient;
import com.amazonaws.services.sns.model.PublishRequest;
import com.amazonaws.services.sns.model.SubscribeRequest;

@SpringBootApplication(exclude = {ContextStackAutoConfiguration.class,ContextRegionProviderAutoConfiguration.class} )
@RestController
public class AwsSnsDemoApplication {

	@Autowired
	private AmazonSNSClient amazonSNSClient;
	
	@Value("${topic_ARN}")
	private String topic_ARN;
	
	@GetMapping("/subcription/{email}")
	public String addSubcription(@PathVariable String email) {
		
		SubscribeRequest request= new SubscribeRequest(topic_ARN,"email",email);
		
		amazonSNSClient.subscribe(request);
		return "Subcription request is pending please check your email"+email;
	}
	
	@GetMapping("/sendnotification")
	public String publishMessageToTopib() {
		PublishRequest publishRequest=new PublishRequest(topic_ARN,builderBody(),"This message is from springboot");
		amazonSNSClient.publish(publishRequest);
		return "Message publish sucessfully:";
	}
	
	private String builderBody() {
		
		return "Dear Cutomer \n"+
		"\n"+
				"We are offring 50% off on your purchase of 15000 \n"+
		"offer end on 10";
	}

	public static void main(String[] args) {
		SpringApplication.run(AwsSnsDemoApplication.class, args);
	}

}
