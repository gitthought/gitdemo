import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement curr= driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown= new Select(curr);
		dropdown.selectByIndex(1);
		System.out.println((dropdown.getFirstSelectedOption()).getText());
		dropdown.selectByVisibleText("USD");
		System.out.println((dropdown.getFirstSelectedOption()).getText());
		dropdown.selectByValue("AED");
		System.out.println((dropdown.getFirstSelectedOption()).getText());
		

	}

}

