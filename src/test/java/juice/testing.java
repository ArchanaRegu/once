package juice;

import java.util.ArrayList;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testing {
	static String address,country_name,state_name,random_name,city_name;
	static String zipcod,ph;
	
public static void random_sauce() throws InterruptedException {
	String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
	         	         + "abcdefghijklmnopqrstuvxyz";
	StringBuilder sb=new StringBuilder(7);
	for(int i =0;i<7;i++) {
	int index=(int)(AlphaNumericString.length()*Math.random());
	sb.append(AlphaNumericString.charAt(index));
	}
	address=sb+"";
	System.out.println("s="+address);
	String num="123456789";
	city_name="Napervillie";
	
	StringBuilder phone_number=new StringBuilder(10);
	for(int i =0;i<10;i++) {
	int index=(int)(num.length()*Math.random());
	phone_number.append(num.charAt(index));
	}
	String ph=phone_number.toString();
	System.out.println("phone= "+ph);
	StringBuilder zipcode=new StringBuilder(5);
	for(int i=0;i<5;i++) {
		int index=(int)(num.length()*Math.random());
		zipcode.append(num.charAt(index));
		
	}
	zipcod=zipcode.toString();
	System.out.println("z="+zipcode);
	String[] name= {"Archana","Anitha","Alekya","Pavani","Vanitha","Sunitha","Raja"};
	System.out.println(name.length);
	int index=(int)(name.length*Math.random());
	System.out.println(name[index]);
	random_name=name[index].toString();
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
	state.add("Ohaio");
	System.out.println(state);
	System.out.println(state.size());
	int index_value=(int)(state.size()*Math.random());
	System.out.println(index_value);
	System.out.println(state.get(index_value));
	state_name=state.get(index_value).toString();
	jhfksdfhk();
	
}
 static void jhfksdfhk() {
	System.out.println("country_name= "+country_name);
}

void method() throws InterruptedException {
	Random rand=new Random();
	int rand_int=rand.nextInt(1000);
	String ar="archa"+rand_int+"na";
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	Thread.sleep(2000);
	random_sauce();
	WebElement username=driver.findElement(By.id("user-name"));
	username.click();
	username.sendKeys(ar);
	
}
public static void main(String[] args) throws InterruptedException {
	testing ob=new testing();
	//ob.method();
	ob.random_sauce();
	jhfksdfhk();
	
		
}
}
