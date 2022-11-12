package testing;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day1 {

	@AfterTest
	public void Name()

	{
		System.out.println("Aftertest");
	}
	
	@Test
	public void Class()

	{
		System.out.println("Class");
	}
	
	@BeforeSuite
	public void Before()

	{
		System.out.println("Beforesuite");
	}
	
}
