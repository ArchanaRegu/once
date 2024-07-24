package juice;
//import juice.testing;
public class while_text {
	public static void whi(int x) throws InterruptedException {
		
		boolean some=true;
		while(some) {
			if(x>10) {
				x=x-1;
				
				}
			
			else if(x<10) {
				x=x++;
				
				}
			else {
				some=false;
			}
			
				
			}System.out.println(x);
			testing.random_sauce();
			System.out.println(testing.address);
		    System.out.println(testing.country_name);
		}
		
	
	public static void main(String[] args) throws InterruptedException {
		whi(100);
		testing ob=new testing();
		//ob.random_sauce();
		
		
	}

}
