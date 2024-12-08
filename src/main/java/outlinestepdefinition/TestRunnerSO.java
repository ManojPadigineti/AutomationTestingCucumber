package outlinestepdefinition;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;





@RunWith(Cucumber.class)
@CucumberOptions(features="/home/manojpadiginetidevops24/jenkins-workload/workspace/Automation_Test_main/src/main/java/Feature/ScenarioOutline.feature", 
glue= {"outlinestepdefinition"},
plugin = {"json:target/cucumber11.json",
		"html:target/cucumber11.html"},
dryRun = false,
monochrome = true)


public class TestRunnerSO {

}
