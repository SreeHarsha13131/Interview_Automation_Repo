package utils;

import org.openqa.selenium.WebDriver;
import pageObject.PageObjectManager;

import java.io.IOException;

public class TestContextSetup {
    public WebDriver driver;
    public String landingProdName;
    public TestBase testBase;
    public PageObjectManager pageObjectManager;
    public GenericUtils genericUtils;

    public TestContextSetup() throws IOException {
        testBase =new TestBase();
        pageObjectManager = new PageObjectManager(testBase.WebdriverManager() );
        genericUtils = new GenericUtils(testBase.WebdriverManager());
    }
}

