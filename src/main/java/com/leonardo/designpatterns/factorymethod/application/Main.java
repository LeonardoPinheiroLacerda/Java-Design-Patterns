package com.leonardo.designpatterns.factorymethod.application;

import com.leonardo.designpatterns.factorymethod.concreteobjs.EmailService;
import com.leonardo.designpatterns.factorymethod.env.Env;
import com.leonardo.designpatterns.factorymethod.factory.concrete.EmailServiceFactory;
import com.leonardo.designpatterns.factorymethod.factory.concrete.MockEmailServiceFactory;
import com.leonardo.designpatterns.factorymethod.factory.concrete.SmtpEmailServiceFactory;

public class Main {

	public static void main(String [] args) {
		
		String profile = Env.getProfile();
		
		EmailService service;
		
		if(profile.equals("test"))
			service = MockEmailServiceFactory.create();
		
		else if(profile.equals("dev"))
			service = SmtpEmailServiceFactory.create();
		
		else 
			service = EmailServiceFactory.create();
		
		service.sendHTMLEmail();
		
	}
	
}
