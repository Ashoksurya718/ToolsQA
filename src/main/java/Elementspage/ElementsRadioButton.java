package Elementspage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementsRadioButton 
{
	public WebDriver driver;
	WebDriverWait W1;
    @FindBy(xpath="(//ul[@class=\"list-group rounded\"]/li)[3]")
    WebElement Radiobutton;
    
    @FindBy(xpath="//input[@class=\"form-check-input\"]")
    List<WebElement>YesRadiobutton;
    
    @FindBy(xpath="//input[@class=\"form-check-input\"]")
    List<WebElement>DisabledRadioButton;
    
    public void Radiobutton() throws InterruptedException
    {
    	Thread.sleep(3000);
    	W1.until(ExpectedConditions.elementToBeClickable(Radiobutton));
    	Radiobutton.click();
    }
    
    public void YesRadiobutton() throws InterruptedException
    {
    	Thread.sleep(3000);
    	int sizecount =YesRadiobutton.size();
    	W1.until(ExpectedConditions.visibilityOfAllElements(YesRadiobutton));
    	System.out.println(sizecount);
    	
    	WebElement E1 =YesRadiobutton.get(0);
    	W1.until(ExpectedConditions.elementToBeClickable(E1));
    	E1.click();
    	
    }
    
    public void DisabledRadioButton() throws InterruptedException
    {
    	Thread.sleep(3000);
    	JavascriptExecutor Js =(JavascriptExecutor) driver;
    	Js.executeScript("arguments[0].click;", DisabledRadioButton);
    }
    
    public ElementsRadioButton(WebDriver driver)
    {
    	this.driver=driver;
    	PageFactory.initElements(this.driver, this);
    	W1=new WebDriverWait(driver, Duration.ofSeconds(10));
    }
}
