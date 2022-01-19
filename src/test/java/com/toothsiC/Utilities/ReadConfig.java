package com.toothsiC.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties pobj;

	
	public ReadConfig() {
		File path=new File("./Configuration/Config.properties");
try{
		FileInputStream fis=new FileInputStream(path);
	pobj=new Properties();
		pobj.load(fis);
}
catch (Exception e) {
	System.out.println(e.getMessage());
}
	}
	
	
	public String getTestsitename() {
	String url=pobj.getProperty("TestSiteName");
	return url;
	}
	public String getusername() {
		String username=pobj.getProperty("adminusername");
		return username;	
	}	
	public String getpassword() {
		String password=pobj.getProperty("adminpassword");
		return password;
	}		
	public String getotp() {
		String otp=pobj.getProperty("otp");
		return otp;
	}
}
