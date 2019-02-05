package com.mes.test.smoke;

import org.testng.annotations.Test;

import com.mes.lib.utils.CreateDriver;


import org.testng.annotations.BeforeMethod;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TestSample {
	WebDriver driver;
 
  @BeforeMethod
  public void beforeMethod() {
	  driver=CreateDriver.getDriverInstance();
		  }
  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }
	 @Test
	public void test_sample() {
		 String actTitle=driver.getTitle();
		String expTitle="Google";
		System.out.println(actTitle);
		 Assert.assertEquals(actTitle, expTitle);
			  
		  }

}
