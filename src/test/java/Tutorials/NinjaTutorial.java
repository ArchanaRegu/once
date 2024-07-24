package Tutorials;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NinjaTutorial {
	 static WebDriver driver=new ChromeDriver();
	 public static void main(String[] args) throws InterruptedException {
    	 NinjaTutorial obj=new NinjaTutorial();
    	 obj.ninja();
    	 
    	 
	}
     void ninja() throws InterruptedException {
    	 
    	 driver.get("http://tutorialsninja.com/demo/index.php");
    	 driver.manage().window().maximize();
    	 //click currency dropdown
    	 Thread.sleep(2000);
    	 WebElement currency=driver.findElement(By.cssSelector(".fa-caret-down"));
    	 currency.click();
    	 //click euro
    	 WebElement Euro=driver.findElement(By.name("EUR"));
    	 Euro.click();
    	 System.out.println("Currency button is success");
    	  	//click Canon EOS 5D
    	 WebElement canonEOS5D=driver.findElement(By.xpath("//img[@title='Canon EOS 5D']"));
    	 canonEOS5D.click();
    	 WebElement select_option=driver.findElement(By.xpath("//select[@id='input-option226']"));
    	 System.out.println(select_option.getText());
    	 System.out.println("no option available in select option.");
    	 //click homepage
    	 homepager();    	 
    	 System.out.println("click to home page button is success.");
    	 //click iphone
    	 WebElement iphone=driver.findElement(By.xpath("//img[@title='iPhone']"));
    	 iphone.click();
    	 WebElement quantity=driver.findElement(By.xpath("//input[@name='quantity']"));
    	 System.out.println(quantity.getAttribute("value"));
    	 quantity.clear();
    	 quantity.sendKeys("2");
    	 Thread.sleep(2000);
    	 driver.findElement(By.xpath("//button[@id='button-cart']")).click();
    	 System.out.println("success message");
    	 Thread.sleep(2000);
    	 //click black cart
    	 blackcarter();
    	 System.out.println("clicked black cart");
    	 Thread.sleep(2000);
    	 WebElement cart=driver.findElement(By.cssSelector(".text-right a strong .fa-shopping-cart"));
    	 cart.click();
    	 WebElement change_qutity_iphone=driver.findElement(By.xpath("//span[@class='text-danger']/../..//input[@class='form-control']"));
    	 change_qutity_iphone.clear();
    	 change_qutity_iphone.sendKeys("3");
    	 //click update
    	 WebElement iphone_update=driver.findElement(By.xpath("//i[@class='fa fa-refresh']"));
    	 iphone_update.click();
    	 System.out.println("clciked update");
    	 //print vat and eco tax
    	 ArrayList<WebElement>total=(ArrayList<WebElement>)driver.findElements(By.xpath("//div[@class='col-sm-4 col-sm-offset-8']"));
         for(WebElement tax:total) {
        	 String b=tax.getText();
        	 //System.out.println(b);
        	 String[] c=b.split("\n");
        	 System.out.println(c[1]+"\n"+c[2]);
        	         	 
         }
        
         WebElement error_message = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
         boolean co=true;
         int count=0;
         while(co) {
         if(error_message.isDisplayed()) 
        	 count=count+1;{
        	 System.out.println("Products marked with *** are not available in the desired quantity or not in stock!");
           	 driver.findElement(By.id("cart-total")).click();
           	 driver.findElement(By.xpath("//tr[1]/td/button[@title='Remove']")).click();
             count=count-1;
         if(count==0) {
        	  co=false;
         }
        }}
         Thread.sleep(2000);
         homepager();
         System.out.println("Returned to homepage.");
         driver.findElement(By.xpath("//a[text()='Laptops & Notebooks']")).click();         	 
    	 driver.findElement(By.xpath("//a[text()='Show AllLaptops & Notebooks']")).click();
    	 driver.findElement(By.xpath("//a[text()='HP LP3065']/../../..//button/i[@class='fa fa-shopping-cart']")).click();
    	 Thread.sleep(2000);
    	 WebElement date=driver.findElement(By.xpath("//input[@data-date-format='YYYY-MM-DD']"));
    	 date.clear();
    	 date.sendKeys("2024-06-30");
    	 driver.findElement(By.xpath("//button[text()='Add to Cart']")).click();
    	 blackcarter();
    	 //click view cart
    	 Thread.sleep(2000);
    	 driver.findElement(By.cssSelector("strong i.fa-shopping-cart")).click();
    	 //use coupons and send keys
    	 WebElement usecoupon=driver.findElement(By.xpath("//a[text()='Use Coupon Code ']"));
    	 usecoupon.click();
    	 Thread.sleep(2000);
    	 WebElement coupon_text_box=driver.findElement(By.cssSelector(".input-group #input-coupon"));
    	 coupon_text_box.sendKeys("ABCD123");
    	 Thread.sleep(2000);
    	 WebElement ApplyCoupon=driver.findElement(By.cssSelector("#button-coupon.btn-primary"));
    	 ApplyCoupon.click();
    	 Thread.sleep(2000);
    	 WebElement warning=driver.findElement(By.xpath("//div[text()=' Warning: Coupon is either invalid, expired or reached its usage limit!']"));
    	 if(warning.isEnabled()) {
       		 System.out.println(warning.getText());
       		 coupon_text_box.click();
      		 coupon_text_box.clear();
      		 usecoupon.click();
    	 }
    	 Thread.sleep(2000);
    	  //gift certificate
    	WebElement gift_certificate=driver.findElement(By.xpath("//a[text()='Use Gift Certificate ']"));
    	gift_certificate.click();
    	Thread.sleep(1000);
    	WebElement gift_text_box=driver.findElement(By.cssSelector("#input-voucher"));
    	gift_text_box.click();
    	gift_text_box.sendKeys("AXDFGH123");
    	WebElement Apply_gift_certificate=driver.findElement(By.cssSelector("#button-voucher.btn-primary"));
    	Apply_gift_certificate.click();
    	
   	    if(warning.isEnabled()) {
   		 System.out.println(warning.getText());
   		 Thread.sleep(2000);
   		 gift_text_box.click();
    	 gift_text_box.clear();
    	 gift_certificate.click();
   		    	 }
   	    //click checkout
   	    driver.findElement(By.xpath("//a[text()='Checkout']")).click();
   	    Thread.sleep(2000);
   	    checkout_page();
   	    Thread.sleep(2000);
   	    addresspage();
   	    Thread.sleep(2000);
   	    
    			 }
     String random_sauce() throws InterruptedException {
    		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    		         + "0123456789"
    		         + "abcdefghijklmnopqrstuvxyz";
    		StringBuilder sb=new StringBuilder(7);
    		for(int i =0;i<7;i++) {
    		int index=(int)(AlphaNumericString.length()*Math.random());
    		sb.append(AlphaNumericString.charAt(index));
    		}
    		String s=sb+"@gmail.com";
    		//System.out.println(s);
    		return s;
     }
     void checkout_page() throws InterruptedException {
    	 driver.findElement(By.xpath("//div/label[text()='Register Account']")).click();
         driver.findElement(By.xpath("//input[@value='Continue']")).click();
     }
     void addresspage() throws InterruptedException {    
         WebElement fname=driver.findElement(By.name("firstname"));
         fname.click();
         fname.sendKeys("Archana");
         WebElement lname=driver.findElement(By.id("input-payment-lastname"));
         lname.click();
         lname.sendKeys("Bejjanki");
         WebElement company_name=driver.findElement(By.name("company"));
         company_name.click();
         company_name.sendKeys("jhkhkl");
         WebElement email=driver.findElement(By.id("input-payment-email"));
         email.click();
         email.sendKeys("dgfchsh@gmail.com");
         Thread.sleep(2000);
         WebElement address1=driver.findElement(By.id("input-payment-address-1"));
         address1.click();
         address1.sendKeys("hsjdhj");
         Thread.sleep(2000);
         WebElement address2=driver.findElement(By.id("input-payment-address-2"));
         address2.click();
         address2.sendKeys("ghsadfchj");
         Thread.sleep(2000);
         WebElement telephone=driver.findElement(By.id("input-payment-telephone"));
         telephone.click();
         Thread.sleep(2000);
         telephone.sendKeys("66879889");
         driver.findElement(By.id("input-payment-city")).sendKeys("Illinois");
         driver.findElement(By.id("input-payment-password")).sendKeys("Illinois");
         driver.findElement(By.id("input-payment-confirm")).sendKeys("Illinois");
         driver.findElement(By.id("input-payment-postcode")).sendKeys("60444");
         Thread.sleep(2000);
         Select objselect=new Select(driver.findElement(By.id("input-payment-country")));
         objselect.selectByVisibleText("United States");
         Thread.sleep(2000);
         Select objselectstate=new Select(driver.findElement(By.id("input-payment-zone")));
         objselectstate.selectByVisibleText("Illinois");
         Thread.sleep(2000);
         //select QAfox checkbox and shipping address
         WebElement checkboxQafoxnewsletter=driver.findElement(By.id("newsletter"));
         if(!checkboxQafoxnewsletter.isSelected())
        	 checkboxQafoxnewsletter.click();
         Thread.sleep(2000);
         WebElement checkboxAddressSame=driver.findElement(By.name("shipping_address"));
         if(!checkboxAddressSame.isSelected())
        	 checkboxAddressSame.click();
//click agree policy checkbox
         driver.findElement(By.name("agree")).click();
         Thread.sleep(1000);
         //click continue button
         driver.findElement(By.cssSelector("input#button-register")).click();
         Thread.sleep(3000);
         WebElement warning_alert=driver.findElement(By.xpath(" //div[@class='alert alert-danger alert-dismissible']"));
         String mail_id=random_sauce();
         Thread.sleep(2000);
         if(warning_alert.isEnabled()) {
        	 email.clear();
        	 email.sendKeys(mail_id);
        	 Thread.sleep(1000);
        	 driver.findElement(By.cssSelector("input#button-register")).click();
            	
         }
         
         Thread.sleep(2000);//NoAlertPresentException
         try {
        	 Alert al=driver.switchTo().alert();
        	 al.dismiss();
         }catch(NoAlertPresentException ne) {
        	System.out.println("Alert not displayed");
        	System.out.println(ne.getStackTrace());
         }
        
         Thread.sleep(2000);
         WebElement delivery_continue=driver.findElement(By.id("button-shipping-address"));
    	 delivery_continue.click();
    	 Thread.sleep(2000);
         stepDeleiverdetails();
         Thread.sleep(2000);
     }
     
     void stepDeleiverdetails() throws InterruptedException {
    	 
    	 
    	 driver.findElement(By.name("comment")).sendKeys("gsdfjhs gkuasgj gfiuewyf gjhg jhl 3t");
    	 driver.findElement(By.id("button-shipping-method")).click();
    	 //driver.findElement(By.id("button-payment-method")).click();
    	 Thread.sleep(2000);
 		 driver.findElement(By.xpath("//input[@name='agree']")).click();
    	 driver.findElement(By.id("button-payment-method")).click();
    	 Thread.sleep(2000);
    	 driver.findElement(By.linkText("Contact Us")).click();
         driver.findElement(By.id("input-enquiry")).sendKeys("Sucessfull Transaction Done");
         Thread.sleep(1000);
         driver.findElement(By.xpath("//input[@value='Submit']")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("//a[text()='Continue']")).click();
         driver.quit();
    	 
     }
     void blackcarter() {
    	 WebElement black_cart=driver.findElement(By.cssSelector("#cart-total"));
    	 black_cart.click();
     }
     void homepager() {
    	 WebElement homepage=driver.findElement(By.cssSelector(".fa-home"));
    	 homepage.click();
     }
     
}
