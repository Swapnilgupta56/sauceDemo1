package TestNGdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_dropdown {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://erail.in/");
		
		WebElement box=driver.findElement(By.xpath("//input[@id='txtStationFrom']"));
		box.clear();
		
		box.sendKeys("del");
		
		List<WebElement> values=driver.findElements(By.xpath("//div[@class='autocomplete']/div"));
		
		for(WebElement i:values)
		{
			System.out.println("nie"+i.getAttribute("title"));
		}
		
		
		

	}

}
