package juice;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Fortest {
	   public static void main(String[] args) throws InterruptedException {

	      // Initiate the Webdriver
	      WebDriver driver = new ChromeDriver();

	      // adding implicit wait of 15 secs
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	      // Opening the webpage where we will identify an element
	      driver.get("https://www.tutorialspoint.com/selenium/practice/register.php");

	      // Identify the first input box with xpath locator
	      WebElement e = driver.findElement(By.xpath("//*[@id='firstname']"));

	      // enter some text
	      e.sendKeys("Selenium");

	      // chose the key as per platform
	      Keys k = Platform.getCurrent().is(Platform.MAC) ? Keys.COMMAND : Keys.CONTROL;

	      // object of Actions class to copy then paste
	      Actions a = new Actions(driver);
	      a.keyDown(k);
	      a.sendKeys("a");
	      a.keyUp(k);
	      a.build().perform();
          
	      // Actions class methods to copy text
	      a.keyDown(k);
	      a.sendKeys("c");
	      a.keyUp(k);
	      a.build().perform();
	      
	      // Action class methods to tab and reach to next input box
	      a.sendKeys(Keys.TAB);
	      a.build().perform();
	     
	      // Actions class methods to paste text
	      a.keyDown(k);
	      a.sendKeys("v");
	      a.keyUp(k);
	      a.build().perform();

	      // Identify the second input box with xpath locator
	      WebElement s = driver.findElement(By.xpath("//*[@id='lastname']"));

	      // Getting text in the second input box
	      String text = s.getAttribute("value");
	      System.out.println("Value copied and pasted: " + text);

	      // Closing browser
	      
	   }
	}

