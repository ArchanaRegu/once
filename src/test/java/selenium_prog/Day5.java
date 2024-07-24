package selenium_prog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day5 {
   public void saucedemo() {
	  
	   WebDriver driver = new ChromeDriver();
	   driver.get("https://www.saucedemo.com/");
	   WebElement t1 = driver.findElement(By.cssSelector("#login_credentials"));
	   String lines = t1.getText();
	   //extracting one line from multiple line
	   String [] new_lines = lines.split("\n");
	   String Uname=new_lines[1];
	   WebElement t2=driver.findElement(By.cssSelector(".login_password"));
	   String lines1=t2.getText();
	   String[] new_lines1=lines1.split("\n");
	   String Pword=new_lines1[1];
	   WebElement username=driver.findElement(By.name("user-name"));
	   username.sendKeys(Uname);
	   WebElement pass_word=driver.findElement(By.name("password"));
	   pass_word.sendKeys(Pword);
	   WebElement login=driver.findElement(By.name("login-button"));
	   login.click();
	   WebElement bag=driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
	   bag.click();
	   WebElement T_shirt=driver.findElement(By.name("add-to-cart-test.allthethings()-t-shirt-(red)"));
	   T_shirt.click();
	   try {
		Thread.sleep(5);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   WebElement cart=driver.findElement(By.cssSelector("#shopping_cart_container a span"));
	   cart.click();
	   WebElement check_out=driver.findElement(By.name("checkout"));
	   check_out.click();
	   WebElement fname=driver.findElement(By.name("firstName"));
	   fname.sendKeys("fdhfd");
	   WebElement lname=driver.findElement(By.name("lastName"));
	   lname.sendKeys("whegfw");
	   WebElement zipcode=driver.findElement(By.name("postalCode"));
	   zipcode.sendKeys("67788");
	   WebElement continues=driver.findElement(By.name("continue"));
	   continues.click();
	   WebElement finish=driver.findElement(By.name("finish"));
	   finish.click();
	   //WebElement back=driver.findElement(By.name("back-to-products"));
	   //back.click();
	   
	     }
      
   public static void main(String[] args) {
	   Day5 obj=new Day5();
	   obj.saucedemo();
}
}
