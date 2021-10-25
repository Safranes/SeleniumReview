package com.neotech.review04;

import org.openqa.selenium.By;

import com.neotech.utils.CommonMethods;

public class CalendarHandling extends CommonMethods {

	public static void main(String[] args) {
		// https://jqueryui.com/
		
		setUp();
		
		driver.findElement(By.linkText("Datepicker")).click();
		
		wait(1);
		
		
		
		
		
		tearDown();

	}

}
