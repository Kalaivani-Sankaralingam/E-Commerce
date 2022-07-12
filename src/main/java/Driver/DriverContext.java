package Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverContext {
    private WebDriver driver;
    public WebDriver getDriver() {
        if(driver == null)
        {
            try {
                System.setProperty("webdriver.chrome.driver", "C:\\My project\\chromedriver.exe");
                driver = new ChromeDriver();
                driver.manage().window().maximize();
            }catch (Exception e){
                System.out.print("Could not initiate the Chrome"+e);
            }
        }
        return this.driver;
    }
}
