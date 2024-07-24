package selenium_prog;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class HelloWorld {
	public static void main(String[] args) {
	//System.setProperty("webdriver.chrome.driver","/Users/bhara/eclipse-workspace/Hello_Selenium/src/test/resources/drivers/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.numpyninja.com");
    WebElement contactElement=driver.findElement(By.cssSelector("a div div #comp-l19k7i034label "));
    contactElement.click();
    WebElement fname=driver.findElement(By.name("first-name"));
    fname.sendKeys("Alekya");
    WebElement lname=driver.findElement(By.name("last-name"));
    lname.sendKeys("pandhiri");
    WebElement email=driver.findElement(By.name("email"));
    email.sendKeys("random@gmail.com");
    WebElement phone=driver.findElement(By.name("phone"));
    phone.sendKeys("87564590385");
    try {
		Thread.sleep(3);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
		Thread.currentThread().interrupt();
	}
    WebElement text1=driver.findElement(By.cssSelector("#comp-l1c0ku07 textarea"));
    text1.sendKeys("when next session class will start? ");
    try {
		Thread.sleep(5);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
		Thread.currentThread().interrupt();
	}
    WebElement sent=driver.findElement(By.cssSelector("#comp-l1c0ku0e3 > button > span"));
    sent.click();
        
}}
