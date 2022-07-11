package steps;

import Driver.DriverContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;


public class LoginStepDefinition {
    WebDriver driver;

    public LoginStepDefinition(DriverContext driver){
        this.driver= driver.getDriver();
    }

    @Given("user is in login page")
    public void user_is_in_login_page() {

    }
    @Given("user enters email address")
    public void user_enters_email_address() {

    }

    @Given("user enters password")
    public void user_enters_password() {

    }

    @When("user clicks sign in button")
    public void user_clicks_sign_in_button() {

    }

    @Then("user can login to the home page")
    public void user_can_login_to_the_home_page() {

    }

    @Given("user in the home page")
    public void userInTheHomePage() {

    }
}
