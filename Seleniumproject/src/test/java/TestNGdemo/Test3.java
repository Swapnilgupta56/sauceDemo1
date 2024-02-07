package TestNGdemo;

import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {
	
	WebDriver driver;
	
	@BeforeClass
	void openApp()
	{
	
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test(dataProvider="dp")
	void logintest(String user, String pass)
	{
		System.out.println("Inside the dataprovider method");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(user);
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys(pass);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		Assert.assertTrue(false);
		
		
	}
	
	//@Test
	void search()
	{
		System.out.println("Under the search App method");
	}
	
	@DataProvider(name="dp")
	String [][] datapro()
	{
		String data[][]= { {"swapnil@gmail.com" , "pass1"} ,
				           {"swapn@gmail.com" , "pass2"} ,
				           {"nikki@gmail.com" , "pass3"} ,
				           {"Admin" , "admin123"}
		                 };
		return data;
	}
	
	@AfterClass
	void logout()
	{
		System.out.println("Under the logout method");
		driver.close();
	}
	

}
