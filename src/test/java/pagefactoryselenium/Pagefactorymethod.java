package pagefactoryselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Pagefactorymethod {
	public static WebDriver driver=new ChromeDriver();
	String URL="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	@FindBy(xpath="//*[contains(@class,oxd-sheet)]/p[text()='Username : Admin']")WebElement cop_admin;
	@FindBy(name="username")WebElement username; 
	@FindBy(name="password")WebElement password; 
	@FindBy(xpath="//button[@type='submit']")WebElement login_btn;
	@FindBy(xpath="//span[contains(@class,oxd-main-menu-item--name)][text()='My Info']")WebElement my_info;
	@FindBy(name="firstName")WebElement firstname; 
	@FindBy(name="middleName")WebElement middlename; 
	@FindBy(name="lastName")WebElement lastname; 
 	@FindBy(xpath="//label[text()='Employee Id']/../..//input")WebElement Employeename; 
	@FindBy(xpath="//label[text()='Other Id']/../..//input")WebElement Otherid; 
	@FindBy(xpath="//label[text()='License Expiry Date']/../../../..//div[2]/input[@class='oxd-input oxd-input--active']")WebElement Driver_lincense;
	@FindBy(xpath="//label[text()='License Expiry Date']/../../../..//div[1]/input[@class,'oxd-input oxd-input--active']")WebElement Lincense_expire_date;
	@FindBy(xpath="//label[text()='Nationality']/../..//i[contains(@class,'oxd-select-text--arrow')]")WebElement dd_nationality;
	@FindBy(xpath="//label[text()='Nationality']/../..//div[contains(@class,'oxd-select-wrapper')]")WebElement nationality;
	
	@BeforeMethod
	public void get_url() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(URL);
		Thread.sleep(1000);
		PageFactory.initElements(driver, this);
	}
	@Test
	public void get_details() throws InterruptedException {
		Thread.sleep(2000);
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		login_btn.click();
		Thread.sleep(2000);
		//Actions act=new Actions(driver);
		//act.moveToElement(my_info).click().perform();
		my_info.click();
		Thread.sleep(2000);
//		firstname.click();
		//firstname.sendKeys(Keys.ENTER);
		firstname.sendKeys(Keys.CONTROL,"a");
		firstname.sendKeys(Keys.BACK_SPACE,"Archana");
		Thread.sleep(2000);
//		middlename.click();
		middlename.sendKeys(Keys.CONTROL,"a");
		middlename.sendKeys(Keys.BACK_SPACE,"Alekaya");
		Thread.sleep(2000);
		
		lastname.sendKeys(Keys.CONTROL,"a");
		lastname.sendKeys(Keys.BACK_SPACE,"annavaram");
		Thread.sleep(2000);
		
		Employeename.sendKeys(Keys.CONTROL,"a");
		Employeename.sendKeys(Keys.BACK_SPACE,"Pranavi");
		Thread.sleep(2000);
		
		Otherid.sendKeys(Keys.CONTROL,"a");
		Otherid.sendKeys(Keys.BACK_SPACE,"5678923");
		Thread.sleep(2000);
		
		Driver_lincense.sendKeys(Keys.CONTROL,"a");
		Driver_lincense.sendKeys(Keys.BACK_SPACE,"56785");
		Thread.sleep(2000);
		
		Lincense_expire_date.sendKeys(Keys.CONTROL,"a");
		Lincense_expire_date.sendKeys(Keys.BACK_SPACE,"2025-08-03");
		Thread.sleep(2000);
		dd_nationality.click();
		Thread.sleep(2000);
		List<WebElement>nationalityOfEachElement=nationality.findElements(By.cssSelector("oxd-select-text-input"));
		for(WebElement element:nationalityOfEachElement) {
			System.out.println(element.getText());
		}
		
		
	}
}
