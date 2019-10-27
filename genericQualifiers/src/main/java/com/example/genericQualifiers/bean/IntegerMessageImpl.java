package com.example.genericQualifiers.bean;

import org.springframework.stereotype.Component;

@Component
public class IntegerMessageImpl extends GenericClass<Integer> implements IntegerMessage {

	@Override
	public void showMessage() {
		System.out.println("El Number es de tipo Integer");
	}

}
