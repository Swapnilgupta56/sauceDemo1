import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selenium5 {

	public static void main(String[] args) throws InterruptedException {
		
		//ChromeOptions options=new ChromeOptions();
		//options.setHeadless(true);
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		
		Alert alertwindow = driver.switchTo().alert();
		
		System.out.println(alertwindow.getText());
		
		alertwindow.sendKeys("Welcome");
		Actions act=new Actions(driver);
		
		
		
		Thread.sleep(4000);
		
		alertwindow.accept();
		
		driver.close();
		
		
		

	}

}
