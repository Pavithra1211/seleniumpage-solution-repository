package TestRunner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "D:\\GitProjects\\giveIn-solution-repository\\src\\test\\java\\Features\\Solution.feature",
		glue={"StepDefinitions"},
		tags={"@Verify_whether_page_is_featured_article,@Take_screenshot_of_righthand_box_elements"},
		monochrome=false,
		strict=true,
		dryRun=false,
		plugin = {"pretty","html:test-output"}
		)



public class SolutionRunner {

}
