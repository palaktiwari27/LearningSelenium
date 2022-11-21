import org.junit.runner.RunWith;

//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)  // Binding Junit with Cuucmber; bcz ultimatly junit will run the over all test
@CucumberOptions(
		publish = false,
		features = {"src/test/resources/bddFeatures"},
		glue = {"stepDefinitions"},
		plugin = {"html:target/report.html"},
		dryRun = true
		)
//
public class TestRunner {}
