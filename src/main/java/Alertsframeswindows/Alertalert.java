package Alertsframeswindows;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alertalert 
{
	public WebDriver driver;
	WebDriverWait W1;
	
  @FindBy(xpath="(//ul[@class=\"list-group rounded\"]/li)[14]")
  WebElement Alertoption;
  
  @FindBy(xpath="(//button[contains(text(),\"Alert\")])[2]")
  WebElement Alert1;
  
  @FindBy(xpath="(//button[contains(text(),\"Click Me\")])[1]")
  WebElement Alert2;
  
  @FindBy(xpath="(//button[contains(text(),\"Click Me\")])[2]")
  WebElement Alert3;
  
  @FindBy(xpath="(//button[contains(text(),\"Click Me\")])[3]")
  WebElement Alert4;
  
  public void Alertoption()
  {
	  W1.until(ExpectedConditions.elementToBeClickable(Alertoption));
	  Alertoption.click(); 
  }
  
  public void Alert()
  {
	  W1.until(ExpectedConditions.elementToBeClickable(Alert1));
	  Alert1.click();
	  W1.until(ExpectedConditions.alertIsPresent());
	  driver.switchTo().alert().accept();
  }
  
  public void Alert2()
  {
	  W1.until(ExpectedConditions.elementToBeClickable(Alert2));
	  Alert2.click();
	  W1.until(ExpectedConditions.alertIsPresent());
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	  driver.switchTo().alert().dismiss();
  }
  public void Alert3()
  {
	  W1.until(ExpectedConditions.elementToBeClickable(Alert3));
	  Alert3.click();
	  W1.until(ExpectedConditions.alertIsPresent());
	  driver.switchTo().alert().dismiss();
  }
  
  public void Alert4()
  {
	  W1.until(ExpectedConditions.elementToBeClickable(Alert4));
	 Alert4.click();
	 W1.until(ExpectedConditions.alertIsPresent());
	  org.openqa.selenium.Alert A1= driver.switchTo().alert();
	  A1.sendKeys("Ashok");
	  A1.accept();
  }
  
  public Alertalert(WebDriver driver)
  {
	 this.driver=driver;
	 PageFactory.initElements(this.driver, this);
	 W1 =new WebDriverWait(driver, Duration.ofSeconds(10));
  }
}
