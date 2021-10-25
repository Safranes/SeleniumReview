package com.neotech.review02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class CheckBoxDemo extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		// Go to http://uitestpractice.com/Students/Form
		//Check Single
		//select all the hobbies
		//See if they are selected after  you select each of them
		
		setUp();
		
		List<WebElement> radios=driver.findElements(By.className("radio-inline"));
		radios.get(1).click();
	
		//These will not work with isSelected(); method because it doesn't work with 'label' tag!! It works with'input' tag
//By.cssSelector("label[class*=checkbox-inline]")
//By.xpath(label[@class='checkbox-inline'])
//By.className("checkbox-inline")
		List<WebElement> hobbies=driver.findElements(By.cssSelector("input[type*=checkbox]"));
		for(WebElement hobby: hobbies) {
			hobby.click();
			if(hobby.isSelected()) {
				System.out.println("It is selected");
			}else {
				System.out.println("It is not selected");
			}
		}
		
		Thread.sleep(4000);
		tearDown();
		

	}

}
