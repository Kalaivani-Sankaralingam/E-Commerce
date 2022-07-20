package steps;

import Driver.DriverContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageobject.LoginPageObject;

public class LoginStepDefinition {
    private WebDriver driver;
    private LoginPageObject loginpage;
    private final static String expectedTitle="My account - My Store";

    public LoginStepDefinition(DriverContext driverContext){
        driver= driverContext.getDriver();
        loginpage=new LoginPageObject(driver);
    }

    @Given("user is in login page")
    public void user_is_in_login_page() {
        loginpage.openURL();
        loginpage.signIn();
    }
    @Given("user enters email address")
    public void user_enters_email_address() {
        loginpage.email();
    }
    @Given("user enters password")
    public void user_enters_password() {
        loginpage.password();
    }
    @When("user clicks sign in button")
    public void user_clicks_sign_in_button() {
        loginpage.clickSignIn();
    }
    @Then("user can login to the home page")
    public void user_can_login_to_the_home_page() {
        Assert.assertEquals("Successfully login to Home Page",expectedTitle,driver.getTitle());
    }
    @Given("user in the home page")
    public void userInTheHomePage() {
        loginpage.homePage();
    }

}
