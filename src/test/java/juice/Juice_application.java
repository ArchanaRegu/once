package juice;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Juice_application {
	static WebDriver driver;
	
	static WebElement navigate_btn;
	static String address,country_name,state_name,random_name,city_name;
	static String zipcod,ph;
	static String rand1;
	static String rand2;
	static String card_name;
	
	void juice_order() throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://juice-shop.herokuapp.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement dismiss_btn=driver.findElement(By.cssSelector(".close-dialog > .mat-button-wrapper > span"));
		dismiss_btn.click();
		 Thread.sleep(5000);
		 //• Please login to the website and add one or two items to basket (from each page) – scroll, navigate and select product
		 WebElement account_click=driver.findElement(By.xpath("//button[@id='navbarAccount']/span/span"));
		 account_click.click();
		 Thread.sleep(3000);
//login page	
		 WebElement login_btn=driver.findElement(By.xpath("//button[@id='navbarLoginButton']/span"));
		 login_btn.click();
		 Thread.sleep(3000);
		 driver.findElement(By.id("email")).sendKeys("bejjanki@gmail.com");
		 Thread.sleep(5000);
		 driver.findElement(By.id("password")).sendKeys("bejjanki");
		 Thread.sleep(5000);
		 driver.findElement(By.cssSelector("#loginButton > .mat-button-wrapper")).click();
		 Thread.sleep(3000);
		 try {
		 driver.findElement(By.xpath("//mat-grid-tile[2]/div/mat-card/div[2]/button/span/span")).click();
		 }catch(NoSuchElementException ne){
			 System.out.println(ne.getMessage());
			 
		 }
		 Thread.sleep(3000);
		 navigate_btn=driver.findElement(By.cssSelector(".mat-paginator-navigation-next .mat-paginator-icon"));
		 new Actions(driver).scrollToElement(navigate_btn).perform();
		 
		 try {
			 if(driver.findElement(By.id("cookieconsent:desc")).isDisplayed()){
			   driver.findElement(By.xpath("//a[@class='cc-btn cc-dismiss']")).click();
			   Thread.sleep(2000);
			   	 }}
		catch(NoSuchElementException ne) {
				 System.out.println(ne.getMessage());
			 }
		 Thread.sleep(3000);
		 navigate_btn.click();
		 Thread.sleep(5000);
//Add items to cart		 
		 add_tocart();
//		 Thread.sleep(3000);	 
		 WebElement cart = driver.findElement(By.xpath("//button[@class='mat-focus-indicator buttons mat-button mat-button-base ng-star-inserted']"));
		 cart.click();
		 Thread.sleep(3000);
		 //• Go to your basket and increase the quantity of all items by 2
		 Go_to_basket();
		 Thread.sleep(2000);
		 //checkoutbutton
//Press checkout and add a new address (for all inputs generate random values using code and don’t hard code)

         driver.findElement(By.cssSelector("#checkoutButton span")).click();
         driver.findElement(By.xpath("//span[text()='Add New Address']")).click();
         Thread.sleep(2000);
         new_Address_page();
        
         }
//new_address_page	
       void new_Address_page() throws InterruptedException {
    	   random_sauce();
    	   //enter country name
    	   Thread.sleep(5000);
    	   driver.findElement(By.cssSelector("input[data-placeholder='Please provide a country.']")).sendKeys(country_name);
    	    //name
    	   driver.findElement(By.cssSelector("input[data-placeholder='Please provide a name.']")).sendKeys(random_name);
    	   String addre_name=random_name; 	
    	   //mobile number
    	   Thread.sleep(2000);
    	   driver.findElement(By.cssSelector("input[data-placeholder='Please provide a mobile number.']")).sendKeys(ph);
    	   //zipcode
    	   Thread.sleep(2000);
    	   
    	   driver.findElement(By.cssSelector("[data-placeholder='Please provide a ZIP code.']")).sendKeys(zipcod);
    	   //address
    	   
    	   driver.findElement(By.cssSelector("[data-placeholder='Please provide an address.']")).sendKeys(address);
    	      	   //city
    	   driver.findElement(By.cssSelector("[data-placeholder='Please provide a city.']")).sendKeys(city_name);
    	   
    	   //state
    	   driver.findElement(By.cssSelector("input[data-placeholder='Please provide a state.']")).sendKeys(state_name);
    	   driver.findElement(By.cssSelector("#submitButton .material-icons")).click();
    	   Thread.sleep(5000);
//click the last element address   	   
           WebElement ele=driver.findElement(By.xpath("//mat-table[@class='mat-table cdk-table ng-star-inserted']"));
       	 
           List<WebElement>elements=ele.findElements(By.xpath("//mat-row"));
           for(WebElement element:elements)
       	{
       		//System.out.println(element.getAttribute("innerHTML"));
       		System.out.println(element.getText().equals("QdleWDPQdleWDPQdleWDP, Napervillie, California, 31284"));
       		System.out.println(elements.getLast().getText());
       	}
           Thread.sleep(4000);
           elements.getLast().click();
           driver.findElement(By.xpath("//span[text()='Continue']")).click();
 //selcting fast shipping          
           Thread.sleep(2000);
           driver.findElement(By.xpath("//*[@data-icon='shipping-fast']")).click();
           driver.findElement(By.xpath("//span[text()='Continue']")).click();
           Thread.sleep(2000);
           driver.findElement(By.xpath("//mat-panel-description[text()=' Add a credit or debit card ']")).click();
           Thread.sleep(2000);
           addres();
           driver.findElement(By.xpath("//mat-panel-description[text()=' Add a credit or debit card ']")).click();
           Thread.sleep(4000);
//selecting first address           
           WebElement ele1=driver.findElement(By.xpath("//*[@class='mat-table cdk-table']"));
           List<WebElement>elemens=ele1.findElements(By.xpath("//mat-row[@class='mat-row cdk-row ng-star-inserted']/mat-cell/mat-radio-button"));
           Thread.sleep(2000);
           elemens.getFirst().click();
           Thread.sleep(3000);
           driver.findElement(By.xpath("//span[text()='Continue']")).click();
           Thread.sleep(3000);
           driver.findElement(By.xpath("//span[text()='Place your order and pay']")).click();
           
           
       }
 //     
       
          public void addres() throws InterruptedException {
           
           random_sauce();
           Thread.sleep(5000);
           driver.findElement(By.xpath("//mat-label[text()='Name']/../../label[contains(@class,mat-form-field-label )")).sendKeys(random_name);
           Thread.sleep(3000);
           driver.findElement(By.xpath("//mat-label[text()='Card Number']/../../*[contains(@class,mat-form-field-label-wrapper )]")).sendKeys(ph);
           Thread.sleep(3000);
           Select dropdown=new Select(driver.findElement(By.xpath("//mat-label[text()='Expiry Month']/../../*[contains(@class,mat-form-field-label-wrapper )]")));
           dropdown.selectByValue(rand1);
           Thread.sleep(3000);
           WebElement error=driver.findElement(By.xpath("//*[text()=' Please enter a valid sixteen digit card number. '] "));
           if(error.isDisplayed()){
        	   System.out.println(error.getText());
        	   Thread.sleep(3000);
        	   WebElement card=driver.findElement(By.xpath("//mat-label[text()='Card Number']/../../*[contains(@class,mat-form-field-label-wrapper )]"));
        	   card.clear();
        	   card.sendKeys(card_name);
        	   Thread.sleep(2000);
        	         	       	   
           }
           
           Thread.sleep(2000);
           Select dropdown_year=new Select(driver.findElement(By.xpath("//mat-label[text()='Expiry Year']/../../*[contains(@class,mat-form-field-label-wrapper )]")));
           dropdown_year.selectByValue(rand2);
           Thread.sleep(2000);
           driver.findElement(By.xpath("//button[@id='submitButton']")).click();
           Thread.sleep(2000);
           
    	   
       }
              
//selecting random values       
       static void random_sauce() throws InterruptedException {
	    Random rand=new Random();
	     int rand_int1=rand.nextInt(10);
	    rand1=Integer.toString(rand_int1);
	    int rand_int2=rand.nextInt(2080,2099);
	    rand2=Integer.toString(rand_int2);
    	String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
        	         + "abcdefghijklmnopqrstuvxyz";
		StringBuilder sb=new StringBuilder(7);
		for(int i =0;i<7;i++) {
		int index=(int)(AlphaNumericString.length()*Math.random());
		sb.append(AlphaNumericString.charAt(index));
		}
		String Number_String="123456789";
		StringBuilder b=new StringBuilder(16);
		for(int i =0;i<16;i++) {
		int index=(int)(Number_String.length()*Math.random());
		b.append(Number_String.charAt(index));
		}
		card_name=b.toString();
		address=sb+""+sb+""+sb;
		 String name_random=sb+"";
		
		String num="123456789";
		city_name="Napervillie";
		
		StringBuilder phone_number=new StringBuilder(10);
		for(int i =0;i<10;i++) {
		int index=(int)(num.length()*Math.random());
		phone_number.append(num.charAt(index));
		
		}
		ph=phone_number.toString();
		System.out.println(phone_number);
		
		StringBuilder zipcode=new StringBuilder(5);
		for(int i=0;i<5;i++) {
			int index=(int)(num.length()*Math.random());
			zipcode.append(num.charAt(index));
			
		}
		zipcod=zipcode.toString();
		System.out.println("z="+zipcode);
		String[] name= {"ArchanaRegu","AnithaPatel","AlekyaPandhiri","Pavaniphiyadh","VanithaReddy","SunithaPallavi","RajaGhandhi"};
		
		int index=(int)(name.length*Math.random());
		//name
		random_name=name[index].toString();
		System.out.println(random_name);
		country_name="United States";
		ArrayList<String>state=new ArrayList<String>();
		state.add("Alabama");
		state.add("Alaska");
		state.add("Arizona");
		state.add("Illinois");
		state.add("Texas");
		state.add("Idaho");
		state.add("California");
		state.add("Colarado");
		state.add("Delaware");
		state.add("Ohio");
		
		int index_value=(int)(state.size()*Math.random());
		
		state_name=state.get(index_value).toString();
}
       
//changing all items quantity to 2 in the basket       
         void Go_to_basket() throws InterruptedException {
        	 WebElement table=driver.findElement(By.xpath("//mat-table[@class='mat-table cdk-table']"));
             List<WebElement>tags=table.findElements(By.xpath("//mat-row/mat-cell/button/span"));
             //data-icon="minus-square"
             List<WebElement>items=table.findElements(By.xpath("//*[@style='font-size: initial;']"));
             for(WebElement tag:tags) {
            	 System.out.println(tag.getAttribute("innerHTML"));
            	 System.out.println(tag.getCssValue("data-icon"));           
            	         }
             System.out.println(tags.size());
             Thread.sleep(5000);

             int i=0;
             
             while(i<items.size()) {
            	 List<WebElement>item=table.findElements(By.xpath("//*[@style='font-size: initial;']"));
            	 int number = Integer.parseInt(item.get(i).getText());
                 System.out.println(number);
                 Thread.sleep(3000);
                 int count=number;
                 boolean x=true;
                 while(x) {
                	 if(count<2) {
                		 
                         List<WebElement>plus=table.findElements(By.cssSelector("[data-icon='plus-square']"));
                		 Thread.sleep(1000);
                		 plus.get(i).click();
                		 count++;
                		 System.out.println("Item added by 1");
                         Thread.sleep(1000);
                	 }
                	 else if(count>2) {
                		 Thread.sleep(1000);
                		 List<WebElement>minus=table.findElements(By.cssSelector("[data-icon='minus-square']"));
                		 minus.get(i).click();
                		 count--;
                		 System.out.println("Item sub by 1");
                         Thread.sleep(2000);
                	 	}
                	 
                	 else {
                	 	System.out.println("Done with product #" + (i+1) + "in cart. Exiting While Loop");
                	 	x = false;
                	 	}
                 }
                 System.out.println("count= "+count);
            	 i++;
            	 }
         }
		 
		 
		 /*
		  
		 

		
		 • Select the address and any delivery speed

		 • Add a new card, try to add a fake coupon (10 digits) and verify error message. Select card, review and place the order.

		 • Verify in Account, order history -> print order, track order

		 • Then logout from the application
		 		  */
	void add_tocart() throws InterruptedException {
		 //add shirt to cart in 2nd page
		
		 WebElement shirt=driver.findElement(By.xpath("//img[@alt='OWASP Juice Shop CTF Girlie-Shirt']/../../..//div/button/span/span"));
		 new Actions(driver).scrollToElement(shirt).perform();
		 shirt.click();
		 System.out.println("Girlie-Shirt is out of stock");
		 Thread.sleep(5000);
		 WebElement juice=driver.findElement(By.xpath("//img[@alt='OWASP Juice Shop Hoodie']/../../..//div/button/span/span"));
		 new Actions(driver).scrollToElement(juice).perform();
		 juice.click();
		 Thread.sleep(3000);
		 
		 new Actions(driver).scrollToElement(navigate_btn).perform();
		 navigate_btn.click();
		 Thread.sleep(3000);
		 
		 WebElement tatto=driver.findElement(By.xpath("//img[@alt='OWASP Juice Shop Temporary Tattoos (16pcs)']/../../..//div/button/span/span"));
		 new Actions(driver).scrollToElement(tatto).perform();
		 tatto.click();
		 Thread.sleep(3000);
		
	}
		 

		 
	
	public static void main(String[] args) throws InterruptedException {
		Juice_application obj=new Juice_application();
		obj.juice_order();
	}

}
