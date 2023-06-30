package javaPackage;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDown {
	public static void main(String[] args) throws Exception {

		// Setting the property of chrome browser and passing chromedriver path
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikra\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(@id, 'u_0')]")).click();
		Thread.sleep(2000);
		
		//1st way for birthmonth dropdown
		List<WebElement> birthMonth = driver.findElements(By.xpath("//select[@id='month']/option"));
		System.out.println("Total Dropdown Values for birthmonth  : " + birthMonth.size());
		birthMonth.get(4).click();  //May
		
		//1st way for birthday dropdown
		Thread.sleep(2000);
		List<WebElement> birthDay = driver.findElements(By.xpath("//select[@id='day']/option"));
		System.out.println("Total Dropdown Values for birthday  : " + birthDay.size());
		birthDay.get(25).click();  //26
		
	   /* //1st way for birthyear dropdown
		Thread.sleep(2000);
		List<WebElement> birthYear = driver.findElements(By.xpath("//select[@id='year']/option"));
		System.out.println("Total Dropdown Values for birthyear : " + birthYear.size());
		birthYear.get(118).click();  //1993 */
		
		// using katalon recorder
	    /*Thread.sleep(2000);
		driver.findElement(By.id("month")).click();
	    new Select(driver.findElement(By.id("month"))).selectByVisibleText("May");
	    driver.findElement(By.id("day")).click();
	    new Select(driver.findElement(By.id("day"))).selectByVisibleText("26");
	    driver.findElement(By.id("year")).click();
	    new Select(driver.findElement(By.id("year"))).selectByVisibleText("1993");*/
		
		//2nd Way
		WebElement bm = driver.findElement(By.xpath("//select[@id='month']"));
		Select month = new Select(bm);
		Thread.sleep(2000);
		month.selectByVisibleText("May"); //May
		Thread.sleep(2000);
		month.selectByValue("4"); //Apr
		Thread.sleep(2000);
		month.selectByIndex(5); //Jun
		System.out.println(month.getFirstSelectedOption().getText()); //Jun current selected value
		
		//3rd Way for Birthmonth , Birthday , BirthYear
		Thread.sleep(2000);
		WebElement bm1 = driver.findElement(By.xpath("//select[@id='month']"));
		Select months = new Select(bm1);
		List<WebElement> dropdown = months.getOptions();
		for ( int i = 0 ; i < dropdown.size() ; i++ ) {
			if (dropdown.get(i).getText().equalsIgnoreCase("Aug")) 
				dropdown.get(i).click();
			    }
		Thread.sleep(2000);
		WebElement bd = driver.findElement(By.xpath("//select[@id='day']"));
		Select day = new Select(bd);
		List<WebElement> dropdown1 = day.getOptions();
		for ( int i = 0 ; i < dropdown1.size() ; i++ ) {
			if (dropdown1.get(i).getText().equalsIgnoreCase("9")) 
				dropdown1.get(i).click();
				 }
		Thread.sleep(2000);
		WebElement by = driver.findElement(By.xpath("//select[@id='year']"));
		Select year = new Select(by);
		List<WebElement> dropdown2 = year.getOptions();
		for ( int i = 0 ; i < dropdown2.size() ; i++ ) {
			if (dropdown2.get(i).getText().equalsIgnoreCase("2019")) 
				dropdown2.get(i).click();
				   
				}
		
	     //4th Way
		bm.sendKeys("Feb");
	
	     //5th Way
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Mar");
		
		//Check if dropdown support multiselection option
		System.out.println(month.isMultiple()); //False
		month.selectByVisibleText("Apr"); //April
		month.selectByValue("12"); //Dec
		month.selectByIndex(7); //Aug
		
	    //Deselect the multiselected values
		month.deselectByVisibleText("Apr"); //April
		month.deselectByValue("12"); //Dec
		month.deselectByIndex(7); //Aug
		month.deselectAll(); //Deselect all selected values
		}
		

				
	}

