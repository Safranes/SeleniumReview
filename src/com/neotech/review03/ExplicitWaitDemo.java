package com.neotech.review03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class ExplicitWaitDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
//		url=https://www.seleniumeasy.com/test/jquery-download-progress-bar-demo.html
	
	setUp();
	
	WebElement startDownload=driver.findElement(By.id("downloadButton"));
	startDownload.click();
	
	
	
	Thread.sleep(2000);
	
	
	tearDown();
	
	
	}

}
