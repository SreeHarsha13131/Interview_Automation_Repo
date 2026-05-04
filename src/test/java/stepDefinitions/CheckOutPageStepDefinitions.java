package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObject.CheckoutPage;
import pageObject.LandingPage;
import utils.TestContextSetup;

public class CheckOutPageStepDefinitions {
    public WebDriver driver;
    public String landingProdName;
    public String offerProductName;
    public CheckoutPage  checkOutPage;
    TestContextSetup testContextSetup;

    public CheckOutPageStepDefinitions(TestContextSetup testContextSetup){
        this.testContextSetup=testContextSetup;
        this.checkOutPage=testContextSetup.pageObjectManager.getCheckoutPage();
    }
//    @Then("And verify user has ability to enter promo code and place the order")
//    public void verify_user_has_ability_to_enter_promo_code_and_placet_the_order(){
//        checkOutPage = testContextSetup.pageObjectManager.getCheckoutPage();
//
//    }
    @Then("verify user has ability to enter promo code and place the order")
public void verifyUserHasAbilityToEnterPromoCodeAndPlaceTheOrder() {
    Assert.assertTrue(checkOutPage.VerifyPromoBtn());
    Assert.assertTrue(checkOutPage.VerifyPlaceOrder());
}


    @Then("^user proceeds to Checkout and validate the (.+) items in checkout page$")
    public void user_Proceeds_to_checkout(String name){
        checkOutPage.CheckoutItem();
//        Thread.sleep(1000);
    }


}

