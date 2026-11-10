package Alertsframeswindows;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertNestedFrames 

{
	public WebDriver driver;
     @FindBy(xpath="(//ul[@class=\"list-group rounded\"]/li)[16]")
     WebElement NestedFrames;
     
     @FindBy(xpath="//iframe[@id=\"frame1\"]")
     WebElement Iframe1;
     
     @FindBy(xpath="//a[@class=\"external-link\"]")
     List<WebElement> selenium;
     
      
     public void NestedFrames() throws InterruptedException
     {
    	 Thread.sleep(3000);
    	 NestedFrames.click();
     }
     
     public void Iframe1() throws InterruptedException
     {
    	 Thread.sleep(3000);
    	 
    	 driver.switchTo().frame(Iframe1);
    	 Thread.sleep(3000);
    	 driver.switchTo().frame(2);
     }
     
     public void selenium() throws InterruptedException
     {
    	 Thread.sleep(3000);
    	int size1= selenium.size();
    	System.out.println(size1);
    	Thread.sleep(3000);
    	WebElement E1 =selenium.get(0);
    	E1.click();
     }
     
     public AlertNestedFrames(WebDriver driver)
     {
    	this.driver= driver; 
    	PageFactory.initElements(this.driver, this);
    	
     }
}
