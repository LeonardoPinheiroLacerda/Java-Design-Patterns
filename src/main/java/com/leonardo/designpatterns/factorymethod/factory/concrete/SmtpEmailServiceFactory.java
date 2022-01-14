package com.leonardo.designpatterns.factorymethod.factory.concrete;

import com.leonardo.designpatterns.factorymethod.concreteobjs.SmtpEmailService;
import com.leonardo.designpatterns.factorymethod.concreteobjs.EmailService;

public class SmtpEmailServiceFactory extends EmailServiceFactory{

	public static EmailService create() {
		return new SmtpEmailService();
	}
	
}
