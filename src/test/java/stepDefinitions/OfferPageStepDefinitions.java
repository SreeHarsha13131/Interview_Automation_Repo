package stepDefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.json.JsonOutput;
import org.testng.Assert;
import pageObject.LandingPage;
import pageObject.OfferPage;
import utils.TestContextSetup;

import java.util.Iterator;
import java.util.Set;

public class OfferPageStepDefinitions {
    public WebDriver driver;
    public String landingProdName;
    public String offerProductName;
    TestContextSetup testContextSetup;
    public OfferPageStepDefinitions(TestContextSetup testContextSetup){
        this.testContextSetup =testContextSetup;
    }
    @Then("^user searched for (.+) shortname in the offers page$")
    public void user_searched_for_same_shortname_in_the_offers_page_to_check_if_product_exist(String shortName) throws InterruptedException {
        System.out.println("Checking of OfferPageStepDefinitions in then");
        switchToOfferPage();
        OfferPage offerPage = testContextSetup.pageObjectManager.OffersPage();
        offerPage.ScerchTextInOfferPage(shortName);
        Thread.sleep(3000);
        offerProductName = offerPage.getProdName();
        System.out.println("offerProductName - - :-"+offerProductName);
    }
    public void switchToOfferPage(){
        //if the control is already present in the child
        //if(testContextSetup.driver.getCurrentUrl().equalsIgnoreCase("childWindowUrl"))
        LandingPage landingPage = testContextSetup.pageObjectManager.getLandingPage();
        landingPage.selectTopDealesPage();
        testContextSetup.genericUtils.switchWindowToChild();
    }
    @Then("validate product name in offers page matches with landing Page")
        public void validate_product_in_offerPage() {
        System.out.println("In then "+offerProductName);
        System.out.println("In then "+testContextSetup.landingProdName);
        Assert.assertEquals(offerProductName,testContextSetup.landingProdName);
        }
}