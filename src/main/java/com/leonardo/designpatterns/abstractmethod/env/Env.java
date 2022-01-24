package com.leonardo.designpatterns.abstractmethod.env;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class Env {

	private final static Properties ENV = new Properties();
	
	private final static Logger LOG = Logger.getLogger("Env");
	
	static {
		try {
			File file = new File("src/main/resources/env.properties");
			
			if(!file.exists())
				throw new IOException();
			
			ENV.load(new FileInputStream(file));
			
			LOG.log(Level.INFO, "Env file was loaded successfully.");
			
		} catch (IOException e) {
			LOG.log(Level.WARNING, "Env file wasn't found.");
		}
	}
	
	public static String getProfile() {
		return (String) ENV.get("active.profile");
	}
	
}
