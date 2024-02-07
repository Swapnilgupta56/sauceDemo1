import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium2 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		
		//driver.findElement(By.name("search")).sendKeys("macbook");
		
		//driver.findElement(By.xpath("//*[@id=\"search\"]/button")).click();
		
		List<WebElement> images= driver.findElements(By.tagName("img"));
		
		System.out.println("No of images: "+images.size());
		
		driver.quit();

	}

}
