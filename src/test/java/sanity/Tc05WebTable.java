package sanity;

import org.testng.annotations.Test;

import Elementspage.ElementsScreenTextbox;
import Elementspage.ElementsWebtable;
import utility.Base;

public class Tc05WebTable extends Base

{
	
	@Test()
	
	public void Tc05WebTable() throws InterruptedException
	{
		ElementsScreenTextbox Es1 =new ElementsScreenTextbox(driver);
		Es1.SelectElements();
		
		ElementsWebtable WET =new ElementsWebtable(driver);
		WET.Webtable();
		WET.Addbutton();
		WET.Firstname();
		WET.Lastname();
		WET.Email();
		WET.age();
		WET.salary();
		WET.Dept();
		WET.login();
	}

}
