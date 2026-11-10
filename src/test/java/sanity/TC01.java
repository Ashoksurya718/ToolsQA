package sanity;

import org.testng.annotations.Test;

import Elementspage.ElementsScreenTextbox;
import jdk.javadoc.doclet.Reporter;
import utility.Base;

public class TC01 extends Base
{
      @Test
      
      public void Tc01() throws InterruptedException
      {
    	  ElementsScreenTextbox Es1 =new ElementsScreenTextbox(driver);
    	  Es1.SelectElements();
    	  
    	  Es1.Textbox();
    	  Es1.fullname();
    	  Es1.email();
    	  Es1.Address();
    	  Es1.password();
    	  Es1.submit();
      }
}
