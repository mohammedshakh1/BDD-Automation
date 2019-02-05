package objects;



import base.ApplicationPageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class HomePageDemo extends ApplicationPageBase {

    private WebDriver driver;

    @FindBy(how = How.ID, using = "search_query_top")
    private WebElement searchBox;

    @FindBy(how = How.PARTIAL_LINK_TEXT, partialLinkText = "Contact us")
    private WebElement contactUs;

    @FindBy(how = How.PARTIAL_LINK_TEXT, partialLinkText = "Sign in")
    private WebElement signInButton;


    public LoginPageDemo getLogInPage() {

        signInButton.click();
        return new LoginPageDemo();
    }

    public void clickContactUs(){

        ApplicationPageBase.isEnableStatus(driver, contactUs);
        contactUs.click();

    }
    public String search (){

        searchBox.sendKeys("Shoes", Keys.ENTER);
        String actualText = driver.findElement(By.partialLinkText("Printed Chiffon Dress")).getText();

      return actualText;

    }


}





















/*public HomePageDemo() {
      // BrowserDriver.getUrl());
       // this.driver=BrowserDriver.getDriver();
        PageFactory.initElements(driver, this);
    }
*/