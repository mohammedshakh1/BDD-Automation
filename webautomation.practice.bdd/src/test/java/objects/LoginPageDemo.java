package objects;


import base.ApplicationPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageDemo extends ApplicationPageBase {
     private WebDriver driver ;
    @FindBy(how = How.ID, id = "email")
    private WebElement emailBox;

    @FindBy(how = How.ID, id = "passwd")
    private WebElement passwordBox;

    @FindBy(how = How.CLASS_NAME, css = "#center_column > div.alert.alert-danger > p")
    private WebElement errorMessage;

    @FindBy(how = How.ID, id = "SubmitLogin")
    private WebElement submitButton;

    public LoginPageDemo login(String email, String password){

        sendKeys(emailBox, "emailBox", email);
        sendKeys(passwordBox,"passwordBox", password);
        click(submitButton,"submitButton");

        return new LoginPageDemo();

    }


    public String getErroMessage(){

        String actualText = getText(errorMessage,"errorMessage");

        return actualText;
    }


    /*public LoginPageDemo login(String email, String password){

        TestLogger.log("Sending keys to email box");
        sendKeys(emailBox,"emailBox", email);
        sendKeys(passwordBox,"passwordBox",password);


        return new LoginPageDemo();

    }*/



}
