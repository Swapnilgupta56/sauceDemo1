import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class Selenium3 {

	public static void main(String[] args) 
	{
		
		ChromeOptions options=new ChromeOptions();
		options.setHeadless(true);
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.navigate().to("https://www.google.com");
		System.out.println("Current URL is:"+ driver.getCurrentUrl());
		
		//URL myurl=new URL("https://www.google.com");
		
		driver.navigate().to("https://www.flipkart.com");
		System.out.println("Current URL is:"+ driver.getCurrentUrl());
		
		driver.navigate().back();
		System.out.println("Current URL is:"+ driver.getCurrentUrl());
		
		driver.navigate().forward();
		System.out.println("Current URL is:"+ driver.getCurrentUrl());
		
		driver.close();
		
		
	

	}

}
