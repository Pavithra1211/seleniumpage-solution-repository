package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "D:/workspace/GiveInSolution/src/test/java/Features/Solution.feature",
		glue={"StepDefinitions"},
		tags={"@Validate_Oxygen_Link_Periodic_Table"},
		monochrome=false,
		strict=true,
		dryRun=false
		//format={"pretty","html:test-output"}
		)



public class SolutionRunner {

}
