package HomepageModuleFunctionality;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC001 {
    WebDriver driver;
    @Test
    public void OpenUrl(){
        driver = new ChromeDriver();
        driver.navigate().to("https://tutorialsninja.com/demo/");
    }

}
