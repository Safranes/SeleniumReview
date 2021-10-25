package com.neotech.review05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.neotech.utils.CommonMethods;

public class ActionsExample extends CommonMethods {

	public static void main(String[] args) {
		setUp();

		WebElement draggable = driver.findElement(By.id("draggable"));
		WebElement droppable = driver.findElement(By.id("droppable"));

		Actions act = new Actions(driver);
		//act.dragAndDrop(draggable, droppable).perform();
		//Don't forget .perform() at the end
		
		act.clickAndHold(draggable).moveToElement(droppable).release().perform();
		
		wait(2);
		
		// Task
				// In the table below
				// Click and hold on number 2
				// Move to number 7
				// Move to number 11
				// Release
				// See the pattern selected
				
		WebElement num2=driver.findElement(By.name("two"));
		WebElement num7=driver.findElement(By.name("seven"));
		WebElement num11=driver.findElement(By.name("eleven"));
		act.clickAndHold(num2).moveToElement(num7).pause(1000).moveToElement(num11).release().perform();
		
		//can you also show using the second movetoElement??
		act.clickAndHold(num11).moveToElement(num7, 0, 0)
		
		wait(3);
		tearDown();

	}

}
