package pageobject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageObject {
    private WebDriver driver;
    @FindBy(how = How.XPATH, using = "//*[@id='block_top_menu']/ul/li[3]/a")
    WebElement category;
    @FindBy(how = How.XPATH, using = "//*[@id='layered_id_attribute_group_2']")
    WebElement sizeCheck;
    @FindBy(how = How.XPATH, using = "//*[@id='layered_id_attribute_group_14']")
    WebElement colorCheck;
    @FindBy(how = How.XPATH, using = "//*[@id='layered_id_feature_5']")
    WebElement compositions;
    @FindBy(how = How.XPATH, using = "//*[@id='selectProductSort']")
    WebElement sortBy;
    @FindBy(how = How.XPATH, using = "//*[@id='center_column']/ul/li/div/div[2]/div[2]/a[1]/span")
    WebElement addToCart;
    @FindBy(how = How.XPATH, using = "//*[@id='layer_cart']/div[1]/div[1]/h2")
    WebElement verifyText;
    final static private String expected = "Product successfully added to your shopping cart";

    public HomePageObject(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void category() {
        category.click();
    }

    public void sizeCheck() {
        sizeCheck.click();
    }

    public void colorCheck() {
        colorCheck.click();
    }

    public void compositions() {
        compositions.click();
    }

    public void sortBy() {
        Select sc = new Select(sortBy);
        sc.selectByVisibleText("Price: Lowest first");
    }

    public void addToCart() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        boolean isNotVisible = wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//*[@id='center_column']/ul/p"))));
        if (isNotVisible) {
            Actions action = new Actions(driver);
            action.moveToElement(driver.findElement(By.xpath("//*[@id='center_column']/ul/li/div"))).click(addToCart).build().perform();
        }
    }

    public void verifyText() {
        // String actual = verifyText.getText();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        String actual = wait.until(ExpectedConditions.visibilityOf(verifyText)).getText();
        Assert.assertEquals("Successful", expected, actual);
    }
}