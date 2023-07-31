package com.company.selenium.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseSimulation2 {

	public static void main(String[] args) throws Exception {
		//Setting the property of Chrome Browser
				WebDriverManager.chromedriver().setup();  
		     
				// Launching Chrome Browser Instance
				WebDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();
				//Implicit Wait
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.get("https://jqueryui.com/droppable/");
				
				//Switching Frame
				driver.switchTo().frame(0);
				System.out.println("Switched To Frame");
				
				//Draggable Web Element
				WebElement drag = driver.findElement(By.id("draggable"));
				
				//Droppable Web Element
				WebElement drop = driver.findElement(By.id("droppable"));
				
				//Drag and Drop using Actions Class
				Thread.sleep(2000);
				Actions act = new Actions(driver);
				act.dragAndDrop(drag, drop).build().perform();

				}

}
