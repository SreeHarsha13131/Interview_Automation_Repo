package stepDefinitions;

import com.aventstack.extentreports.reporter.FileUtil;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.apache.pdfbox.pdmodel.interactive.form.FieldUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import utils.TestContextSetup;

import java.io.File;
import java.io.IOException;

public class Hooks {
    TestContextSetup testContextSetup;
    public Hooks(TestContextSetup testContextSetup){
        this.testContextSetup=testContextSetup;
    }

    @After
    public void AferSecnario() throws IOException {
        testContextSetup.testBase.WebdriverManager().quit();
        System.out.println("Closing the browser after execution===============+++++++++++===============");
    }

    @AfterStep
    public void addScreenShot(Scenario scenario) throws IOException {
        WebDriver driver = testContextSetup.testBase.WebdriverManager();
        if (scenario.isFailed()){
        File sourcePath=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            byte[] fileConctent = FileUtils.readFileToByteArray(sourcePath);
            scenario.attach(fileConctent,"image/png","image");
        }
        System.out.println("After this step");
    }
}
