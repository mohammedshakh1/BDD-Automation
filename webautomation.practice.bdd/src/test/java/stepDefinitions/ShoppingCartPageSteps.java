package stepDefinitions;

import base.ApplicationPageBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import objects.ShoppingCartPage;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPageSteps extends ApplicationPageBase {

    ShoppingCartPage objOfShoppingCart = PageFactory.initElements(driver, ShoppingCartPage.class);

    @Given("^Searh for MacBook$")
    public void searh_for_MacBook() {
        objOfShoppingCart.productsearch("Mac Book");

    }

    @When("^Macbook options displayed in Next page$")
    public void macbook_options_displayed_in_Next_page() {
        objOfShoppingCart.clickamazonChoice();
    }

    @When("^Add amazon Choice to Cart$")
    public void add_amazon_Choice_to_Cart() {
        objOfShoppingCart.clickAddToCart();

    }

    @Then("^Confirm it is added in Cart$")
    public void confirm_it_is_added_in_Cart() {
        Assert.assertTrue(objOfShoppingCart.checkAddToCartButton());

    }

}
