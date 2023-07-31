package com.company.selenium.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {

	public static void main(String[] args) throws Exception {
		// Setting the property of Chrome Browser
		WebDriverManager.chromedriver().setup();

		// Launching Chrome Browser Instance
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/alerts");

		// Alert Handling
		Thread.sleep(2000);
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(2000);

		// Verify Alert Text
		String alertText = driver.switchTo().alert().getText();
		String expAlertText = "Do you confirm action?";
		Assert.assertEquals(alertText, expAlertText);
		System.out.println("Alert text verified");

		// Accept the alert
		driver.switchTo().alert().accept();
		System.out.println("Alert accepted");

		// Dismiss the Alert
		driver.findElement(By.id("confirmButton")).click();
		driver.switchTo().alert().dismiss();
		System.out.println("Alert Dismissed");
	}

}
