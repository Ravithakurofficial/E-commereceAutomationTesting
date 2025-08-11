package HomepageModuleFunctionality;


import com.google.j2objc.annotations.WeakOuter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.lang.model.element.Name;
import javax.xml.xpath.XPath;
import java.net.MalformedURLException;
import java.time.Duration;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TC002 extends TC001{
    @FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]")
    protected WebElement MyAccountButton;
    @FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")
    protected WebElement RegisterButton;

    @FindBy(xpath="//*[@id=\"column-right\"]/div/a[1]")
    protected WebElement loginButton;

    @FindBy(xpath="//*[@id=\"column-right\"]/div/a[13]")
    protected WebElement LogoutButton;


    @FindBy(xpath= "//*[@id=\"input-firstname\"]")
    protected WebElement FirstNameLoc;
    @FindBy(xpath = "//*[@id=\"input-lastname\"]")
    protected WebElement LastNameLoc;
    @FindBy(xpath = "//*[@id=\"input-email\"]")
    protected WebElement EmailLoc;
    @FindBy(xpath = "//*[@id=\"input-telephone\"]")
    protected WebElement telephoneloc;
    @FindBy(xpath = "//*[@id=\"input-password\"]")
    protected WebElement passwordloc;
    @FindBy(xpath = "//*[@id=\"input-confirm\"]")
    protected WebElement ConPasswordloc;
    @FindBy(xpath = "//*[@id=\"content\"]/form/div/div/input[1]")
    protected WebElement TickBoxloc;
    @FindBy(xpath = "//*[@id=\"content\"]/form/div/div/input[2]")
    protected WebElement ContinueButtonloc;

    @FindBy(xpath = "//*[@id=\"content\"]/h1")
    protected WebElement YourAccountCreatedMessage;
    @FindBy(xpath = "//*[@id=\"content\"]/p[1]")
    protected WebElement SecondLine;
    @FindBy(xpath = "//*[@id=\"content\"]/p[2]")
    protected WebElement ThirdLine;
    @FindBy(xpath = "//*[@id=\"content\"]/p[3]")
    protected  WebElement FourthLine;
    @FindBy(xpath = "//*[@id=\"content\"]/p[4]")
    protected  WebElement FivthLine;

    public TC002() throws MalformedURLException {
    }

    @Test
    public void TC002(){
        OpenUrl();
        PageFactory.initElements(driver,this);
        //Click On My Account Button
        MyAccountButton.click();
        //Click On register Button
        RegisterButton.click();
        //Check Are We On Register Page to check that we check login option available it means logout option is not visible
        loginButton.isDisplayed();
        //Lets Start Filling The data and sendkeys
        FirstNameLoc.sendKeys("Lookus");
        LastNameLoc.sendKeys("Thakur");
        EmailLoc.sendKeys(Emailgenrator());
        telephoneloc.sendKeys("9461613586");
        passwordloc.sendKeys("Test@123");
        ConPasswordloc.sendKeys("Test@123");
        TickBoxloc.click();
        //Now We Submit the data
        ContinueButtonloc.submit();
        //check move to confirmation Page
        LogoutButton.isDisplayed();
        Assert.assertEquals(YourAccountCreatedMessage.getText(),"Your Account Has Been Created!");
        Assert.assertEquals(SecondLine.getText(),"Congratulations! Your new account has been successfully created!");
        Assert.assertEquals(ThirdLine.getText(),"You can now take advantage of member privileges to enhance your online shopping experience with us.");
        Assert.assertEquals(FourthLine.getText(),"If you have ANY questions about the operation of this online shop, please e-mail the store owner.");
        Assert.assertEquals(FivthLine.getText(),"A confirmation has been sent to the provided e-mail address. If you have not received it within the hour, please contact us.");

    }
    public String Emailgenrator(){
        return new Date().toString().replace(":","").replace(" ","") + "@email.com";
    }
}
