package steps;


import Driver.DriverContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class AddCartStepDefinition {
    private  WebDriver driver;

    public  AddCartStepDefinition(DriverContext driverContext){
        driver= driverContext.getDriver();
    }

    @Given("user can select the product")
    public void user_can_select_the_product() {

    }
    @When("user clicks add to cart")
    public void user_clicks_add_to_cart() {

    }
    @Then("user can see the product in cart")
    public void user_can_see_the_product_in_cart() {

    }
}
