package com.toothsiC.testCases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.toothsiC.pageObjects.BaseClass;
import com.toothsiC.pageObjects.Login;


public class new_tc_001 extends BaseClass {
	@Test
	public void first() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Login login=new Login(driver);//Driver is being passed as an Argument so that Selenium is able to locate the element on the browser
		login.setusername(username);
		login.setpassword(password);
		login.clickContinue();
		login.setotp(otp);
		login.clickContinue();
		String title = driver.getTitle();
		if(title.equalsIgnoreCase("Dashboard")) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		
		
	}

}
