package sanity;

import org.testng.annotations.Test;

import Elementspage.ElementsRadioButton;
import Elementspage.ElementsScreenTextbox;
import utility.Base;

public class Tc04DisabledButton extends Base
{
   @Test
   
   public void Tc04DisabledButton() throws InterruptedException
   {
	   ElementsScreenTextbox Es1 =new ElementsScreenTextbox(driver);
		Es1.SelectElements();
		
		ElementsRadioButton ER1 =new ElementsRadioButton(driver);
		ER1.Radiobutton();
		ER1.DisabledRadioButton();
   }
}
