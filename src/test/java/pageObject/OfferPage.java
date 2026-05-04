package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.function.Predicate;

public class OfferPage {
    public WebDriver driver;
    public OfferPage(WebDriver driver){
        this.driver = driver;
    }

    By search=By.xpath("//input[@type='search']");
    By ProdName = By.cssSelector("tr td:nth-child(1)");

    public void ScerchTextInOfferPage(String name){
        driver.findElement(search).sendKeys(name);
    }

    public String getProdName(){
      return driver.findElement(ProdName).getText();
    }

}
