package com.lemda.repo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Repository;

import com.lemda.entity.Order;

@Repository
public class OrderRepo {
	
	public List<Order> buildOrder(){
		return Stream.of(new Order(101,"Laptop",50000,40),
				         new Order(102,"Mouse",300,21),
				         new Order(103,"Printer",3000,2),
				         new Order(104,"Mobile",1300,29),
				         new Order(105,"cable ",700,21)
				).collect(Collectors.toList());
	}

}
