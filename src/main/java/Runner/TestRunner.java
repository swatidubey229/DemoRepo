package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\swati\\workspace\\CucumberPract\\src\\main\\java\\Feature\\Deal.feature"
		,glue ="StepDefinition"
		,dryRun = false)


public class TestRunner {

}
