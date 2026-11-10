package sanity;

import org.testng.annotations.Test;

import Alertsframeswindows.AlertframeFrames;
import Alertsframeswindows.Alertsframeswidows;
import utility.Base;

public class Tc15_Framesconcept extends Base
{
    @Test()
    
    public void Tc15_Framesconcept() throws InterruptedException
    {
    	 Alertsframeswidows AF1 =new Alertsframeswidows(driver);
		  AF1.ALertswidows();
		  
		  AlertframeFrames AF2 =new AlertframeFrames(driver);
		  AF2.Seleniumtutorial();
		 
    }
}
