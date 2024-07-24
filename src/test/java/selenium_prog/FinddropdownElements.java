package selenium_prog;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FinddropdownElements {
	void findelements() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.co.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.linkText("Gmail")).click();
	
	

}
	public static void main(String[] args) {
		FinddropdownElements fdde=new FinddropdownElements();
		fdde.findelements();
	}
	}

