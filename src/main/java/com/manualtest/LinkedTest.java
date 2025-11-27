package com.manualtest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LinkedTest {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");

        WebElement element = driver.findElement(By.linkText("Create a Page")); 
        
        element.click();

	}

}
