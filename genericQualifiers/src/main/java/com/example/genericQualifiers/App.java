package com.example.genericQualifiers;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.genericQualifiers.bean.ClassHolder;
import com.example.genericQualifiers.bean.DoubleMessageImpl;
import com.example.genericQualifiers.bean.IntegerMessageImpl;

public class App {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		ClassHolder holder = context.getBean(ClassHolder.class);
		IntegerMessageImpl integerMessageImpl = (IntegerMessageImpl) holder.getIntegerMessage();
		integerMessageImpl.showMessage();
		DoubleMessageImpl doubleMessageImpl = (DoubleMessageImpl) holder.getDoubleMessage();
		doubleMessageImpl.showMessage();
	}
}
