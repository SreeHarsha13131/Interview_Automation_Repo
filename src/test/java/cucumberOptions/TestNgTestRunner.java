package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(features="src/test/features",glue= "stepDefinitions"
,monochrome = true, tags="@BasicSelenium"
,plugin={"html:target/cucumber.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumber" +
        "Adapter:","rerun:target/failed_scenario.txt"})
public class TestNgTestRunner extends AbstractTestNGCucumberTests {
//    @Override
//    @DataProvider(parallel = true)
//    public Object[][] scenarios(){
//        return super.scenarios();
//    }

}
