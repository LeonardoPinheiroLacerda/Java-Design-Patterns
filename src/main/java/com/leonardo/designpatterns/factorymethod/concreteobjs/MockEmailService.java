package com.leonardo.designpatterns.factorymethod.concreteobjs;

public class MockEmailService implements EmailService{

	public void sendHTMLEmail() {
		System.out.println("Sending a mocked e-mail.");		
	}

	

}
