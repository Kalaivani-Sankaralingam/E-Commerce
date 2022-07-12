package Driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverContext {
    private WebDriver driver;
    public WebDriver getDriver() {
        if(driver == null)
        {
            try {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                driver.manage().window().maximize();
            }catch (Exception e){
                System.out.print("Could not initiate the Chrome"+e);
            }
        }
        return this.driver;
    }
}
