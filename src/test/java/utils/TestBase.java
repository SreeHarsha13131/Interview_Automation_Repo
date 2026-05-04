package utils;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.function.DoubleUnaryOperator;

public class TestBase {
    public WebDriver driver;
    public WebDriver WebdriverManager() throws IOException {

        FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir")
                                          +"//src//test//resources//global.properties");
        Properties properties = new Properties();
        properties.load(fileInputStream);
        String url=properties.getProperty("QAUrl");

        if (driver == null) {
            if(properties.getProperty("browser").equalsIgnoreCase("chrome")) {
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +
                                    "//src//test//resources//chromedriver.exe");
                driver = new ChromeDriver();
            }
            if (properties.getProperty("browser").equalsIgnoreCase("firefox")) {
                //fire fox
            }
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get(url);
        }
        return driver;
    }
}
