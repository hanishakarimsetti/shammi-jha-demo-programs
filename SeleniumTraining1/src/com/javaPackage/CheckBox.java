package com.javaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
	public static void main(String[] args) throws Exception {

		// Setting the property of chrome browser and passing chromedriver path
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikra\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='checkbox'][@name='checkbox1']")).click();
		List<WebElement> CheckBox = driver.findElements(By.xpath("//input[@type='checkbox'][@name='checkbox1']"));
		System.out.println("Total CheckBoxes : " + CheckBox.size());
		String expresult = "Female";
		for(int i = 0 ; i < CheckBox.size() ;  i++) {
			if(CheckBox.get(i).getText().equalsIgnoreCase(expresult)) {
				CheckBox.get(i).click();
				System.out.println(expresult + " Clicked");
				break;
			}

	}

}
}
