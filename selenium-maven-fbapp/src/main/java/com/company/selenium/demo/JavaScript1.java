package com.company.selenium.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScript1 {

	public static void main(String[] args) throws Exception {
		
		//Setting the property of Chrome Browser
				WebDriverManager.chromedriver().setup();  
		     
				// Launching Chrome Browser Instance
				WebDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();
				//Implicit Wait
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.get("https://www.facebook.com/");
				
				//JavascriptExecutor Interface
				JavascriptExecutor jse = (JavascriptExecutor) driver;
				
				//Locate Web Element using Javascript
				jse.executeScript("document.getElementById('email').value='Hani@gmail.com'");
				jse.executeScript("document.getElementById('pass').value='Hani123'");
				
				//Scroll Down Using Javascript
				Thread.sleep(2000);
				jse.executeScript("window.scrollBy(0, 500)");
				
				//Scroll Up Using Javascript
				Thread.sleep(2000);
				jse.executeScript("window.scrollBy(0, -500)");
				
			

	}

}
