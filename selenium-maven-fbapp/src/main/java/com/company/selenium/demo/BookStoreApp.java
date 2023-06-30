package com.company.selenium.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BookStoreApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		    WebDriverManager.chromedriver().setup(); 
		
		
			// Launching Chrome Browser Instance
			WebDriver driver = new ChromeDriver();

			// Open URL using get() method
			driver.get("http://localhost:8090");

		
		
		
		
		
		
		
		
	}

}
