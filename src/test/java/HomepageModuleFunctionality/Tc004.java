package HomepageModuleFunctionality;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.webextension.ExtensionArchivePath;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class Tc004 extends Tc003{
    @FindBy(xpath = "//*[@id=\"menu\"]/div[2]/ul/li[1]/div/a")
    protected WebElement pcAlloption;
    @FindBy(xpath = "//*[@id=\"content\"]/div[4]/div[1]/div/div[2]/div[2]/button[1]/span")
    protected WebElement FirstOptionPc;
    @FindBy(xpath = "//*[@id=\"content\"]/div[4]/div[1]/div/div[2]/div[2]/button[2]")
    protected WebElement FirstoptionpcFav;
    @FindBy (xpath = "/html/body/div[1]/nav/div[2]/ul/li[2]/div/a")
    protected WebElement laptopandNotebookalloption;
    @FindBy(xpath = "//*[@id=\"content\"]/div[4]/div[1]/div/div[2]/div[2]/button[2]")
    protected WebElement getLaptopandNotebookfirstoptionfav;
    @FindBy(xpath = "//*[@id=\"menu\"]/div[2]/ul/li[1]/a")
    protected WebElement DesktopOption;
    @FindBy(xpath = "//*[@id=\"menu\"]/div[2]/ul/li[2]/a")
    protected WebElement LaptopAndNotebookOption;
    @FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[3]")
    protected  WebElement WishListOption;
    @FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[4]")
    protected WebElement Shopingcartoption;


    public Tc004() throws MalformedURLException {
    }

    @Test
    public void Tc004(){
        PageFactory.initElements(driver,this);
        //Open Url + Login
        Tc003();
        //Check all the Product Add Few Product



    }
}
