package com.manualtest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;



public class AlertsTest {

	public static void main(String[] args) throws InterruptedException {
		// simple alerts 
		
		WebDriver driver =new ChromeDriver();

			
		driver.manage().window().maximize();
		
		driver.get("https://www.civilizedcodes.in/p/samplealerts.html");
		
		Thread.sleep(1000);
		
		WebElement element = driver.findElement(By.id("simpleAlertBtn"));
		element.click();
		
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();

		alert.accept();
		
		Thread.sleep(2000);

		//confirmation alert
				
		WebElement element1 = driver.findElement(By.xpath("//button[@id='confirmAlertBtn']"));
		element1.click();
				
		Thread.sleep(2000);

		alert.dismiss();
		
		 Thread.sleep(2000);
		
		//prompt alerts
		
			WebElement element2 = driver.findElement(By.xpath("//button[@id='promptAlertBtn']"));
		element2.click();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert();
		
		alert.sendKeys("Confirm");
		
		Thread.sleep(1000);
		
		alert.accept();
		
		driver.quit();
		

	}

}
