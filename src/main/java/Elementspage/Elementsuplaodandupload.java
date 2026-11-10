package Elementspage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Elementsuplaodandupload 
{
	public WebDriver driver;
	WebDriverWait W1;
  @FindBy(xpath="(//ul[@class=\"list-group rounded\"]/li)[8]")
  WebElement uploadanddowload;
  
  @FindBy(xpath="//a[@class=\"btn btn-primary\"]")
  WebElement download;
  
  @FindBy(id="uploadFile")
  WebElement upload;
  
  public void uploadanddowload() throws InterruptedException
  {
	  Thread.sleep(3000);
	  W1.until(ExpectedConditions.elementToBeClickable(uploadanddowload));
	  uploadanddowload.click(); 
  }
  
  public void download() throws InterruptedException
  {
	  Thread.sleep(3000);
	  W1.until(ExpectedConditions.elementToBeClickable(download));
	  download.click();
  }
  
  public void upload() throws InterruptedException
  {
	  Thread.sleep(3000);
	  W1.until(ExpectedConditions.visibilityOf(upload));
	  upload.sendKeys("C:\\Users\\user\\Desktop\\Vadlamudi_Ashok_Resume.docx");
  }
  
  public Elementsuplaodandupload(WebDriver driver)
  {
	  this.driver=driver;
	  PageFactory.initElements(this.driver, this);
	  W1 =new WebDriverWait(driver, Duration.ofSeconds(10));
  }
}
