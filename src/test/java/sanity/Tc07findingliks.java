package sanity;

import org.testng.annotations.Test;

import Elementspage.ElementsScreenTextbox;
import Elementspage.Elementslinks;
import utility.Base;

public class Tc07findingliks extends Base
{
	@Test
    public void Tc07findingliks() throws InterruptedException
    {
		ElementsScreenTextbox Es1 =new ElementsScreenTextbox(driver);
		Es1.SelectElements();
		
		Elementslinks El1 = new Elementslinks(driver);
		El1.links();
		El1.alllinks();
    }
}
