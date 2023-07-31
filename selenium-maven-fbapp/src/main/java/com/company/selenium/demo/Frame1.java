package com.company.selenium.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class Frame1 {

	public static void main(String[] args) throws Exception {
		//Setting the property of Chrome Browser
				WebDriverManager.chromedriver().setup();  
		     
				// Launching Chrome Browser Instance
				WebDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();
				//Implicit Wait
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.get("https://paytm.com/");
				driver.findElement(By.xpath("//*[text()='Sign In']")).click();
				
				//Find Total Number Of Frames Present
				int allFrames = driver.findElements(By.tagName("iframe")).size();
			    System.out.println("Total Frames :" + allFrames);
			    
			    //Go Inside each frame and check if the element is present
			    for (int i=0; i < allFrames; i++) {
			    	driver.switchTo().frame(i);
			    	Thread.sleep(2000);
			    	driver.findElement(By.xpath("//*[contains(text(),'Watch Video')]")).click();
			    	Thread.sleep(2000);
			    	driver.findElement(By.xpath("//*[contains(text(),'close')]")).click();
			    	
			    }

	}

}
