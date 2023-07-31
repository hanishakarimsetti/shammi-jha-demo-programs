package com.company.selenium.demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) {
		
		//Setting the property of Chrome Browser
		WebDriverManager.chromedriver().setup();  
     
		// Launching Chrome Browser Instance
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://money.rediff.com/gainers");
		
		//Create List - All Companies
		List<WebElement> allCompanies = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a")); //Here we used /a in xpath bcz companies are clickable links in table and td[1] used bcz only 1 td tag is there for company list
		System.out.println("Total Companies : " + allCompanies.size());
		
		//Create List - Current Price
		List<WebElement> currentPrice = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]")); //Here /a doesnt req bcz current prices are not links and td[4] bcz 4 td tags there for list for current price.
		System.out.println("Total Current Price : " + currentPrice.size());
		
		String expCompanyName = "Delton Cables";
		for (int i = 0 ; i < allCompanies.size(); i++) {
			if(allCompanies.get(i).getText().equalsIgnoreCase(expCompanyName)) {
			   System.out.println(allCompanies.get(i).getText() + "===" + currentPrice.get(i).getText());
			   allCompanies.get(i).click();
			   break;
			}
		}


	}

}
