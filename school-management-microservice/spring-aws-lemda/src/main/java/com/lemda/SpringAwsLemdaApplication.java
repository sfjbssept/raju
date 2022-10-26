package com.lemda;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.lemda.entity.Order;
import com.lemda.repo.OrderRepo;

@SpringBootApplication
public class SpringAwsLemdaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAwsLemdaApplication.class, args);
	}

	@Autowired
	private OrderRepo orderRepo;
	
	
	@Bean
	public Supplier<List<Order>> orders(){
		return ()->orderRepo.buildOrder();
	}
	
	@Bean
	Function<String, List<Order>> findOrderByName(){
		return (input) ->orderRepo.buildOrder().stream().
				filter(order-> order.getName().equals(input)).collect(Collectors.toList());
	}
}
