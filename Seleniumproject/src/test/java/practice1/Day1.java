package practice1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://commerceos.staging.devpayever.com/registration/business");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement firstname= driver.findElement(By.xpath("//input[@formcontrolname=\"firstName\"]"));
		firstname.sendKeys("swapnil");
		
		
		
	}

}
