package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObject.BasicSalenium;
import pageObject.CheckoutPage;
import utils.TestContextSetup;

public class BasicsSelenium {
    public WebDriver driver;
    public TestContextSetup testContextSetup;
    public BasicSalenium basicSelenium;

    public BasicsSelenium(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.basicSelenium = testContextSetup.pageObjectManager.getBasicSalenium();
    }

    @Given("Learning the Basic of Selenium")
    public void Learning_the_Basic_of_Selenium() throws InterruptedException {
        basicSelenium.salenium();
    }
}
