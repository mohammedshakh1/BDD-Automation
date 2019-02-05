package stepDefinitions;

import base.ApplicationPageBase;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import objects.HomePage;
import objects.SignInPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;
import java.util.Map;

public class SignInPageSteps extends ApplicationPageBase {


    HomePage homePage = PageFactory.initElements(driver,HomePage.class);
    SignInPage signInPage = PageFactory.initElements(driver,SignInPage.class);


    @Given("^user is alraedy on home page$")
    public void user_is_alraedy_on_home_page() throws Throwable {
        signInPage.signIn();
    }

    @When("^try log in by \"([^\"]*)\" and \"([^\"]*)\"$")
    public void try_log_in_by_and(String arg1, String arg2) throws Throwable {
        signInPage.sendData(arg1,arg2);

    }

    @Then("^error Msg Is There$")
    public void error_Msg_Is_There() throws Throwable {
        String actualText = signInPage.errorMessage();
        String expectedText = "Important Message!";
        Assert.assertEquals(actualText,expectedText);
    }



    @Given("^user already on home page$")
    public void user_already_on_home_page() throws Throwable{

        signInPage.signIn();
    }

    @When("^enter invalid data from Data Table$")
    public void enter_invalid_data_from_Data_Table(DataTable table) throws Throwable{
        List<Map<String,String>> datatable = table.asMaps(String.class,String.class);
        signInPage.sendData(datatable.get(0).get("email"),datatable.get(0).get("password"));
    }

    @Then("^error msg should be there$")
    public void error_msg_should_be_there() throws Throwable {
        String actualText = signInPage.errorMessage();
        String expectedText = "Important Message!";
        Assert.assertEquals(actualText,expectedText);
    }









}
