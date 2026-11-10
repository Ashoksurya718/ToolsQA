package sanity;

import org.testng.annotations.Test;

import Alertsframeswindows.AlertNestedFrames;
import Alertsframeswindows.Alertsframeswidows;
import utility.Base;

public class Tc16nestedframes extends Base

{
	
	@Test 
	
	public void Tc16nestedframes() throws InterruptedException
	{
	 Alertsframeswidows AF1 =new Alertsframeswidows(driver);
	 AF1.ALertswidows();
	 
	 AlertNestedFrames AN1 =new AlertNestedFrames(driver);
	 AN1.NestedFrames();
	 AN1.Iframe1();
	 AN1.selenium();
	 
	}
}
