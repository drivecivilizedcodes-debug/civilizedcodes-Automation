package com.testng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LinkedTest {
	
	@Test

	public void windowHandling() {
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");

        WebElement element = driver.findElement(By.linkText("Create a Page")); 
        
        element.click();

	}

}
