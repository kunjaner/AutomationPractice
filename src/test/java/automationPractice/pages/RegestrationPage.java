package automationPractice.pages;

import automationPractice.drivers.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegestrationPage extends DriverManager {

    @FindBy(xpath = "//form[@id='create-account_form']//span[1]")
    private WebElement createAnAccount;

    @FindBy(xpath = "//input[@id='email_create']")
    private WebElement emailBox;


    @FindBy(xpath = "//li[contains(text(),'An account using this email address has already be')] ")
    private WebElement errorBox;


    public void enterEmail(String email){
        emailBox.sendKeys (email);

    }

    public void clickOnCreateAnAccount(){
        createAnAccount.click ();
    }

    public WebElement returnErrorBox() {
        return errorBox;
    }
}