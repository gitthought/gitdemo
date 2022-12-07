package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class basic3 {
	@Parameters({"testurl","testurl2"})
	@Test
	public void Demo5(String url, String url2) 
	{
		System.out.println("Hello world5");
		System.out.println(url);
		System.out.println(url2);
	}
	@BeforeSuite
	public void bfsuite()
	{
		System.out.println("I am the no.1");
	}
	@Test(groups= {"smoke"})
	public void Demo7() 
	{
		System.out.println("Hello world7");
	}
	@AfterMethod
	public void bfmethod()
	{
		System.out.println("i will execute eveytime after each method in basic3 class");
	}
	@BeforeClass
	public void bfclass()
	{
		System.out.println("i will execute before class basic3");
	}
	@AfterClass
	public void afclass()
	{
		System.out.println("i will execute after class basic3");
	}
	@Test(dataProvider="getData")
	public void data(String firstname, String lastname)
	{
		System.out.println("i will execute after class basic3");
		System.out.println(firstname);
		System.out.println(lastname);
			
	}
	@DataProvider
	public Object[][] getData()
	{
		//1st combiantion - username password - good credit history= row
		//2nd - username password  - no crdit history
		// 3rd - fraudelent credit history
		Object[][] data= new Object[3][2];
		//1st set 
		data[0][0]="firstsetusername";
		data[0][1]="firstpassword";
		//couloumns in the row are nothing but values for that particualar combination(row)
		
		//2nd set
		data[1][0]= "secondsetusername";
		data[1][1]= "secondpassword";
		
		//3rd set
		data[2][0]="thirdsetusername";
		data[2][1]="thirdpassword";
		return data;
	}
}


