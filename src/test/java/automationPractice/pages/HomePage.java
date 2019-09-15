package automationPractice.pages;

import automationPractice.drivers.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends DriverManager {


    public String isOnHomePage() {
        return driver.getCurrentUrl ();

    }

    @FindBy(className = "login")
    private static WebElement SignInBtn;

    public void signInBtn() {
        SignInBtn.click ();
    }



}