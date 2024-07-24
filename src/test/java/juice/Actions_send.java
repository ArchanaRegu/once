package juice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actions_send {
	 public static void main(String[] args) throws InterruptedException {

	      // Initiate the Webdriver
	      WebDriver driver = new ChromeDriver();

	      // adding implicit wait of 15 secs
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	      // Opening the webpage where we will identify an element
	      driver.get("https://www.tutorialspoint.com/selenium/practice/register.php");

	      // Identify the first input box with xpath locator
	      WebElement e = driver.findElement(By.xpath("//*[@id='firstname']"));
	      WebElement s = driver.findElement(By.xpath("//*[@id='lastname']"));
	      // enter some text
	      e.sendKeys("Archana");
	      e.sendKeys(Keys.CONTROL,"a");
	      e.sendKeys(Keys.CONTROL,"c");
	      
	      s.sendKeys(Keys.CONTROL,"v");
	      e.sendKeys(Keys.CONTROL,"a");
	      e.sendKeys(Keys.BACK_SPACE);
}}
