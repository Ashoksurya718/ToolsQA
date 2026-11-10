package sanity;

import org.testng.annotations.Test;

import Elementspage.ElementsRadioButton;
import Elementspage.ElementsScreenTextbox;
import utility.Base;

public class Tc03RadioButton extends Base
{
	@Test
	
	public void Tc03RadioButton() throws InterruptedException
	{
		ElementsScreenTextbox Es1 =new ElementsScreenTextbox(driver);
		Es1.SelectElements();
		
		ElementsRadioButton ER1 =new ElementsRadioButton(driver);
		ER1.Radiobutton();
		ER1.YesRadiobutton();
	}
	

}
