package com.neotech.review01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenSignalTelecom {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");	
	WebDriver driver = new ChromeDriver();
	
	String url = "https://signal-telecom.net/";
	driver.get(url);
	
	Thread.sleep(2000);
	
	String currentUrl= driver.getCurrentUrl();
	
	if(currentUrl.equals(url)) {
		System.out.println("Urls are the same");
	}else {
		System.out.println("Urls are different");
	}
	
	System.out.println(driver.getTitle());
	
	driver.close();
	
	
	
	
	}

}
