package Elementspage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementsWebtable {
	
	public WebDriver driver;
	WebDriverWait W1 ;
	
	@FindBy(xpath="(//ul[@class=\"list-group rounded\"]/li)[4]")
	WebElement Webtable;
	
	@FindBy(xpath="//button[@class=\"btn btn-primary\"]")
	WebElement Addbutton;
	
	@FindBy(xpath="(//input[@id=\"firstname\"])[1]")
	WebElement Firstname;
	
	@FindBy(xpath="(//input[@id=\"lastname\"])[1]")
	WebElement Lastname;
	
	@FindBy(xpath="(//input[@id=\"email\"])[1]")
	WebElement Email;
	
	@FindBy(xpath="(//input[@id=\"age\"])[1]")
	WebElement age;
	
	@FindBy(xpath="(//input[@id=\"salary\"])[1]")
	WebElement salary;
	
	@FindBy(xpath="(//input[@id=\"deparment\"])[1]")
	WebElement Dept;
	
	@FindBy(xpath="//input[@value=\"Login\"]")
	WebElement login;
	
	public void Webtable() throws InterruptedException
	{
		Thread.sleep(3000);
		W1.until(ExpectedConditions.elementToBeClickable(Webtable));
		Webtable.click();
	}
	
	public void Addbutton() throws InterruptedException
	{
		Thread.sleep(3000);
		W1.until(ExpectedConditions.elementToBeClickable(Addbutton));
		Addbutton.click();
	}
	
	public void Firstname() throws InterruptedException
	{
		Thread.sleep(3000);
		W1.until(ExpectedConditions.visibilityOf(Firstname));
		Firstname.sendKeys("Ashok");
	}
	
	public void Lastname() throws InterruptedException
	{
		Thread.sleep(3000);
		W1.until(ExpectedConditions.visibilityOf(Lastname));
		Lastname.sendKeys("surya");
	}
	
	public void Email() throws InterruptedException
	{
		Thread.sleep(3000);
		W1.until(ExpectedConditions.visibilityOf(Email));
		Email.sendKeys("ashok.vadalamudi@tpsl.in");
	}
	
	public void age() throws InterruptedException
	{
		Thread.sleep(3000);
		W1.until(ExpectedConditions.visibilityOf(age));
		age.sendKeys("20222");
	}
	
	public void salary() throws InterruptedException
	{
		Thread.sleep(3000);
		W1.until(ExpectedConditions.visibilityOf(salary));
		salary.sendKeys("200002222222222222222222222222222222222");
	}
	
	public void Dept() throws InterruptedException
	{
		Thread.sleep(3000);
		W1.until(ExpectedConditions.visibilityOf(Dept));
		Dept.sendKeys("Testing");
	}
	
	public void login() throws InterruptedException
	{Thread.sleep(3000);
		W1.until(ExpectedConditions.elementToBeClickable(login));
		login.click();
	}
	
	public ElementsWebtable(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(this.driver, this);
		W1= new WebDriverWait(driver, Duration.ofSeconds(10));
	}

}
