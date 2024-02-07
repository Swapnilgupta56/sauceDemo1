package com.website.testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import commerceos.pageobject.Registrationpage_santander;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Commerceos_santander {
	
	
	static WebDriver driver;
	
	public static void main(String args[])
	{
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://commerceos.staging.devpayever.com/registration/santander");
		
		Registrationpage_santander reg_page = new Registrationpage_santander(driver);
		
		reg_page.registrationpage("Swapnil", "Gupta", "Swapnil.gupta56@gmail.com", "Gupta@56", "Gupta@56");
		reg_page.businessinfo("CommerceOS", "1234567890", "123456789");
		
		boolean url_validation= driver.getCurrentUrl().contains("santander");
		System.out.println(url_validation);
		
		if(url_validation==true)
		{
			System.out.println("URL has the word 'santander'");
		}
		else
		{
			System.out.println("URL doesn't have the word 'santander'");
		}
		
		reg_page.verify_apps();
		
		driver.quit();
		
			
	}

}
