package com.neotech.review05;

import org.openqa.selenium.By;

import com.neotech.utils.CommonMethods;

public class ScreenshotExample extends CommonMethods {

	//https://opensource-demo.orangehrmlive.com/
	public static void main(String[] args) {
		
		setUp();
		
		sendText(driver.findElement(By.id("txtUsername")), getAlertText());
		sendText(null, getAlertText());
		
		
	}

}
