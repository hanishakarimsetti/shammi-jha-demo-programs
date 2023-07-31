package com.company.selenium.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseSimulation1 {

	public static void main(String[] args) throws Exception {
		//Setting the property of Chrome Browser
		WebDriverManager.chromedriver().setup();  
     
		// Launching Chrome Browser Instance
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class= '_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		
		//Create Electronics Web Element Ref
		WebElement electro = driver.findElement(By.xpath("//*[text()='Electronics']"));
		
		//Mouse Simulation using Actions class
		Actions act = new Actions(driver);
		
		//Mouse Hover to Electronics
		Thread.sleep(2000);
		act.moveToElement(electro).build().perform();
		
		//Keyboard Operations
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		WebElement fash = driver.findElement(By.xpath("//*[text()='Fashion']"));
		Thread.sleep(2000);
		act.sendKeys(fash, Keys.ENTER).build().perform();
		System.out.println("Fashio Option Clicked.");
		


	}

}
