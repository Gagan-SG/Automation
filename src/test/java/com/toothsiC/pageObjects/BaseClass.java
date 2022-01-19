package com.toothsiC.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.toothsiC.Utilities.ReadConfig;

public class BaseClass {
	ReadConfig readconfig=new ReadConfig();
	public String Testurl =readconfig.getTestsitename();
	public String username=readconfig.getusername();
	public String password=readconfig.getpassword();
	public String otp=readconfig.getotp();
	public static WebDriver driver;
	
//	@Parameters("browser")
	@BeforeClass
	
	public void preconditions(@Optional("chrome")String brw) {
//		if(brw.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver=new ChromeDriver();
//		}
//		else if(brw.equalsIgnoreCase("firefox")) {
//			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//Drivers//geckodriver.exe");
//			driver=new FirefoxDriver();
//		}
		driver.get(Testurl);
}
	@AfterClass
	public void postconditions()
	{
		driver.quit();
	}
}
