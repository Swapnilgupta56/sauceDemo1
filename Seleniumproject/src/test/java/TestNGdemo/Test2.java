package TestNGdemo;

import org.testng.annotations.*;

public class Test2 
{
	@BeforeMethod
	void testing1()
	{
		System.out.println("Under testing1 method");
	}
	
	@Test
	void testing2()
	{
		System.out.println("Under testing2 method");
	}
	
	@Test
	void testing5()
	{
		System.out.println("Under testing5 method");
	}
	
	@Test
	void testing4()
	{
		System.out.println("Under testing4 method");
	}
	@AfterMethod
	void testing3()
	{
		System.out.println("Under testing3 method");
	}
	
}
