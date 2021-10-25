package com.neotech.review03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class HandlingFrames extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		//https://the-internet.herokuapp.com/iframe

		setUp();
		
		//1st way switching by index
//		driver.switchTo().frame(0);
		
//		2nd way, switching by Id or by Name
//		driver.switchTo().frame("mce_0_ifr");
		
		//3rd way switching by WebElement
		WebElement frameElement = driver.findElement(By.id("mce_0_ifr"));
		driver.switchTo().frame(frameElement);
		
		driver.findElement(By.id("tinymce")).sendKeys("What's up Flori.");
		Thread.sleep(2000);
		
		//This will raise an exception, because focus inside the frame but this link(web element) is outside the frame
//		driver.findElement(By.linkText("Elemental Selenium")).click();
		//So we have to switch the focuse to the main page
		
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Elemental Selenium")).click();
		
		Thread.sleep(2000);
		
		tearDown();
		
		//Hw --> Go to https://the-internet.herokuapp.com/nested_frames
		//Go to the frame with name frameset-middle
		//go to the frame with index 1 
		//Check that the text of the body is MIDDLE
	}

}
