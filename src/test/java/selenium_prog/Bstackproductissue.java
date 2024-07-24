package selenium_prog;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Bstackproductissue {
	void methods_bstack() throws InterruptedException{
	//Lunch chrome driver
			WebDriver driver = new ChromeDriver();
			Thread.sleep(1000);
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
			Select select=new Select(uname);
			select.selectByVisibleText("demouser");
			WebElement pwd=driver.findElement(By.xpath("//div[@id='password']//div[@class=' css-tlfecz-indicatorContainer']"));
			Select sel=new Select(pwd);
			sel.selectByVisibleText("testingisfun99");
			driver.findElement(By.xpath("//button[@id='login-btn']")).click();
	}
	public static void main(String[] args) throws InterruptedException {
		Bstackproductissue bsp=new Bstackproductissue();
		bsp.methods_bstack();
	}
}