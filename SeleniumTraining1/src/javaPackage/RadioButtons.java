package javaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class RadioButtons {
	
	public static void main(String[] args) throws Exception {

		// Setting the property of chrome browser and passing chromedriver path
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikra\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@id, 'u_0')]")).click();
		
		//1st Way
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='1']")).click(); //Female
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='2']")).click(); //Male
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='-1']")).click(); //Custom
		
		//2nd way
		List<WebElement> radios = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("Total Radio Buttons : " + radios.size());
		System.out.println(radios.get(0).isSelected()); //False
		System.out.println(radios.get(1).isEnabled()); //True
		System.out.println(radios.get(2).isSelected()); //True
		Thread.sleep(2000);
		radios.get(1).click(); //Male
		Thread.sleep(2000);
		System.out.println(radios.get(2).isSelected()); //False
		
		//3rd Way
		List<WebElement> radios1 = driver.findElements(By.xpath("//label[@class='_58mt']"));
		System.out.println("Total Radio Button Text : " + radios1.size());
		/*String expresult = "Female";
		for(int i = 0 ;  i < radios1.size() ;  i++) {
			if(radios1.get(i).getText().equalsIgnoreCase(expresult)) {
				radios1.get(i).click();
				System.out.println(expresult + " Clicked");
				break;*/
       
		/*String expresult = "Custom";
		for(int i = 0 ;  i < radios1.size() ;  i++) {
			if(radios1.get(i).getText().equalsIgnoreCase(expresult)) {
				radios1.get(i).click();
				System.out.println(expresult + " Clicked");
				break; */
				
		String expresult = "Male";
	    for(int i = 0 ;  i < radios1.size() ;  i++) {
		    if(radios1.get(i).getText().equalsIgnoreCase(expresult)) {
			   radios1.get(i).click();
			   System.out.println(expresult + " Clicked");
			 break;
			}
		}
				
	}

}
