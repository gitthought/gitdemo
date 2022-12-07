package Test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class basic {

	@Test(groups= {"smoke"})
	public void Demo() 
	{
		System.out.println("Hello world");
	}
	@AfterTest
	public void Demo2() 
	{
		System.out.println("Demo2");
	}
	@AfterSuite
	public void afsuite()
	{
		System.out.println("I am the no.1 from last");
	}
}
