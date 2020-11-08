package testRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
		(
		features= "Features/Blaze.feature",// where feature file is
		glue="stepDefinitions",// where stepdefinition is
		//dryRun=true, // cross check every method/step has corresponding step definition or not //without real execution 
		monochrome=true, // it will remove the un-necessary characters in your console window
		plugin={"pretty", "html:test-output"},
		tags = { "@blaze" }// add some report, gives output in console window very clearly.. html will generate in test-output folder..automatically created 
		
		)

public class TestRun {

}
