package com.gtplbankV1.automation.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

	public FileInputStream fis;
	public Properties prop;

	public ReadConfig() {

		File src = new File("./Configurations/Config.properties");

		try {
			fis = new FileInputStream(src);
			prop = new Properties();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		try {
			prop.load(fis);
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public String getApplicationURL() {

		String url = prop.getProperty("URL");
		return url;
	}

	public String getUserName() {

		String username = prop.getProperty("UserId");
		return username;
	}

	public String getUserPassword() {

		String password = prop.getProperty("Password");
		return password;
	}

	public String getChromeDriverPath() {

		String chrome = prop.getProperty("ChromePath");
		return chrome;
	}

	public String getFirefoxDriverPath() {

		String firefox = prop.getProperty("FirefoxPath");
		return firefox;
	}

	public String getIEDriverPath() {

		String ie = prop.getProperty("IEPath");
		return ie;
	}

	public String getNewCustomerDataSheet() {
		String csData = prop.getProperty("NewCustomerDataSheet");
		return csData;
	}
}
