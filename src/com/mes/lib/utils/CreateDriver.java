package com.mes.lib.utils;





import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class CreateDriver {
	public static WebDriver getDriverInstance()
	{
		WebDriver driver=null;
		String browser=Getdata.fromProperties("cofiguration","browser");
		String url=Getdata.fromProperties("cofiguration","url");
		System.out.println("na");
		if(browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./browser-exe/chromedriver.exe");
			driver=new ChromeDriver();	
			System.out.println("na");
		}
		else if(browser.equalsIgnoreCase("ie"))
		{
		System.setProperty("webdriver.ie.driver","./browser-exe/IEDriverServer.exe");	
		driver=new InternetExplorerDriver();
		System.out.println("na1");
		}
		else
		{
			System.err.println
			(".....invalid browser option please check"+"the value in configuration.properties file.....");
			}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		if(url.equalsIgnoreCase("test"))
		{
			String test_url=Getdata.fromProperties("cofiguration","test_url");
			driver.get(test_url);
			System.out.println(test_url);
			}
		else if(url.equalsIgnoreCase("prod"))
		{
			String prod_url=Getdata.fromProperties("cofiguration","prod_url");
			driver.get(prod_url);
			System.out.println("prod_url");
		}
		return driver;
	}

}
