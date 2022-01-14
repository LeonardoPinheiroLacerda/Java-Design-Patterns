package com.leonardo.designpatterns.factorymethod.concreteobjs;

public class SmtpEmailService implements EmailService{

	public void sendHTMLEmail() {
		System.out.println("Sending a real e-mail using a smtp server.");		
	}

}
