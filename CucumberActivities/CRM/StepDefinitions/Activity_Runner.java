package StepDefinitions;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

 
@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/Feature",
    glue = {"StepDefinitions"},
//  tags ="@CRM_Activity_4",
    plugin = {"html:src/test/java/Reports/test-report.html"},

    monochrome = true
)

public class Activity_Runner {
	
	

}