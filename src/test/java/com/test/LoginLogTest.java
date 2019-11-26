package com.test;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.xml.XmlSuite;

public class LoginLogTest implements IReporter {

	WebDriver driver;
	Logger log=Logger.getLogger(LoginLogTest.class);
	
	@BeforeMethod
	public void setUp(){
		System.setProperty("webdriver.chrome.driver","D:/Selenium files/chromedriver_win32 _Latest/chromedriver.exe");
	   	 driver=new ChromeDriver();
log.info("***************Launching Browser***********************");
Reporter.log("Browser is launching");

	   	driver.get("https://cd-test.veriforce.net/");
	   	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   	log.warn("***************Warning message*************************");
	   	log.fatal("****************Fatal message*******************");
	   	log.debug("***************Debug message******************");
	   	Reporter.log("Logged In System");
	   	
	}
	
	@Test
	public void titleTest(){
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Verisource");
	}
	
	@AfterMethod
	
	public void tearDown(){
		driver.quit();
	}

	public void generateReport(List<XmlSuite> arg0, List<ISuite> arg1,
			String arg2) {
		// TODO Auto-generated method stub
		
	}
	}
	





