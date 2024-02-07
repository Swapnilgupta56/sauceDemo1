package commerceos.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registrationpage_fashion {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\\\"layout-container\\\"]/div/entry-create-personal-form/form/div[2]/peb-form-background/div/two-column-form/div/peb-form-field-input[1]/div/div/div/input")
	private WebElement txtbx_firstname;
	@FindBy(xpath="//*[@id=\"layout-container\"]/div/entry-create-personal-form/form/div[2]/peb-form-background/div/two-column-form/div/peb-form-field-input[2]/div/div/div/input")
	private WebElement txtbx_lastname;
	@FindBy(xpath="//*[@id=\\'layout-container\\']/div/entry-create-personal-form/form/div[2]/peb-form-background/div/peb-form-field-input[1]/div/div/div/input[1]")
	private WebElement txtbx_email;
	@FindBy(xpath="//*[@id=\"layout-container\"]/div/entry-create-personal-form/form/div[2]/peb-form-background/div/peb-form-field-input[2]/div/div/div/input[1]")
	private WebElement txtbx_password;
	@FindBy(xpath="//*[@id=\"layout-container\"]/div/entry-create-personal-form/form/div[2]/peb-form-background/div/peb-form-field-input[3]/div/div/div/input[1]")
	private WebElement txtbx_confirmpass;
	@FindBy(xpath="//*[@type='submit']")
	private WebElement submit_btn;
	@FindBy(xpath="//*[@id=\"layout-container\"]/div/entry-default-business-registration/entry-create-business-form/form/peb-form-background/div/peb-form-field-input/div/div/div/input")
	private WebElement Business_name;
	@FindBy(xpath="//*[@id=\"layout-container\"]/div/entry-default-business-registration/entry-create-business-form/form/peb-form-background/div/two-column-form/div/peb-form-field-input/div/div/div/input")
	private WebElement Mobile;
	@FindBy(xpath="//*[@id=\"layout-container\"]/div/entry-default-business-registration/button")
	private WebElement sign_up;
	@FindBy(xpath="/html/body/app-root/app-lazy/user-dashboard/base-dashboard/div/div/div/widgets-layout/div/div/apps-widget/pe-widget/div/div/div[1]/div[2]/pe-widget-icons/div/div/div/div[1]")
	private WebElement check_out;
	@FindBy(xpath="/html/body/app-root/app-lazy/user-dashboard/base-dashboard/div/div/div/widgets-layout/div/div/apps-widget/pe-widget/div/div/div[1]/div[2]/pe-widget-icons/div/div/div/div[2]")
	private WebElement connect;
	@FindBy(xpath="/html/body/app-root/app-lazy/user-dashboard/base-dashboard/div/div/div/widgets-layout/div/div/apps-widget/pe-widget/div/div/div[1]/div[2]/pe-widget-icons/div/div/div/div[3]")
	private WebElement products;
	@FindBy(xpath="/html/body/app-root/app-lazy/user-dashboard/base-dashboard/div/div/div/widgets-layout/div/div/apps-widget/pe-widget/div/div/div[1]/div[2]/pe-widget-icons/div/div/div/div[4]")
	private WebElement transactions;
	@FindBy(xpath="/html/body/app-root/app-lazy/user-dashboard/base-dashboard/div/div/div/widgets-layout/div/div/apps-widget/pe-widget/div/div/div[1]/div[2]/pe-widget-icons/div/div/div/div[6]")
	private WebElement shop;
	@FindBy(xpath="/html/body/app-root/app-lazy/user-dashboard/base-dashboard/div/div/div/widgets-layout/div/div/apps-widget/pe-widget/div/div/div[1]/div[2]/pe-widget-icons/div/div/div/div[17]")
	private WebElement settings;
	
	public Registrationpage_fashion(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void registrationpage(String first_name, String last_name, String email, String pass, String con_pass)
	{
		txtbx_firstname.sendKeys(first_name);
		txtbx_lastname.sendKeys(last_name);
		txtbx_email.sendKeys(email);
		txtbx_password.sendKeys(pass);
		txtbx_confirmpass.sendKeys(con_pass);
		submit_btn.click();
	}
	
	public void businessinfo(String businessname, String mobile_number)
	{
		Business_name.sendKeys(businessname);
		Mobile.sendKeys(mobile_number);
		sign_up.click();
	}
	
	public void verify_apps()
	{
		if(check_out.isDisplayed() && connect.isDisplayed() && products.isDisplayed() && transactions.isDisplayed() && shop.isDisplayed() && settings.isDisplayed())
		{
			System.out.println("All the required Elements are Displayed");
		}
		else
		{
			System.out.println("Required Elements are not displayed");
		}
		
	}

}
