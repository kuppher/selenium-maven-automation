package com.dice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JobSearch {

		public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().fullscreen();
			driver.get("http://qavalidation.com/demo");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			WebElement Table = driver.findElement(By.id("table01"));
			List<WebElement> Rows = Table.findElements(By.tagName("tr"));
			System.out.println("Number of rows: "+Rows.size());
			
		for(WebElement Row: Rows) {
			List<WebElement> Cols = Row.findElements(By.tagName("td"));
			for(WebElement Col: Cols) {
				System.out.println(Col.getText());
			
			}
		}
		
		Thread.sleep(10000);
		driver.close();
		
		System.out.println("TEST COMPLETED");
			
			
			
		}
	
			
			
			/*
			uh-search-box
			 */
			
			

	}