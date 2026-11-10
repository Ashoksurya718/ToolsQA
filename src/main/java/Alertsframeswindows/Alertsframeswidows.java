package Alertsframeswindows;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alertsframeswidows {
	
	public WebDriver driver;
	WebDriverWait W1;
	
	@FindBy(xpath="//button[@class=\"accordion-button collapsed\"]")
	List<WebElement> ALertswidows;
	
	@FindBy(xpath="(//ul[@class=\"list-group rounded\"]/li)[13]")
	WebElement Browserwindows;
	
	@FindBy(xpath="//button[contains(text(),\"New Tab\")]")
	WebElement NewTab;
	
	@FindBy(xpath="(//button[contains(text(),\"New Window\")])[1]")
	WebElement Newwindow;
	
	@FindBy(xpath="//button[contains(text(),\"New Window Message\")]")
	WebElement NewWindowMessage;
	
	@FindBy(xpath="//a[@class=\"external-link\"]")
	WebElement tutorialspoint;
	
	public void ALertswidows()
	{
		W1.until(ExpectedConditions.visibilityOfAllElements(ALertswidows));
		int sizecount =ALertswidows.size();
		System.out.println(sizecount);
		
		WebElement E2 =ALertswidows.get(2);
		W1.until(ExpectedConditions.elementToBeClickable(E2));
		E2.click();
		
	}
	
	public void Browserwindows()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		W1.until(ExpectedConditions.elementToBeClickable(Browserwindows));
		Browserwindows.click();
	}
	
	public void NewTab()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		W1.until(ExpectedConditions.elementToBeClickable(NewTab));
		NewTab.click();
	}
	
	public void Newwindow()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		W1.until(ExpectedConditions.elementToBeClickable(Newwindow));
		Newwindow.click();
	}
	
	public void NewWindowMessage()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		W1.until(ExpectedConditions.elementToBeClickable(NewWindowMessage));
		NewWindowMessage.click();
	}
	
	public void tutorialspoint() throws InterruptedException
	{
		Thread.sleep(3000);
		Set<String>S1 =driver.getWindowHandles();
		Iterator<String>S2 =S1.iterator();
		String parent =S2.next();
		String child =S2.next();
		
		driver.switchTo().window(child);
		Thread.sleep(3000);
		tutorialspoint.click();
	}
	
	
     public Alertsframeswidows(WebDriver driver)
     {
    	 this.driver=driver;
    	 PageFactory.initElements(this.driver, this);
    	 W1=new WebDriverWait(driver, Duration.ofSeconds(10));
    	 
     }

}
