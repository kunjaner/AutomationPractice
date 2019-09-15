package automationPractice.pages;

import automationPractice.drivers.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ContactUsPage extends DriverManager {



   @FindBy(linkText = "Contact us")
  private WebElement contactUsBtn;


  @FindBy(css ="select[name='id_contact']")
  private WebElement subjectHeading;


    @FindBy(css ="input[id='email']")
    private WebElement emailAddress;

    @FindBy(css ="input[name='id_order']")
    private WebElement orderRef;

    @FindBy(css = "textarea[id='message']")
    private WebElement messageBox;

    @FindBy(xpath = "//span[contains(text(),'Send')]")
    private WebElement sendButton;


    @FindBy(xpath = "//p[@class='alert alert-success']")
    private WebElement messageSent;


    public void selectContactUsLink(){
contactUsBtn.click ();
    }

    public String isOnContactUsPage(){
        return driver.getCurrentUrl();
    }


    public void subjectHeading(){
       Select select = new Select(subjectHeading);
        select.selectByValue("2");
    }

    public void emailAddress(String email){
        emailAddress.sendKeys(email);
    }

    public void orderReference(String ref){
        orderRef.sendKeys(ref);
    }

/*  file uplode path should be differnt if you run form different machine so i have disabled it.

    public void attachFile(){
        driver.findElement(By.cssSelector("input[id='fileUpload']")).sendKeys("");
    }*/

    public void message(String msg){
        messageBox.sendKeys(msg);
    }

    public void selectSendButton(){
        sendButton.click();
    }

    public String confirmationMessage(){
        return messageSent.getText();


    }



}
