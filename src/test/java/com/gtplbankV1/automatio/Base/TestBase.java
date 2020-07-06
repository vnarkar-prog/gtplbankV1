package com.gtplbankV1.automatio.Base;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.gtplbankV1.automation.utilities.ReadConfig;

public class TestBase {

	public Logger log;
	public static WebDriver driver;
	public ReadConfig readconfig = new ReadConfig();

	public String baseURL = readconfig.getApplicationURL();
	public String username = readconfig.getUserName();
	public String password = readconfig.getUserPassword();

	// @Parameters("browser")
	@BeforeClass
	public void setUp() {
		
		String br="chrome";

		log = Logger.getLogger(TestBase.class);
		PropertyConfigurator.configure("Log4j.properties");
		log.info("**********Execution Started**********");

		if (br.equalsIgnoreCase("chrome")) {
			log.info("Chrome Browser will start");
			System.setProperty("webdriver.chrome.driver", readconfig.getChromeDriverPath());
			driver = new ChromeDriver();
		}

		else if (br.equalsIgnoreCase("firefox")) {
			log.info("Firefox Browser will start");
			System.setProperty("webdriver.gecko.driver", readconfig.getFirefoxDriverPath());
			driver = new FirefoxDriver();

		} else if (br.equalsIgnoreCase("ie")) {
			log.info("IE Browser will start");
			System.setProperty("webdriver.ie.driver", readconfig.getIEDriverPath());
			driver = new InternetExplorerDriver();

		}
		log.info(" Browser has been launched ");
		driver.get(baseURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterClass
	public void tearDown() {
		log.info("**********Execution Completed**********");
		driver.quit();
	}

}
