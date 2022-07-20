package steps;


import Driver.DriverContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageobject.HomePageObject;

public class AddCartStepDefinition {
    private  WebDriver driver;
    HomePageObject homepageobject;

    public  AddCartStepDefinition(DriverContext driverContext){
        driver= driverContext.getDriver();
        homepageobject = new HomePageObject(driver);
    }
    @Given("user can select the product")
    public void user_can_select_the_product() {
        homepageobject.category();
        homepageobject. sizeCheck();
        homepageobject. colorCheck();
        homepageobject.compositions();
        homepageobject. sortBy();
    }
    @When("user clicks add to cart")
    public void user_clicks_add_to_cart() {
        homepageobject. addToCart();
    }
    @Then("user can see the product in cart")
    public void user_can_see_the_product_in_cart() {
        homepageobject.verifyText();
    }
}
