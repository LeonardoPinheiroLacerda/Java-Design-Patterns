package com.leonardo.designpatterns.factorymethod.env;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Env {

	private final static Properties ENV = new Properties();
	
	private final static Logger LOG = Logger.getLogger("Env");
	
	static {
		try {
			ENV.load(new FileInputStream(new File("src/main/resources/env.properties")));
			LOG.log(Level.INFO, "Env file was loaded successfully.");
		} catch (IOException e) {
			System.out.println("Your env file was not found.");
		}
	}
	
	public static String getProfile() {
		return ENV.get("active.profile").toString();
	}
	
}
