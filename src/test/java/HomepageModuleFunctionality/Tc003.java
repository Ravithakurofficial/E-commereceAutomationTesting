package HomepageModuleFunctionality;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Tc003 extends TC002 {
    @FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")
    protected WebElement LoginButtonloc;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div/h2")
    protected WebElement NewRegisterOption;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div/a")
    protected WebElement NewRegistratioLink;

    @FindBy(xpath = "//*[@id=\"input-email\"]")
    protected WebElement Emailinput;

    @FindBy(xpath = "//*[@id=\"input-password\"]")
    protected WebElement PasswordInput;
    @FindBy(linkText = "Forgotten Password")
    protected WebElement ForgottenPassword;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div/form/input")
    protected WebElement LoginButton;

    @Test
    public void Tc003(){
        //open chrome and ecommerce Website
        OpenUrl();
        //Intitialize Page Object Model
        PageFactory.initElements(driver,this);
        //CLICK myaccount button
        MyAccountButton.click();
        //click LoginButton
        LoginButtonloc.click();
        //Check New registration option is visible
        NewRegisterOption.isDisplayed();
        NewRegistratioLink.isDisplayed();
        //Enter Email and Password
        Emailinput.sendKeys("lookus@email.com");
        PasswordInput.sendKeys("password");
        //check Forget Button is visible
        ForgottenPassword.isDisplayed();
        //click login Button
        LoginButton.submit();

    }

}
