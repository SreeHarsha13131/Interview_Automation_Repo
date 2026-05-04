package pageObject;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
    public LandingPage landingPage;
    public OfferPage offerPage;
    public WebDriver driver;
    public CheckoutPage checkoutPage;
    public BasicSalenium basicSalenium;

    public PageObjectManager(WebDriver driver){
        this.driver=driver;
    }

    public LandingPage  getLandingPage(){
           landingPage = new LandingPage(driver);
           return landingPage;
    }
    public  OfferPage OffersPage(){
       return offerPage = new OfferPage(driver);
    }

    public  CheckoutPage getCheckoutPage(){
        return checkoutPage = new CheckoutPage(driver);
    }
    public BasicSalenium getBasicSalenium(){
        return basicSalenium = new BasicSalenium(driver);
    }
    public AmazonPage getAmazonPage(){
        return new AmazonPage(driver);
    }
}
