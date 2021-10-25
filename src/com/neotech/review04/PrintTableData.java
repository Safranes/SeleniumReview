package com.neotech.review04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

public class PrintTableData extends CommonMethods {

	public static void main(String[] args) {
		// https://the-internet.herokuapp.com/tables

		// I want you to print all the data from the body

		// Task until 1:55
		setUp();
		
		List<WebElement> rows=driver.findElements(By.xpath("//table[2]/tbody/tr"));
		int rowSize=rows.size();
		
		List<WebElement> cols = driver.findElements(By.xpath("//table[2]/tbody/tr[1]/td"));
		int colSize=cols.size();
		
		for(int row=1; row<=rows.size(); row++) {
			
			for(int col=1; col<cols.size(); col++) {
				WebElement data=driver.findElement(By.xpath("//table[2]/tbody/tr["+row+"]/td["+col+"]"));
				System.out.print(data.getText()+" | ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		tearDown();
		
		
		
		
		
	}
}
