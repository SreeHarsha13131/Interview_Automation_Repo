package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObject.AmazonPage;
import pageObject.LandingPage;
import utils.TestContextSetup;

public class AmazonStepDefinition {
    public WebDriver driver;
    TestContextSetup testContextSetup;
    AmazonPage amazonPage;

    public AmazonStepDefinition(TestContextSetup testContextSetup){
        this.testContextSetup=testContextSetup;
        this.amazonPage = testContextSetup.pageObjectManager.getAmazonPage();
    }
    @Given("Login in to the amazon application")
    public void login_in_to_the_amazon_application() {
        amazonPage.amazonLogoMethod();
    }
    @When("Click on the search field and Enter {string} text and click on the search btn")
    public void click_on_the_search_field_and_enter_text_and_click_on_the_search_btn(String string) {
      amazonPage.amazonSearchFieldMethod(string);
    }
    @Then("Select multiple {string} , {string} , {string} and {string}")
    public void select_multiple_brand_carrier_storage_capacity_and_os(String brand, String carrier, String storageCapacity, String operatingSystemVersion) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
