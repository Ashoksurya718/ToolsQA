package Elementspage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import jdk.javadoc.doclet.Reporter;

public class Elementscheckbox 
{
	public WebDriver driver;
	WebDriverWait W1;
    @FindBy(xpath="(//ul[@class=\"list-group rounded\"]/li)[2]")
    WebElement Checkbox;
    
    @FindBy(xpath="//span[@class=\"plus\"]")
    List<WebElement> plusbutton;
    
    @FindBy(xpath="//input[@id=\"c_bf_1\"]")
    WebElement sublevel1;
    
    @FindBy(xpath="//span[@class=\"plus\"]")
    List<WebElement> maninlevel;
    
    @FindBy(xpath="//input[@id=\"c_bf_3\"]")
    WebElement sublevel3;
    
    public void Checkbox() throws InterruptedException
    {
    	Thread.sleep(3000);
    	W1.until(ExpectedConditions.elementToBeClickable(Checkbox));
    	Checkbox.click();
    	
    }
    
    public void plusbutton() throws InterruptedException
    {
    	Thread.sleep(3000);
    	int sizecount =plusbutton.size();
    	W1.until(ExpectedConditions.visibilityOfAllElements(plusbutton));
    	System.out.println(sizecount);
    	
    	WebElement R1 =plusbutton.get(0);
    	W1.until(ExpectedConditions.elementToBeClickable(R1));
    	R1.click();
    }
    
    public void sublevel1() throws InterruptedException
    {
    	Thread.sleep(3000);
    	W1.until(ExpectedConditions.elementToBeClickable(sublevel1));
    	sublevel1.click();
    }
    
    public void maninlevel() throws InterruptedException
    {
    	Thread.sleep(3000);
    	int size2 =maninlevel.size();
    	W1.until(ExpectedConditions.visibilityOfAllElements(maninlevel));
    	System.out.println(size2);
    	
    	WebElement R3 =maninlevel.get(3);
    	W1.until(ExpectedConditions.elementToBeClickable(R3));
    	R3.click();
    }
    
    public void sublevel3() throws InterruptedException
    {
    	Thread.sleep(3000);
    	W1.until(ExpectedConditions.elementToBeClickable(sublevel3));
    	sublevel3.click();
    }
    
    public Elementscheckbox(WebDriver driver)
    {
    	this.driver=driver;
    	PageFactory.initElements(this.driver, this);
    	W1=new WebDriverWait(driver, Duration.ofSeconds(10));
    }
}
