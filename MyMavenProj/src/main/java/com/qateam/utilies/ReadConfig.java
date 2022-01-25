package com.qateam.utilies;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties Pro;

	public ReadConfig() {
		File src = new File(
				"C:\\Users\\Abhinay Meshram\\eclipse-workspace\\New Testing Batch\\MyMavenProj\\src\\main\\java\\com\\qateam\\configfile\\config.properties");
		try {
			FileInputStream FileIS = new FileInputStream(src);
			Pro = new Properties();
			Pro.load(FileIS);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public String getAppURl() {
		String baseURl = Pro.getProperty("URL");
		return baseURl;
	}
	public String getemail() {
		String Myemailid = Pro.getProperty("email");
		return Myemailid;
	}
	public String getpassword() {
		String mypass = Pro.getProperty("password");
		return mypass;
	}
}
