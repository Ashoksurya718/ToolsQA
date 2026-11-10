package Elementspage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementsButtons
{
	public WebDriver driver;
	WebDriverWait W2 ;
    @FindBy(xpath="(//ul[@class=\"list-group rounded\"]/li)[5]")
    WebElement button;
    
    @FindBy(xpath="//button[@class=\"btn btn-primary\"]")
    WebElement clickbutton;
    
    @FindBy(xpath="//button[@class=\"btn btn-secondary\"]")
    WebElement Rightclickbutton;
    
    @FindBy(xpath="//button[contains(text(),\"Double Click Me\")]")
    WebElement doubleclickbutton;
    
    public void button() throws InterruptedException
    {
    	Thread.sleep(3000);
    	W2.until(ExpectedConditions.elementToBeClickable(button));
    	button.click();
    }
    
    public void clickbutton() throws InterruptedException
    {
    	Thread.sleep(3000);
    	W2.until(ExpectedConditions.elementToBeClickable(clickbutton));
    	clickbutton.click();
    }
    
    public void Rightclickbutton() throws AWTException, InterruptedException
    {
    	Thread.sleep(3000);
    	Actions A1 =new Actions(driver);
    	A1.contextClick(Rightclickbutton).perform();
    	
    	Thread.sleep(3000);
    	Robot R1 =new Robot();
    	R1.keyPress(KeyEvent.VK_DOWN);
    	R1.keyRelease(KeyEvent.VK_DOWN);
    	
    	Thread.sleep(3000);
    	
    	R1.keyPress(KeyEvent.VK_DOWN);
    	R1.keyRelease(KeyEvent.VK_DOWN);
    	
    	Thread.sleep(3000);
    	
    	
    	R1.keyPress(KeyEvent.VK_ENTER);
    	R1.keyRelease(KeyEvent.VK_ENTER);
    		
    }
    
    public void doubleclickbutton() throws InterruptedException
    {
    	Thread.sleep(3000);
    	Actions A2 =new Actions(driver);
    	A2.doubleClick(doubleclickbutton).perform();
    }
    
    public ElementsButtons(WebDriver driver)
    {
    	this.driver =driver;
    	PageFactory.initElements(this.driver, this);
    	W2 =new WebDriverWait(driver, Duration.ofSeconds(10));
    }
}
