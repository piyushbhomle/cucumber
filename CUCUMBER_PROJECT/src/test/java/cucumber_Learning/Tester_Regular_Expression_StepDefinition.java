package cucumber_Learning;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Tester_Regular_Expression_StepDefinition {

	
	// ^ - beggining
	// $ - end     
	
	// [a-zA-Z]{1,} - Any no. of alphabets
	//  \\d+  - Any no. of digits
	// [a-zA-Z0-9]{1,}  -  alpha numeric
	// (.*) - list
	// [^\"]*  - anythinhg
	
	@Given("^I am intrested for learn ([a-zA-Z]{1,})$")
	public void i_am_intrested(String testing) {
		System.out.println("I am intrested for learn:"+testing);
	}
	
	@And("^I went Online website to find ([a-zA-Z]{1,}) classes$")
	public void i_went_online(String testing) {
		System.out.println("I went Online website to find:"+testing+"classes");
	}
	
	@And("^I went to see the nearest classes on ([a-zA-Z0-9]{1,})$")
	public void i_went_to_see_the(String visitdate) {
		System.out.println("I went to see the nearest classes on:"+visitdate);
	}
	
	@And("^they gave me some discount of 10% from ([^\"]*) to ([^\"]*)$")
	public void they_gave_me_some(String joindate, String enddate) {
		System.out.println("they gave me some discount of 10% from:"+joindate+" to:"+ enddate);
	}
	
	@When("^I heard about ([a-zA-Z]{1,}) fees$")
	public void i_heard_about(String testing) {
		System.out.println("I heard about:"+testing+ "fees");
	}
	
	@Then("^(\\d+) RS I realised this ammount is too much for this course$")
	public void i_realised_this(int numberofrupees) {
		System.out.println(numberofrupees+ "RS I realised this ammount is too much for this course");
	}
	
	@But("^Any how buy this course$")
	public void any_how_buy() {
		
		System.out.println("Any how buy this course");
	}
	
	
}
