package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"classpath:features"}, glue = {"stepDefinitions"},
        tags = "@contact-us", monochrome = true, dryRun = false,
        plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json"})
//@CucumberOptions(features = "src/test/resources/features/Login.feature", glue = {"stepDefinitions"})
public class runnerTest extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
//public class runnerTest {
//}

