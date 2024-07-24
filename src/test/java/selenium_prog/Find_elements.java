package selenium_prog;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Find_elements {
    void un_ol() throws InterruptedException {
    	//ArrayList<String>only_events=new ArrayList<String>();
    	WebDriver driver=new ChromeDriver();
    	driver.get("https://www.python.org ");
    	driver.manage().window().maximize();
    	WebElement event=driver.findElement(By.className("event-widget"));
    	String event_title=event.getText();
    	String[] events=event_title.split("\n");
    	System.out.println(events[0]);
    	
    	List<WebElement>only_time=driver.findElements(By.cssSelector(".event-widget li time"));
    	System.out.println(only_time.size());
    	List<WebElement>only_event=driver.findElements(By.cssSelector(".event-widget li a"));
    	System.out.println(only_event.size());
    	
    	for(int i=0; i<only_time.size();i++) {
    		System.out.print(only_time.get(i).getText()+"  ");
    		System.out.print(only_event.get(i).getText()+"\n");
    	  	
    	}
    	Thread.sleep(5000);
    	WebElement doc=driver.findElement(By.xpath("//div[@class='container']/nav[@id='mainnav']/ul[@role='menubar']/li[@id='documentation']"));
    	List<WebElement>doc_items=doc.findElements(By.cssSelector("ul li a"));
    	for(WebElement doc_item:doc_items) {
    		System.out.println("doc_items:"+doc_item.getAttribute("innerHTML"));
    		   	}
    	
    	
    	   	
    	
    }
    public static void main(String[] args) throws InterruptedException {
		Find_elements ele=new Find_elements();
		ele.un_ol();
	}
}
