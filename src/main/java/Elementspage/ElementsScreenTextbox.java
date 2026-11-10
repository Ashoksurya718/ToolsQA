package Elementspage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementsScreenTextbox 

{
	public WebDriver driver;
	WebDriverWait W1;
    @FindBy(xpath="(//button[@class=\"accordion-button collapsed\"])")
    List<WebElement> SelectElements;
    
    @FindBy(xpath="(//ul[contains(@class,\"list-group rounded\")]/li)[1]")
    WebElement Textbox;
    
    @FindBy(xpath="//input[@id=\"fullname\"]")
    WebElement fullname;
    
    @FindBy(xpath="//input[@id=\"email\"]")
    WebElement email;
    
    @FindBy(xpath="//textarea[@id=\"address\"]")
    WebElement Address;
    
    @FindBy(xpath="//input[@id=\"password\"]")
    WebElement password;
    
    @FindBy(xpath="//input[@class=\"btn btn-primary\"]")
    WebElement submit;
    
    public void SelectElements() throws InterruptedException
    {
    	int sizecount =SelectElements.size();
    	System.out.println(sizecount);
    	W1.until(ExpectedConditions.visibilityOfAllElements(SelectElements));
    	Thread.sleep(3000);
    	
    	WebElement E1 =SelectElements.get(0);
    	W1.until(ExpectedConditions.elementToBeClickable(E1));
    	E1.click();
    	
    	 }
    
    public void Textbox() throws InterruptedException
    {
    	Thread.sleep(3000);
    	W1.until(ExpectedConditions.elementToBeClickable(Textbox));
    	Textbox.click();
    }
    
    public void fullname() throws InterruptedException
    {
    	Thread.sleep(3000);
    	W1.until(ExpectedConditions.visibilityOf(fullname));
    	fullname.sendKeys("ashokvarma");
    }
    
    public void email() throws InterruptedException
    
    {
    	Thread.sleep(3000);
    	W1.until(ExpectedConditions.visibilityOf(email));
    	email.sendKeys("ashokvarma@gmail.com");
    }
    
    public void Address() throws InterruptedException
    {
    	Thread.sleep(3000);
    	W1.until(ExpectedConditions.visibilityOf(Address));
    	Address.sendKeys("guntur");
    }
    
    public void password() throws InterruptedException
    {
    	Thread.sleep(3000);
    	W1.until(ExpectedConditions.visibilityOf(password));
    	password.sendKeys("Ashok@123");
    }
    
    public void submit() throws InterruptedException
    {
    	Thread.sleep(3000);
    	W1.until(ExpectedConditions.elementToBeClickable(submit));
    	submit.click();
    }
    
    public ElementsScreenTextbox(WebDriver driver)
    {
    	this.driver=driver;
    	PageFactory.initElements(this.driver, this);
    	W1 =new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    
    
}
