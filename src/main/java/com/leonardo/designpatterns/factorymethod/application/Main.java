package com.leonardo.designpatterns.factorymethod.application;

import java.io.IOException;

import com.leonardo.designpatterns.factorymethod.concreteobjs.EmailService;
import com.leonardo.designpatterns.factorymethod.env.Env;
import com.leonardo.designpatterns.factorymethod.factory.concrete.EmailServiceFactory;
import com.leonardo.designpatterns.factorymethod.factory.concrete.MockEmailServiceFactory;
import com.leonardo.designpatterns.factorymethod.factory.concrete.SmtpEmailServiceFactory;

public class Main {

	public static void main(String [] args) throws IOException {
		
		String profile = Env.getProfile();
		
		if(profile == null) {
			throw new IOException("active.profile property was not found on the env.properties file.");
		}
		
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
