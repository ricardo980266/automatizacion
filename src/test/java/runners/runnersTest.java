package runners;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;


//@RunWith(Cucumber.class)
@CucumberOptions(features = {"classpath:features"}, glue = {"stepDefinitions"},
        tags = "@regression", monochrome = true, dryRun = false,
        plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json"})


public class runnersTest extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}

