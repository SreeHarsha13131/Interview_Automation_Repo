package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonPage {
    public WebDriver driver;
    public AmazonPage(WebDriver driver){
        this.driver=driver;
    }
    By amazonLogo = By.xpath("//a[@aria-label='Amazon']");
    By amazonSearchField = By.xpath("//input[@type='text']");
    public void amazonLogoMethod(){
        driver.findElement(amazonLogo);
    }
    public void amazonSearchFieldMethod(String mobilePhone){
        driver.findElement(amazonSearchField).sendKeys(mobilePhone);
    }

}
