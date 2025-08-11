package HomepageModuleFunctionality;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Tc004 extends Tc003{
    @Test
    public void Tc004(){
        PageFactory.initElements(driver,this);
        //Open Url + Login
        Tc003();
        //


    }
}
