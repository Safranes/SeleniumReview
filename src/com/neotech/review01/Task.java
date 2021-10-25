package com.neotech.review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
	// Go to https://demoqa.com/text-box
	// Fill the form and submit
	// Use xPath or CSS Selector
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String url = "https://demoqa.com/text-box";
		driver.get(url);

		driver.findElement(By.cssSelector("#userName")).sendKeys("Enes");
		driver.findElement(By.cssSelector("#userEmail")).sendKeys("ealneaslndfas.@gmail.com");
		driver.findElement(By.cssSelector("#currentAddress")).sendKeys("123 R Pl, Fl");
		driver.findElement(By.cssSelector("#permanentAddress")).sendKeys("123 R Pl, Fl");
		
		driver.findElement(By.cssSelector("#submit")).submit();
		Thread.sleep(2000);
		
		driver.close();

	}
}
