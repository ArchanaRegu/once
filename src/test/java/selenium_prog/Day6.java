package selenium_prog;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day6 {
	WebDriver driver=new ChromeDriver(); 
	void Bstack_demo() throws InterruptedException {
		
		driver.get("https://bstackdemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
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
	    
	    WebElement udropdown=driver.findElement(By.id("username"));
	    udropdown.click();
	    List<WebElement>options=udropdown.findElements(By.tagName("div"));
	    Thread.sleep(1000);
	    
	    for(WebElement option:options) {
	    	if("demouser".equals(option.getText()))
	    		option.click();
	    	}
	    
	    Thread.sleep(5000);
	    WebElement pwd=driver.findElement(By.xpath("//div[@id='password']/..//div[@class=' css-1hwfws3']"));
	    pwd.click();
	   
	    
	    List<WebElement>pwdoptions=pwd.findElements(By.tagName("div"));
	    for(WebElement pwdoption:pwdoptions) {
	    	if("testingisfun99".equals(pwdoption.getText()))
	    		pwdoption.click();
	    }
	    
	    Thread.sleep(3000);
	    WebElement login_btn=driver.findElement(By.id("login-btn"));
	    login_btn.click();
	}    
	
	
	public static void main(String[] args) throws InterruptedException {
		Day6 bsd=new Day6();
		bsd.Bstack_demo();
		
	}

}
