package Elementspage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Elementslinks 
{
	public WebDriver driver;
	WebDriverWait W1;
  @FindBy(xpath="(//ul[@class=\"list-group rounded\"]/li)[6]")
  WebElement links;
  
  @FindBy(xpath="//a[text()=\"Home\"]")
  WebElement Homelink;
  
  @FindBy(xpath="//a[text()=\"HomewPWPU\"]")
  WebElement Home2link;
  
  @FindBy(tagName="a")
  List<WebElement> alllinks;
  
  public void links() throws InterruptedException
  {
	  Thread.sleep(3000);
	  W1.until(ExpectedConditions.elementToBeClickable(links));
	  links.click(); 
  }
  
  public void Homelink() throws InterruptedException
  {
	  Thread.sleep(3000);
	  W1.until(ExpectedConditions.elementToBeClickable(Homelink));
	  Homelink.click(); 
  }
  
  public void alllinks() throws InterruptedException
  {
	  Thread.sleep(3000);
	  int size =alllinks.size();
	  System.out.println(size);
	  
	  for(int i=0;i<size;i++)
	  {
	 WebElement L1 = alllinks.get(i);
	String S1 = L1.getDomAttribute("href");
	System.out.println(S1);
	String text =L1.getText();
	System.out.println(text);
	 
	  }
  }
  
  public Elementslinks(WebDriver driver)
  {
	  this.driver=driver;
	  PageFactory.initElements(this.driver, this);
	  W1 =new WebDriverWait(driver, Duration.ofSeconds(10));
  }
  
  
}
