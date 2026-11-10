package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import jdk.javadoc.doclet.Reporter;

public class Base {
	
	public WebDriver driver;
	@BeforeMethod()
	
	public void launchbrowser()
	{
		driver= new ChromeDriver();
		
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		
		
		driver.manage().window().maximize();
		
		driver.navigate().refresh();
	}

}
