package stepDefinitions;

import base.ApplicationPageBase;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import objects.HomePageDemo;
import objects.LoginPageDemo;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;
import java.util.Map;

public class LoginUsingDataTableSteps extends ApplicationPageBase {
    LoginPageDemo loginPage = PageFactory.initElements(driver, LoginPageDemo.class);
    HomePageDemo homePage = PageFactory.initElements(driver, HomePageDemo.class);


    @Given("^User is in login page$")
    public void user_is_in_login_page()  {
        homePage.getLogInPage();
    }


    @When("^Enter invalid email and password from Data Table$")
    public void enter_invalid_email_and_password_from_Data_Table(DataTable table)  {

        List<Map<String, String>> datatable = table.asMaps(String.class,String.class);
        loginPage.login(datatable.get(0).get("userName"),datatable.get(0).get("password"));
    }

    @Then("^Error message appear$")
    public void error_message_appear() throws Throwable {
        String actualErrorMessage =  loginPage.getErroMessage();
        Assert.assertEquals(actualErrorMessage, "There is 1 error");
    }

}
