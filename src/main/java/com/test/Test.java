package com.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Test {
	public static void main(String[] args) throws IOException {		
	FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir")+"\\Config\\Config.properties");
	Properties properties = new Properties();
	properties.load(fileInputStream);
	Object object = properties.get("username");
	String value = (String)object;
	System.out.println(value);
	}

}
