package TestNGdemo;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Test1 {
  @Test(priority=1)
  public void openApp() 
  {
	  System.out.println("Testing 1");
  }
  
  @Test(priority=2)
  void login()
  {
	  
  }
  
  @Test(priority=3)
  void logout()
  {
	  System.out.println("Testing 3");
  }
  
  
}


