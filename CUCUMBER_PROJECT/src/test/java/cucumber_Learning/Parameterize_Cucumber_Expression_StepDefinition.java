package cucumber_Learning;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Parameterize_Cucumber_Expression_StepDefinition {

	// https://github.com/cucumber/cucumber-expressions#readme
	
	// {int}   -    Matches integers, for example 71 or -19. Converts to a 32-bit signed integer if the platform supports it.
	// {float} -    Matches floats, for example 3.6, .8 or -9.2. Converts to a 32 bit float if the platform supports it.
	// {word}  -    Matches words without whitespace, for example banana (but not banana split).
	// {string}-    Matches single-quoted or double-quoted strings, for example "banana split" or 'banana split' (but not banana split).
	                //Only the text between the quotes will be extracted. The quotes themselves are discarded. 
	                //Empty pairs of quotes are valid and will be matched and passed to step code as empty strings.
	// {}      -    Matches anything (/.*/).
	// {bigdecimal}-Matches the same as {float}, but converts to a BigDecimal if the platform supports it.
	// {double}	 -  Matches the same as {float}, but converts to a 64 bit float if the platform supports it.
	// {biginteger}-Matches the same as {int}, but converts to a BigInteger if the platform supports it.
	// {byte} - 	Matches the same as {int}, but converts to an 8 bit signed integer if the platform supports it.
	// {short} -    Matches the same as {int}, but converts to a 16 bit signed integer if the platform supports it.
	// {long} - 	Matches the same as {int}, but converts to a 64 bit signed integer if the platform supports it.
	
	@Given("I open a {word} Browser")
	public void i_open_a(String browserName) {
		System.out.println("I open a"+browserName+ "Browser");
	}
	 @And("I enter the url {string}")
	 public void i_enter_the_url(String travelURL) {
		 System.out.println("I enter the url:"+ travelURL);
	 }
	 
	 @Then("I click on {word} button")
	 public void i_click_on(String actionButton) {
		 System.out.println("I click on"+actionButton+" button");
	 }
	 
	 @And("I enter my mobile number {int}")
	 public void i_enter_my_mobile(int contact) {
		 System.out.println("I enter my mobile number:"+ contact);
		 
	 }
	 @Then("I click on the continue button")
	 public void i_click_on_the() {
		 System.out.println("I click on the continue button");
	 }
	 @And("it sends OTP {} in my mobile number")
	 public void it_send_OTP(String otpNewType) {
		 System.out.println("it sends OTP"+ otpNewType + "in my mobile number");
	 }
	 @But("it was a fake OTP")
	 public void it_was_a_fake() {
		 System.out.println("it was a fake OTP");
	 }
}
