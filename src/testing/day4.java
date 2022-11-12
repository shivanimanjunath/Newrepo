package testing;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day4 {
	
	
	@Test
	public void Holiday()

	{
		System.out.println("Holiday");
	}
	
	@BeforeMethod
	public void Gift()

	{
		System.out.println("Beforemethod");
	}

	@Test
	public void Sweets()

	{
		System.out.println("Sweets");
	}
	
	
	@Test
	public void Happy()

	{
		System.out.println("Happy");
	}
	
	
}
