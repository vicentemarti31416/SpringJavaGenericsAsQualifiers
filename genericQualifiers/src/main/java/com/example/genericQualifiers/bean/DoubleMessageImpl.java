package com.example.genericQualifiers.bean;

import org.springframework.stereotype.Component;

@Component
public class DoubleMessageImpl extends GenericClass<Double> implements DoubleMessage {

	@Override
	public void showMessage() {
		System.out.println("El Number es de tipo Double");
	}

}
