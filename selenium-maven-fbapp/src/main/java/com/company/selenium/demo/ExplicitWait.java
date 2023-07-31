package com.company.selenium.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {

	public static void main(String[] args) {
		
		//Setting the property of Chrome Browser
				WebDriverManager.chromedriver().setup();  
		     
				// Launching Chrome Browser Instance
				WebDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();
				//Implicit Wait
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.get("https://www.facebook.com/");
				
				//Enter Username
				driver.findElement(By.xpath("//input[@id='email']")).sendKeys("hani@gmail.com");
				
				//Fetch input box attribute value
				System.out.println(driver.findElement(By.xpath("//input[@id='email']")).getAttribute("value"));
				
				//Get Height of inputbox
				System.out.println(driver.findElement(By.xpath("//input[@id='email']")).getSize().getHeight());
				
				//Get width of inputbox
				System.out.println(driver.findElement(By.xpath("//input[@id='email']")).getSize().getWidth());
				
				//Use ExplicitWait to check if password field is visible
				WebDriverWait wt = new WebDriverWait(driver, 30);
				wt.until(ExpectedConditions.visibilityOfElementLocated(By.id("passs"))).sendKeys("Hani");
				// here id passs has a mistake of having extra s, so the result has error such as: no such element
				//implicit wait 30sec applicable for all webelements and explicit wait 30sec will try to find an element for each span of 500 milliseconds
	}

}
