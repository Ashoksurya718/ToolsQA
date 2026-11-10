package sanity;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import Alertsframeswindows.Alertsframeswidows;
import utility.Base;

public class Tc09multiwindow extends Base 

{
  @Test
  
  public void Tc09mutiwindow() throws InterruptedException
  {
	  Alertsframeswidows AF1 =new Alertsframeswidows(driver);
	  AF1.ALertswidows();
	  AF1.Browserwindows();
	  AF1.NewTab();
	  AF1.tutorialspoint();
  }
}
