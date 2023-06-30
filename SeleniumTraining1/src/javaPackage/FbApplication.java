package javaPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbApplication {

	public static void main(String[] args) throws Exception {

		// Setting the property of chrome browser and passing chromedriver path
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikra\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
		
		//Launching Chrome Browser Instance
		WebDriver driver = new ChromeDriver();
		
		// Open URL using get() method
		driver.get("https://www.facebook.com/");
		
		//Maximize the window
	    Thread.sleep(2000);
		driver.manage().window().maximize();
		
		//Delete all cookies
		Thread.sleep(2000);
		driver.manage().deleteAllCookies();
		
		//Open URL using navigate() method
		Thread.sleep(2000);
		driver.navigate().to("https://www.google.com/");
		
		//Refresh Page
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		//Navigate to back
		Thread.sleep(2000);
		driver.navigate().back();
		
		//Navigate to forward
		Thread.sleep(2000);
		driver.navigate().forward();
		
		//Fetch current URL
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		
		//Get Title Of The WebPage
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		
		//Close the Browser
		Thread.sleep(2000);
		driver.close();
		//System.out.println("User Directory: " + System.getProperty("user.dir"));
	    //System.out.println(System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
     }

}