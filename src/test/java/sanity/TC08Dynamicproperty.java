package sanity;

import org.testng.annotations.Test;

import Elementspage.ElementsScreenTextbox;
import Elementspage.Elementsdynamicproperties;
import utility.Base;

public class TC08Dynamicproperty extends Base
{
	@Test
	
	public void TC08Dynamicproperty() throws InterruptedException
	{
	 ElementsScreenTextbox Es1 =new ElementsScreenTextbox(driver);
		Es1.SelectElements();
		
		Elementsdynamicproperties E1 =new Elementsdynamicproperties(driver);
		E1.dynamicprop();
		E1.colour();
		
	}
}
