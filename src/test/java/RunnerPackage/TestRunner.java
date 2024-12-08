package RunnerPackage;



import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features="/home/manojpadiginetidevops24/jenkins-workload/workspace/Automation_Test_main/src/main/java/Feature/Practise.feature", 
glue= {"StepDefinition"},
plugin = {"pretty",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		
		
}
		)
public class TestRunner {


}
