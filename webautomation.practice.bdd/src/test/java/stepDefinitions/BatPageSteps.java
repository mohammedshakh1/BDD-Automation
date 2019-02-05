package stepDefinitions;

import base.ApplicationPageBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import objects.BatPage;
import objects.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class BatPageSteps extends ApplicationPageBase {

    HomePage homePage = PageFactory.initElements(driver,HomePage.class);
    BatPage batPage = PageFactory.initElements(driver, BatPage.class);

    @Given("^user is already on home Page$")
    public void user_is_already_on_home_Page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }
    @When("^go to bat page$")
    public void go_to_bat_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        homePage.bat();

    }

    @Then("^get text from Soft ball and assert$")
    public void get_text_from_Soft_ball_and_assert() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        String actualText = batPage.softBallText();
        String expectedText = "Baseball & Softball Bats";
        Assert.assertEquals(actualText,expectedText);
    }

   @Given("^user is already on home Page1$")
   public void user_is_already_on_home_Page1() throws Throwable {
      // Write code here that turns the phrase above into concrete actions

    }

    @When("^go to bat page1$")
    public void go_to_bat_page1() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        homePage.bat();

    }

    @Then("^get text from Bse Ball and assert$")
    public void get_text_from_Bse_Ball_and_assert() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        String actualText = batPage.baseBallText();
        String expectedText = "Baseball Bats";
        Assert.assertEquals(actualText,expectedText);
    }



}
