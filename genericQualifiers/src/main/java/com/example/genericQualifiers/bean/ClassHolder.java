package com.example.genericQualifiers.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClassHolder {

	@Autowired
	private GenericClass<Integer> integerMessage;
	
	@Autowired
	private GenericClass<Double> doubleMessage;

	public GenericClass<Integer> getIntegerMessage() {
		return integerMessage;
	}

	public void setIntegerMessage(GenericClass<Integer> integerMessage) {
		this.integerMessage = integerMessage;
	}

	public GenericClass<Double> getDoubleMessage() {
		return doubleMessage;
	}

	public void setDoubleMessage(GenericClass<Double> doubleMessage) {
		this.doubleMessage = doubleMessage;
	}
}
