package Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class basic2 {
	@Test(enabled=false)
	public void Demo1() 
	{
		System.out.println("Hello world2");
	}
	@Test(dependsOnMethods={"Demo4"})
	public void abssss() 
	{
		System.out.println("hello world3");
	}
	@Parameters({"testurl1"})
	@Test()
	public void Demo4(String url1) 
	{
		System.out.println("Hello world4");
		System.out.println(url1);
	}

}
