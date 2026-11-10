package sanity;

import org.testng.annotations.Test;

import Elementspage.ElementsScreenTextbox;
import Elementspage.Elementscheckbox;
import utility.Base;

public class Tc02checkbox extends Base{
	
	@Test()
	
	public void Tc02checkbox() throws InterruptedException
	{
		ElementsScreenTextbox T1 =new ElementsScreenTextbox(driver);
		T1.SelectElements();
		
		Elementscheckbox T2 =new Elementscheckbox(driver);
		T2.Checkbox();
		T2.plusbutton();
		T2.sublevel1();
		T2.maninlevel();
		T2.sublevel3();
		
	}

}
