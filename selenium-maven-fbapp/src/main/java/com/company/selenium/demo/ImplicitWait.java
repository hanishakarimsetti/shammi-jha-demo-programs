package com.company.selenium.demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWait {

	public static void main(String[] args) {
		
		//Setting the property of Chrome Browser
		WebDriverManager.chromedriver().setup();  
		
		// Launching Chrome Browser Instance
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Latest Movies");
		
		//Handling Auto Suggestion
		List<WebElement> AllSuggestions = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		
		for (int i=0; i < AllSuggestions.size(); i++) {
			String expResult = "Latest Movies 2023";
			if (AllSuggestions.get(i).getText().equalsIgnoreCase(expResult)) {
				AllSuggestions.get(i).click();
				break;
			}
		}
		
		


	}

}
