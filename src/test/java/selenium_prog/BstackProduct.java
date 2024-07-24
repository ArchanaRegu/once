package selenium_prog;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BstackProduct {

	public static void main(String[] args) throws InterruptedException{
			
		//Lunch chrome driver
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://bstackdemo.com/");
		driver.manage().window().maximize();
		//adding to cart
		WebElement iphone1=driver.findElement(By.xpath("//div[@id='1']/div[@class='shelf-item__buy-btn']"));
		iphone1.click();
		Thread.sleep(1000);
		WebElement galaxys20=driver.findElement(By.xpath("//div[@id='10']/div[@class='shelf-item__buy-btn']"));
	    galaxys20.click();
	    Thread.sleep(1000);
	    WebElement Pixel4=driver.findElement(By.xpath("//div[@id='17']/div[@class='shelf-item__buy-btn']"));
	    Pixel4.click();
	    Thread.sleep(1000);
	    WebElement oneplus8t=driver.findElement(By.xpath("//div[@id='21']/div[@class='shelf-item__buy-btn']"));
	    oneplus8t.click();
	    Thread.sleep(1000);
	    
	    WebElement check_out=driver.findElement(By.xpath("//div[@class='float-cart__footer']/div[@class='buy-btn']"));
	    check_out.click();
	    Thread.sleep(1000);
		//selecting username
		WebElement uname=driver.findElement(By.xpath("//div[@id='username']//div[@class=' css-tlfecz-indicatorContainer']"));
		uname.click();
		WebElement username=driver.findElement(By.xpath("//div[text()='demouser']"));
		username.click();
		//selecting password
		WebElement pwd=driver.findElement(By.xpath("//div[@id='password']//div[@class=' css-tlfecz-indicatorContainer']"));
		pwd.click();
		WebElement password=driver.findElement(By.xpath("//div[text()='testingisfun99']"));
		password.click();
				
		driver.findElement(By.xpath("//button[@id='login-btn']")).click();
		//entering address
		
		driver.findElement(By.xpath("//input[@id='firstNameInput']")).sendKeys("Radha");
		driver.findElement(By.xpath("//input[@id='lastNameInput']")).sendKeys("Rani");
		driver.findElement(By.xpath("//input[@id='addressLine1Input']")).sendKeys("My address");
		driver.findElement(By.xpath("//input[@id='provinceInput']")).sendKeys("IL");
		driver.findElement(By.xpath("//input[@id='postCodeInput']")).sendKeys("60564");
		//click checkout
		driver.findElement(By.xpath("//button[@id='checkout-shipping-continue']")).click();
		Thread.sleep(2000);
		
		String OrderNo = driver.findElement(By.xpath("//strong")).getText();
		System.out.println("The Order number is: "+OrderNo);
		Thread.sleep(2000);
		 
		driver.findElement(By.xpath("//button[contains(text(),'Continue Shopping')]")).click();
		
		
		driver.findElement(By.xpath("//a[@id='logout']")).click();
		
	
		driver.quit();
		
		
	}

	
}