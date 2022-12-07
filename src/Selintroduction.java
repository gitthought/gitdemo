import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selintroduction {

	public static void main(String[] args) {
		//Invoking the browser
		//Chrome- ChromeDriver ->Methods
		//Firefox- FirefoxDriver ->Methods
		//Webdriver methods+class methods
		//chomedriver.exe->chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//Firefox
		//geckodriver
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\Downloads\\geckodriver.exe");
		//WebDriver driver= new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();// closes the current window
		//driver.quit(); // closes the all the window
		
		
		
	

	}

}
