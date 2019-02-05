package com.mes.lib.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;


public class StoreData {
public static void toproperties(String fileName,String key,String value,String comment)
{
	try {
		File f=new File("./config-data"+fileName+".properties");
		FileInputStream fis=new FileInputStream(f);
		Properties prop=new Properties();
		prop.load(fis);
		prop.put(key, value);
		FileOutputStream fos=new FileOutputStream(f);
		prop.store(fos, comment);
	}
	catch(Exception e){
		e.printStackTrace();		
	}
}
}
