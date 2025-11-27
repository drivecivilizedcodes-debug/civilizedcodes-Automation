package com.manualtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browerlaunch {
	
	public static void main(String[] args) {
		
	
	WebDriver driver = new ChromeDriver();
	
	  driver.navigate().to("www.google.com");
	  System.out.println("Chrome opened");
	  driver.navigate().refresh();

	}
}
