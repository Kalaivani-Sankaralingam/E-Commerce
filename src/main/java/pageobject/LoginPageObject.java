package pageobject;

import org.junit.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObject {
    private WebDriver driver;
    private boolean verifyEmail;
    private boolean verifyPassWord;
    Boolean verifyBtnSignIn;
    @FindBy(how= How.CSS, using ="a.login")
    WebElement signIn;
    @FindBy(how=How.XPATH,using="//*[@id='email']")
    WebElement email;
    @FindBy(how=How.XPATH,using="//*[@id=\"passwd\"]")
    WebElement password;
    @FindBy(how=How.XPATH , using="//*[@id='SubmitLogin']")
    WebElement btnSignIn;

    public LoginPageObject(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void openURL(){
        driver.get("http://www.automationpractice.com");
    }
    public void signIn(){
        signIn.click();
    }
    public void email(){
        verifyEmail=email.isDisplayed();
        Assert.assertTrue(verifyEmail);
        email.sendKeys("practiceautomation@test.com");
    }
    public void password(){
        verifyPassWord=password.isDisplayed();
        Assert.assertTrue(verifyPassWord);
        password.sendKeys("test@123");
    }
    public void clickSignIn() {
        verifyBtnSignIn = btnSignIn.isDisplayed();
        Assert.assertTrue(verifyBtnSignIn);
        btnSignIn.click();
    }
}
