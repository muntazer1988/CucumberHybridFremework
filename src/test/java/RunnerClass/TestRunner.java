package RunnerClass;

import org.junit.runner.RunWith;

import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//tags="@execute"
// "pretty" - show the console report in pretty mode



@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/featureFiles",
		glue={"StepDefinitionFiles", "Hooks"},  //tags="@test",
		plugin={"html:target/CucumberReports/htmlReport.html",
				"json:target/CucumberReports/jsonlReport.json",
				"junit:target/CucumberReports/junitlReport.junit",
				"pretty"}
				) 

public class TestRunner {
	

}
