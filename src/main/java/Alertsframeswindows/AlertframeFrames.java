package Alertsframeswindows;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertframeFrames

{
	public WebDriver driver;
	WebDriverWait W1;
    @FindBy(xpath="(//ul[@class=\"list-group rounded\"]/li)[15]")
    WebElement Framesoption;
    

    
    @FindBy(xpath="//a[@target=\"_blank\"]")
    List<WebElement>Seleniumtutorial;
    
    @FindBy(xpath="//h1[text()=\"Selenium - Automation Practice Form\"]")
    List<WebElement>header;
    
 
    
    public void Framesoption() throws InterruptedException
    {
    	Thread.sleep(3000);
    	Framesoption.click();
    }
    
    public void Seleniumtutorial() throws InterruptedException
    {
    	Thread.sleep(3000);
    	driver.switchTo().frame(0);
    	Thread.sleep(3000);
    	int sizetoo =Seleniumtutorial.size();
    	System.out.println(sizetoo);
    	Thread.sleep(3000);
    	WebElement E2 =Seleniumtutorial.get(1);
    	E2.click();
    	
    }
    
   
    	
    	
    	
    
    
    public AlertframeFrames(WebDriver driver)
    {
    	this.driver=driver;
    	PageFactory.initElements(this.driver, this);
    	W1 =new WebDriverWait(driver, Duration.ofSeconds(10));
    	
    }
  
    
    
}
