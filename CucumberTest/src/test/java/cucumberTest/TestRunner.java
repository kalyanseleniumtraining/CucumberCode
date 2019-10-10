package cucumberTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features", glue = "stepDefinitions", plugin = { "pretty", "html:target/cucumber-reports" },monochrome=true,tags="@smoke")
public class TestRunner {

}
