package testing;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day3 {

	
	@AfterMethod
	public void Enjoy()

	{
		System.out.println("AfterMethod");
	}
	

	@Test
	public void Food()

	{
		System.out.println("Food");
	}
	
	@BeforeTest
	public void Gift()

	{
		System.out.println("Gift");
	}
	
	
	
}
