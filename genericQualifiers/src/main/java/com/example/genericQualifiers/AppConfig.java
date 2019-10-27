package com.example.genericQualifiers;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.genericQualifiers.bean.DoubleMessage;
import com.example.genericQualifiers.bean.DoubleMessageImpl;
import com.example.genericQualifiers.bean.IntegerMessage;
import com.example.genericQualifiers.bean.IntegerMessageImpl;

@Configuration
@ComponentScan(basePackages = {"com.example.genericQualifiers.bean"})
public class AppConfig {

	@Bean
	public IntegerMessage integerMessage() {
		return new IntegerMessageImpl();
	}
	
	@Bean
	public DoubleMessage doubleMessage() {
		return new DoubleMessageImpl();
	}
}
