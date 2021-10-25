package com.neotech.review01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommands {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		
		String url = "https://signal-telecom.net/";
		driver.navigate().to(url);
		
		Thread.sleep(1000);
		
		driver.navigate().to("https://github.com/NeotechAcademy");
		
		Thread.sleep(1000);
		
		driver.navigate().back();
		
		Thread.sleep(1000);
		
		driver.navigate().forward();
		
		Thread.sleep(1000);
		
		driver.navigate().refresh();
		
		Thread.sleep(1000);
		
		driver.quit();


		
	}

}
