package com.itview.testrunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"Feature"}, // folder name of feature file
		glue= {"com.itview.cucumbertest"}, // package name of step definition class
		plugin= {"pretty","html:target/cucumber-report.html"} // report format -> .html
		
		       )


public class TestRunner {

}
