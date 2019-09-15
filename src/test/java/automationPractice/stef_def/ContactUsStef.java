package automationPractice.stef_def;

import automationPractice.pages.ContactUsPage;
import automationPractice.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class ContactUsStef {
HomePage homePage=new HomePage ();
ContactUsPage contactUsPage=new ContactUsPage ();


    @Given("^i am on homepage$")
    public void i_am_on_homepage() throws Throwable {
        String title = homePage.isOnHomePage( );
        Assert.assertEquals("http://automationpractice.com/index.php",title);
    }

    @When("^i click on contact us button$")
    public void i_click_on_contact_us_button() throws Throwable {
        contactUsPage.selectContactUsLink();



    }

    @Then("^i should redirect to contact us page$")
    public void i_should_redirect_to_contact_us_page() throws Throwable {
        String actul = contactUsPage.isOnContactUsPage( );
        Assert.assertEquals("http://automationpractice.com/index.php?controller=contact",actul);


    }

    @When("^i enters all details$")
    public void i_enters_all_details() throws Throwable {
        contactUsPage.subjectHeading();
        contactUsPage.emailAddress("abc@gmail.com");
        contactUsPage.orderReference("12345");
        contactUsPage.message("when will i received my product");


    }

    @When("^click on send button$")
    public void click_on_send_button() throws Throwable {
        contactUsPage.selectSendButton();
    }

    @Then("^i should see the message sent sucessfully$")
    public void i_should_see_the_message_sent_sucessfully() throws Throwable {
        String actul = contactUsPage.confirmationMessage( );
        Assert.assertEquals("Your message has been successfully sent to our team.",actul);


    }



}
