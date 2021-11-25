package com.aisc.angular.search;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EntityScan(basePackages = {"com.aisc.angular.search.model"}) 
public class AngularSearchWithCriteriaAP
{
	public static void main(String[] args)
	{
		SpringApplication.run(AngularSearchWithCriteriaAP.class, args);
	}
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}
