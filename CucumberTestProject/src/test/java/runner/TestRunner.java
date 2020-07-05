package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features",
					glue = {"stepDefinitions"},
					plugin={"html:target/cucumber-html-report.html","json:target/cucumber.json","pretty:target/cucumber-pretty.txt",
							"usage:target/cucumber-usage.json","junit:target/cucumber-results.xml"
							})
public class TestRunner {

}






