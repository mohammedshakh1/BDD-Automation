package objects;


import base.ApplicationPageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class SignInPage extends ApplicationPageBase {

    @FindBy(how = How.ID, using = "ap_email")
    private WebElement emailBox;

    @FindBy(how = How.ID, using = "ap_password")
    private WebElement passwordBox;

    @FindBy(how = How.ID, using = "signInSubmit")
    private WebElement signInButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"auth-error-message-box\"]/div")
    private WebElement errorMessageBox;

    @FindBy(how = How.ID, using = "createAccountSubmit")
    private WebElement createAccount;

    @FindBy(how = How.XPATH, using = "//*[@id=\"nav-link-accountList\"]")
    private WebElement hovEver;

    @FindBy(how = How.ID, using = "nav-flyout-ya-signin")
    private WebElement signLast;

    @FindBy(how = How.ID, using = "ap_password")
    private WebElement reEnterPassword;

    @FindBy(how = How.ID, using = "auth-captcha-image")
    private WebElement captchaBox;


    public void signIn(){


        Actions actions = new Actions(driver);
        actions.moveToElement(hovEver).build().perform();
        boolean isEnabled = signLast.isEnabled();
        boolean isDisplayed = signLast.isDisplayed();
        boolean isSelected = signLast.isSelected();
        System.out.println(isEnabled);
        System.out.println(isDisplayed);
        System.out.println(isSelected);
        signLast.click();


    }

    public SignInPage sendData(String email,String password){

        sendKeys(emailBox,"emailbox",email);
        sendKeys(passwordBox,"passwordBox",password);
        click(signInButton,"Sign in account");
        return new SignInPage();


    }



    public String errorMessage(){
        String actualText = getText(errorMessageBox,"There was a problem ");
        return actualText;
    }




}
