package JavaPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbApplication {

	public static void main(String[] args) {
	
		// Setting the property of chrome browser and passing chrome driver path 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikra\\Downloads\\chromedriver.exe");
		
		//Launching Chrome Browser Instance
		WebDriver dirver = new ChromeDriver();
		
		
		

	}

}
