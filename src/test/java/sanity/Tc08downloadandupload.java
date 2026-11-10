package sanity;

import org.testng.annotations.Test;

import Elementspage.ElementsScreenTextbox;
import Elementspage.Elementsuplaodandupload;
import utility.Base;

public class Tc08downloadandupload extends Base

{
    @Test 
    
    public void Tc08downloadnandupload() throws InterruptedException
    {
    	ElementsScreenTextbox Es1 =new ElementsScreenTextbox(driver);
		Es1.SelectElements();
		
		Elementsuplaodandupload EF1  =new Elementsuplaodandupload(driver);
		EF1.uploadanddowload();
		EF1.download();
		EF1.upload();
    }
}
