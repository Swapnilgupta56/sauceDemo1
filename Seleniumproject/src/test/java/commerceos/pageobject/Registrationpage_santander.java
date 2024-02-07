package commerceos.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registrationpage_santander {
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@formcontrolname=\"firstName\"]")
	private WebElement txtbx_firstname;
	@FindBy(xpath="///input[@formcontrolname=\"lastName\"]")
	private WebElement txtbx_lastname;
	@FindBy(xpath="//input[@formcontrolname=\"email\"]")
	private WebElement txtbx_email;
	@FindBy(xpath="//input[@formcontrolname=\"password\"]")
	private WebElement txtbx_password;
	@FindBy(xpath="//input[@formcontrolname=\"confirmPass\"]")
	private WebElement txtbx_confirmpass;
	@FindBy(xpath="//*[@type='submit']")
	private WebElement submit_btn;
	@FindBy(xpath="//input[@class=\"ng-tns-c170-8 ng-untouched ng-pristine ng-invalid\"]")
	private WebElement Business_name;
	@FindBy(xpath="//input[@class=\"ng-star-inserted ng-dirty ng-valid ng-touched\"]")
	private WebElement Mobile;
	@FindBy(xpath="//input[@class=\"ng-tns-c170-14 ng-dirty ng-valid ng-touched\"]")
	private WebElement vat_no;
	@FindBy(xpath=" //button[@type='submit']")
	private WebElement signup;
	@FindBy(xpath="//body/app-root/app-lazy[@class='ng-tns-c311-0 ng-star-inserted']/user-dashboard[@class='ng-tns-c614-15 ng-star-inserted']/base-dashboard[@class='dashboard-container ng-tns-c614-15 ng-star-inserted']/div[@class='dashboard-content-wrapper']/div[@class='dashboard-content dashboard-scroll-wrapper data-grid-scroll-container']/div[@class='dashboard-content-center dashboard-content-desktop']/widgets-layout[@class='ng-star-inserted']/div[@class='widgets-dashboard-wrapper']/div/apps-widget[@class='ng-star-inserted']/pe-widget[@class='ng-star-inserted']/div[@class='theme-transparent ng-star-inserted']/div[@class='widget']/div[@class='widget__content']/div[@class='widget__body']/pe-widget-icons[@class='ng-star-inserted']/div[@class='theme-transparent']/div[@class='icons']/div[@class='icons__links']/div[1]")
	private WebElement checkout;
	@FindBy(xpath="/html/body/app-root/app-lazy/user-dashboard/base-dashboard/div/div/div/widgets-layout/div/div/apps-widget/pe-widget/div/div/div[1]/div[2]/pe-widget-icons/div/div/div/div[2]")
	private WebElement connect;
	@FindBy(xpath="/html/body/app-root/app-lazy/user-dashboard/base-dashboard/div/div/div/widgets-layout/div/div/apps-widget/pe-widget/div/div/div[1]/div[2]/pe-widget-icons/div/div/div/div[3]")
	private WebElement pointofsale;
	@FindBy(xpath="/html/body/app-root/app-lazy/user-dashboard/base-dashboard/div/div/div/widgets-layout/div/div/apps-widget/pe-widget/div/div/div[1]/div[2]/pe-widget-icons/div/div/div/div[4]")
	private WebElement transactions;
	@FindBy(xpath="/html/body/app-root/app-lazy/user-dashboard/base-dashboard/div/div/div/widgets-layout/div/div/apps-widget/pe-widget/div/div/div[1]/div[2]/pe-widget-icons/div/div/div/div[5]")
	private WebElement settings;
	
	public Registrationpage_santander(WebDriver driver)
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
	
	public void businessinfo(String businessname, String mobile_number, String vat_number)
	{
		Business_name.sendKeys(businessname);
		Mobile.sendKeys(mobile_number);
		vat_no.sendKeys(vat_number);
		signup.click();
	}
	
	public void verify_apps()
	{
		if(checkout.isDisplayed() && connect.isDisplayed() && pointofsale.isDisplayed() && transactions.isDisplayed() && settings.isDisplayed())
		{
			System.out.println("All the required Elements are Displayed");
		}
		else
		{
			System.out.println("Required Elements are not displayed");
		}
		
	}

}
