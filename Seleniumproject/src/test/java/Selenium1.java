import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
1) Launch browser
2) open url
	URL: https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F
3) Provide username  - admin@yourstore.com
4) Provide password  - admin
5) Click on Login button 
6) Verify the title of dashboard page   
	Exp title : Dashboard / nopCommerce administration
7) Verify Dasboad
*/

public class Selenium1 {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", null);
		
		//WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		 
		driver.manage().window().maximize(); 
		 
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		Thread.sleep(5000);
		
		WebElement user= driver.findElement(By.id("Email"));
		user.clear();
		user.sendKeys("admin@yourstore.com");
		
		
		WebElement pass= driver.findElement(By.id("Password"));
		pass.clear();
		pass.sendKeys("admin");
		
		driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")).click();
		//System.out.println(driver.getTitle());
		
		String exp_title="Dashboard / nopCommerce administration";
		if(exp_title.equals(driver.getTitle()))
		{
			System.out.println("Title verified");
		}
		else
			System.out.println("Title not verified");
		
		String dash = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/h1")).getText();
		
		System.out.println(dash);
		
		driver.quit();

	}

}
