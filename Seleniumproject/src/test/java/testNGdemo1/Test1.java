package testNGdemo1;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.*;

public class Test1 {

@Test(groups= {"sanity", "regression"})	
void openApp()
{
	
}

@Test(groups= {"sanity"})
void login()
{
	Assert.assertEquals(1, 2);
	Assert.assertTrue(false);
}

@Test
void search()
{
	
}

@Test
void logout()
{
	
}

}
