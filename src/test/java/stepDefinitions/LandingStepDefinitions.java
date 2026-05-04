package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pageObject.LandingPage;
import utils.TestContextSetup;

public class LandingStepDefinitions {
    public WebDriver driver;
    public String landingProdName;
    public String offerProductName;
    LandingPage landingPage;
    TestContextSetup testContextSetup;

    public LandingStepDefinitions(TestContextSetup testContextSetup){
        this.testContextSetup=testContextSetup;
        this.landingPage = testContextSetup.pageObjectManager.getLandingPage();

    }
    @Given("User in on GreenCart Landing Page")
    public void user_in_on_green_cart_landing_page() {
        Assert.assertTrue(landingPage.getTitleLandingPage().contains("GreenKart"));
        System.out.println("Is it executing Landing page given");

    }
    @When("^User search with ShortName (.+) and extracted actual name of the product$")
    public void user_search_with_short_name_and_extracted_actual_name_of_the_product(String ShortName) throws InterruptedException {
        System.out.println("Is it executing Landing page When");
//        landingPage = testContextSetup.pageObjectManager.getLandingPage();
        landingPage.searchItem(ShortName);
        Thread.sleep(1000);
        System.out.println("Is it executing Landing page When de-bugging");
        testContextSetup.landingProdName=landingPage.getProdName().split("-")[0].trim();
        System.out.println(testContextSetup.landingProdName);
        System.out.println(testContextSetup.landingProdName + "- - -- is extracted from the home page");
    }
//
//    @When("Added {String} items of the  selected product to the cart")
//    public void Added_items_product(String quantity){
//
//    }

    @And("Added {string} items of the  selected product to the cart")
    public void addedItemsOfTheSelectedProductToTheCart(String quantity) {
        landingPage.incrementQuantity(Integer.parseInt(quantity));
        landingPage.addToCart();
    }
}
