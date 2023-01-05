package runner_Files;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)


@CucumberOptions(
		
		dryRun = false,
		publish = true,
		monochrome = true,
		features = {"src/test/resources"},
		glue = {"cucumber_Learning"},
		plugin = {"pretty","html:target/site/cucumber-html","json:target/cucumber1/json"},
		tags = "@BackgroundvsHooks"
		
		)


public class Runner_JUNIT {

}
