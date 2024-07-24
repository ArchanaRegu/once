package testSuit1;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Module1 {
	@BeforeMethod
	public void beforMethod() {
		System.out.println("before method");
		
		
	}
	@DataProvider
	public Object[][] data001(){
		Object[][] data= {{"vijay","pass001"},{"bharathi","pass002"}};
		return data;
	}
	@Test(dataProvider = "data001")
	public void login(String username,String password) {
		System.out.println(username+" and "+password);
	}
	@Test
   public void test1() {
	   System.out.println("I am executing test001");
   }
	
	@Test(groups = {"smoke","sanity"})
   public void test2() {
	   System.out.println("I am executing test002");
	  // Assert.assertEquals(false, true);
   }
	@Test
   public void test3() {
	   System.out.println("I am executing test003");
	   Reporter.log("I am executing test003");
   }
	@AfterMethod
	public void aftermethod(){
		System.out.println("I am executing after method");
	}
}
