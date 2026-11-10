package Elementspage;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Elementsdynamicproperties 
{
	public WebDriver driver;
	WebDriverWait W1;
   @FindBy(xpath="(//ul[@class=\"list-group rounded\"]/li)[9]")
   WebElement dynamicprop;
   
   @FindBy(xpath="//button[text()=\"Color Change\"]")
   WebElement colour;
   
   public void dynamicprop() throws InterruptedException
   {
	   
	   Thread.sleep(3000);
	   JavascriptExecutor JS =(JavascriptExecutor) driver;
	   JS.executeScript("window.scrollBy(0,300)");
	   Thread.sleep(3000);
	   W1.until(ExpectedConditions.elementToBeClickable(dynamicprop));
	   dynamicprop.click();
   }
   
   public void colour()
   {
	   W1.until(ExpectedConditions.elementToBeClickable(colour));
	   colour.click();
   }
   
   public Elementsdynamicproperties(WebDriver driver)
   {
	   this.driver=driver;
	   PageFactory.initElements(this.driver, this);
	   W1 =new WebDriverWait(driver, Duration.ofSeconds(10));
   }
}
