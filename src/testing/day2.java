package testing;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
	
	

	@Test
	public void Thing()

	{
		System.out.println("Thing");
	}
	
	@BeforeTest
	public void Place()

	{
		System.out.println("BeforeTest");
	}
	
	
	@AfterSuite
	public void Lastsuite()

	{
		System.out.println("AfterSuite");
	}
	

}
