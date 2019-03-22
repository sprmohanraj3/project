package com.amazon.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	public static String propFilePath = System.getProperty("user.dir")
			+ "\\src\\test\\reource\\Resources\\configuration.properties";

	public static Properties prop;

	public ConfigReader() throws Throwable {
		try {
			File f = new File(propFilePath);
			FileInputStream fin = new FileInputStream(f);
			prop = new Properties();
			prop.load(fin);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception("File not loaded properly");

		}

	}

	public String getBrowserName() throws Exception {
		String x = prop.getProperty("browserName");
		if (x != null) {
			return x;
		} else {
			throw new Exception("Not a valid prop browser name");
		}
	}
	public String getUrl() throws Throwable {
		String property = prop.getProperty("url");
		if (property != null) {
			return property;
		} else {
			throw new Exception("Not a valid prop browser name");
		}
	}

	public int getImplicitWait() throws Exception {
		String property = prop.getProperty("implicitwait");
		if (property != null) {
			return Integer.parseInt(property);
		} else {
			throw new Exception("Not a valid prop browser name");
		}
	}
}
