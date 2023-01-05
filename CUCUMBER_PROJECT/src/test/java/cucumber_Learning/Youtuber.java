package cucumber_Learning;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Youtuber {

	 @Given("I am intrested in learning making video")
	 public void i_am() {
		 
		 System.out.println("I am intrested in learning making video");
	 }
	 
	 @Then("I saw lots of video")
	 public void i_saw() {
		 
		 System.out.println("I saw lots of video");
	 }
	 
	 @And("save some video")
	 public void save_some() {
		 
		 System.out.println("save some video");
	 }
	 
	 @When("downloading some video create problem")
	 public void downloading() {
		 
		 System.out.println("downloading some video create problem");
	 }
	 
	 @And("after some time solve this issue")
	 public void after_some() {
		 
		 System.out.println("after some time solve this issue");
	 }
	 
	 
	   
	   

}
