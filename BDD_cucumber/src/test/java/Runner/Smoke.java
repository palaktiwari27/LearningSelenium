package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) //like run with cucumber
@CucumberOptions(features="src/test/resources/Features",glue={"StepDefination"},
plugin= {"pretty","html:target/reports"},
tags="@Smoke")
public class Smoke {

}
