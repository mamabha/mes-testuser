package com.mes.lib.utils;

import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


public class Getdata {
	WebDriver driver;
	public static String fromProperties(String fileName, String key) {
		
		
		String data=null;
	  try
	  {
	File f=new File("./config-data/"+fileName+".properties");
	 System.out.println(f);
	  FileInputStream fis=new FileInputStream(f);
	  System.out.println(fis);
	  Properties prop=new Properties();
	  prop.load(fis);
	  data = prop.get(key).toString();
	  System.out.println(data);
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
	return data;
	
	  }
  
  }
