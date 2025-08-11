package HomepageModuleFunctionality;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class TC001 {
    WebDriver driver;
    URL url = new URL("https://tutorialsninja.com/demo/");

    public TC001() throws MalformedURLException {
    }

    @Test
    public void OpenUrl(){
        driver = new ChromeDriver();
        driver.navigate().to(url);
        driver.manage().window().maximize();
    }

}
