package automationPractice.stef_def;

import automationPractice.drivers.DriverManager;
import automationPractice.pages.HomePage;
import automationPractice.pages.RegestrationPage;
import com.sun.tools.internal.xjc.Driver;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import javax.swing.*;

public class RegestrationStef extends DriverManager {

    // can not create acoount when you have already register email.


     HomePage homePage=new HomePage ();
    RegestrationPage regestrationPage=new RegestrationPage ();


    @When("^i click on sign in link$")
    public void i_click_on_sign_in_link() throws Throwable {
       homePage.signInBtn ();


    }



    @When("^i enter \"([^\"]*)\" to create new account$")
    public void i_enter_to_create_new_account(String arg1) throws Throwable {
        regestrationPage.enterEmail (arg1);
    }



    @When("^i click Create an account$")
    public void i_click_Create_an_account() throws Throwable {
           regestrationPage.clickOnCreateAnAccount ();

    }


    @Then("^i should see \"([^\"]*)\"$")
    public void i_should_see(String arg1) throws Throwable {
       String actual =regestrationPage.returnErrorBox ().getText ();
       Assert.assertEquals ("An account using this email address has already been registered. Please enter a valid password or request a new one.",actual);

    }

}
