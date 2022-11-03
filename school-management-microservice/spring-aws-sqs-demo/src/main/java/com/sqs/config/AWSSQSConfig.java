package com.sqs.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.sqs.AmazonSQSAsync;
import com.amazonaws.services.sqs.AmazonSQSAsyncClientBuilder;

@Configuration
public class AWSSQSConfig {
	
	@Value("${cloud.aws.region.static}")
	private String region;
	
	@Value("${cloud.aws.credentials.access-key}")
	private String awsAccesskey;
	@Value("${cloud.aws.credentials.secret-key}")
	private String awsSecretkey;
	
	@Bean
	public QueueMessagingTemplate messagingTemplate() {
		return new QueueMessagingTemplate(amzoneSQSAsync());
	}

	@Bean
	@Primary
	public AmazonSQSAsync amzoneSQSAsync() {
		
		return AmazonSQSAsyncClientBuilder.standard().withRegion(Regions.US_EAST_1)
				.withCredentials(new AWSStaticCredentialsProvider(new BasicAWSCredentials(awsAccesskey, awsSecretkey))).build();
	}

}