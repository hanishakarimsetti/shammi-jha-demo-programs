package com.company.selenium.demo;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PopupHandling {

	public static void main(String[] args) throws Exception {
		//Setting the property of Chrome Browser
		WebDriverManager.chromedriver().setup();  
     
		// Launching Chrome Browser Instance
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/browser-windows/");
		
		//Tab Handling
		Thread.sleep(2000);
		driver.findElement(By.id("tabButton")).click();
		
		//Get the total no of open tabs/windows
		Set<String> allWindowsID = driver.getWindowHandles();
		System.out.println(allWindowsID);
		
	     Iterator<String> abc = allWindowsID.iterator();
		 String win1 = abc.next();
		 String win2 = abc.next();
		 
		 //Print the title of Parent window
		 driver.switchTo().window(win1);
		 System.out.println("Parent Window ID :-" + win1); //Alphanumeric ID of Parent Window
		 System.out.println(driver.getTitle()); //Title Of Parent Window
		 
		 {/* //Print the Current Url of child tab
		 Thread.sleep(2000);
		 driver.switchTo().window(win2);
		 Thread.sleep(2000);
		 System.out.println("Child Tab ID :-" + win2); //Alphanumeric ID of Child Tab
		 System.out.println(driver.getCurrentUrl()); //Current Url Of Child Tab
		 
		 //Step 2 - Windows/Popup Handling
		 Thread.sleep(2000);
		 driver.switchTo().window(win1);
		 Thread.sleep(2000);
		 driver.findElement(By.id("windowButton")).click();
		 
		 // Print the title of child window
		 Thread.sleep(2000);
		 driver.switchTo().window(win2);
		 Thread.sleep(2000);
		 System.out.println("Child Window ID :-" + win2); //Alphanumeric ID of Child Window
		 System.out.println(driver.getTitle()); // Get Title Of Child Window
		 Thread.sleep(2000);
		 driver.quit(); // Close Parent Window as well as all associated window
		 System.out.println("Windows Popup And Tab Handled"); */} // If we use these lines of code the Window ID and Popup ID are printing as same
		 
		//Print the Current Url of child tab
		 Thread.sleep(2000);
		 driver.switchTo().window(win2);
		 Thread.sleep(2000);
		 System.out.println("Child Tab ID :-" + win2); //Alphanumeric ID of Child Tab
		 System.out.println(driver.getCurrentUrl()); //Current Url Of Child Tab
		 driver.close();
		 
		 //Step 2 - Windows/Popup Handling
		 Thread.sleep(2000);
		 driver.switchTo().window(win1);
		 Thread.sleep(2000);
		 driver.findElement(By.id("windowButton")).click();
		 
		 // Print the title of child window
		 Set<String> allWindowsID2 = driver.getWindowHandles();
		 System.out.println(allWindowsID2);
		 Iterator<String> abc1 = allWindowsID2.iterator();
		 String win3 = abc1.next();
		 String win4 = abc1.next();
		 Thread.sleep(2000);
		 driver.switchTo().window(win4);
		 Thread.sleep(2000);
		 System.out.println("Child Window ID :-" + win4); //Alphanumeric ID of Child Window
		 System.out.println(driver.getTitle()); // Get Title Of Child Window
		 Thread.sleep(2000);
		 driver.quit(); // Close Parent Window as well as all associated window
		 System.out.println("Windows Popup And Tab Handled");
		 
		 
		 
		 }

}
