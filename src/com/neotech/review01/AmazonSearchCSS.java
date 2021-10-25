package com.neotech.review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearchCSS {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		
		String url = "https://www.amazon.com/";
		driver.get(url);
		
		WebElement searchTextbox=driver.findElement(By.cssSelector("input#twotabsearchtextbox"));//.sendKeys(args); OR you can create a variable and store into it then you can call this method
		searchTextbox.sendKeys("tv");
		
		driver.findElement(By.cssSelector("input[id='nav-search-submit-button']")).click();
//		driver.findElement(By.cssSelector("input#nav-search-submit-button")).click();
//		driver.findElement(By.cssSelector("#nav-search-submit-button")).click();

	}

}
