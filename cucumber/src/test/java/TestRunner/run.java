package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;


import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)    //  class<Cucumber> cannot be resolved to a type

@CucumberOptions(
		features = ".//Features/LoginFeature.feature",
		glue = "StepDefintion",
		dryRun = false,         //true = feature file ke implimentaion check krega means stepdef class
		monochrome = true,      //output readable thevte 
		plugin = {"pretty","html:target/cucumber-reports/reports1.html"}     //

		)



public class run {
	//this class will be empty//

}
