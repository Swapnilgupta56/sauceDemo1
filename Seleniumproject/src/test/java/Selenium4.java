import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium4 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		
		WebElement dropdown=driver.findElement(By.xpath("//select[@name=\"country\"]"));
		
		Select drpdown=new Select(dropdown);
		
		driver.findElement(By.partialLinkText("contact")).click();
		
		//drpdown.selectByVisibleText("India");
		
		//driver.findElement(By.xpath("//select[@name=\"country\"]/option[4]")).click();
		
		/*List<WebElement> options=driver.findElements(By.xpath("//select[@name=\"country\"]/option"));
		
		for(WebElement single_option:options)
		{
			System.out.println(single_option.getText());
		}*/

	}

}
