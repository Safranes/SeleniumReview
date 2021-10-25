package com.neotech.review02;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class LoginOrangeHRM extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		//Login to oOrange HRM Web Application
		//https://opensource-demo.orangehrmlive.com/
		
//		STEPS
//		1put the url in the file
		//extends BaseClass
		//use Setup and Teardown methods
		//Do your test between Setup and Teardown
		
		setUp();
		
		driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");
		driver.findElement(By.cssSelector("#txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.cssSelector("input#btnLogin")).submit();
		Thread.sleep(3000);
		tearDown();

	}

}
