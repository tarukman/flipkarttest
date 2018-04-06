package com.flipkart.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.flipkart.qa.utilities.Testutil;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;

	public TestBase(){
	try {
			FileInputStream ip = new FileInputStream("C:/Test_WS/Flipkart/src/main/java/com/flipkart/qa/configuration/config.properties");
			prop.load(ip);

		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void initialization()
	{
		String browsername=prop.getProperty("browser");
		if (browsername.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver", "/Flipkart/Drivers/chromedriver.exe");
			driver= new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Testutil.page_load_timeout,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Testutil.implicit_timeout, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
}
