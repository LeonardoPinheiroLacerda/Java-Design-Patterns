package com.leonardo.designpatterns.factorymethod.factory.concrete;

import com.leonardo.designpatterns.factorymethod.concreteobjs.MockEmailService;
import com.leonardo.designpatterns.factorymethod.concreteobjs.EmailService;

public class MockEmailServiceFactory extends EmailServiceFactory{
	
	public static EmailService create() {
		return new MockEmailService();
	}
	
}
