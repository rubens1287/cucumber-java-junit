package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
                features = "features",
                glue = "gherkin",
                tags = {"@Login"},
                plugin = {"junit:target/junit/junit.xml",
                        "pretty",
                        "html:target/cucumber-reports/cucumber-pretty",
                        "json:target/cucumber-reports/CucumberTestReport.json"})
public class RunTest {

}
