package sanity;

import java.awt.AWTException;

import org.testng.annotations.Test;

import Elementspage.ElementsButtons;
import Elementspage.ElementsScreenTextbox;
import utility.Base;

public class Tc06buttons extends Base 
{
   @Test
   
   public void Tc06buttons() throws InterruptedException, AWTException
   {
	   ElementsScreenTextbox Es1 =new ElementsScreenTextbox(driver);
		Es1.SelectElements();
		
		ElementsButtons Eb1 =new ElementsButtons(driver);
		Eb1.button();
		Eb1.clickbutton();
		Eb1.Rightclickbutton();
		Eb1.doubleclickbutton();
		
   }
}
