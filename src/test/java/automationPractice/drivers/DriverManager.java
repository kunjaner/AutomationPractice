package automationPractice.drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class DriverManager {
    public static WebDriver driver;
    private String browser = "chrome";


    public DriverManager() {
        PageFactory.initElements(driver, this);
    }

    public void openBrowser() {
        switch (browser) {
            case "ie":
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver ();
                break;
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver ();
                break;
            default:
                driver = new FirefoxDriver ();
        }
    }


    public void maxBroser() {
        driver.manage().window().maximize();
    }



    public void navigateTo(String url) {
        driver.get(url);
    }

    public void closeBrowser() {
        driver.quit();
    }

    public void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
// extra utility

    public void applyImplicit() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public WebElement waitUntilElementClickable(WebElement element) {
        return new WebDriverWait (driver, 15).until(ExpectedConditions.elementToBeClickable(element));
    }

    public Boolean waitUntilElementClickable(By by){
        return new WebDriverWait (driver,15).until (ExpectedConditions.invisibilityOfElementLocated (by));
    }
}
