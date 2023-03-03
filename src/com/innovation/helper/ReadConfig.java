package com.innovation.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties properties;
	File sourceFile = new File("./configuration/config.properties");
	
	public String getPropertiesValue() {
		try {
			FileInputStream fis = new FileInputStream(sourceFile);
			properties = new Properties();
			properties.load(fis);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception is " + e.getMessage());
		}
		String url = properties.getProperty("baseURL");
		return url;
	}

}
