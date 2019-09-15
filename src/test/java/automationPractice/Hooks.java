package automationPractice;


import automationPractice.drivers.DriverManager;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.junit.Test;

public class Hooks {
    private DriverManager driverManager = new DriverManager();

    @Before
    public void setUp() {
        driverManager.openBrowser();
        driverManager.navigateTo("http://automationpractice.com/index.php");
        driverManager.maxBroser();
        driverManager.applyImplicit();
    }

  @After
    public void tearDown() {
        driverManager.closeBrowser();
    }

}
