package cucumber_Learning;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Background_vs_Hooks_StepDefinition {
	
	// before hook execute before background
	//beforestephook execute before background
	//Before > beforeStep > Background
	//Background has a business implication(Dynamic - we can change in case) but generally Before, BeforeStep is (order of execution)
	
	@Before 
	public void beforehook()
	{
		System.out.println("+++++ testing this execution before Background ++++++ ");
	}
	
	@BeforeStep
	public void beforestephook() {
		System.out.println("***** testing this beforestep hook execution before Background or not *******");
	}
	
	@AfterStep
	public void Afterstephook() {
		System.out.println("******* testing this Afterstep hook execution after Background or not *********");
	}
	
	@After
	public void afterhook()
	{
		System.out.println("++++++ Testing This execution After Background ++++++");
	}

	@Given("I am trying to invest my money in Mutual funds")
	public void i_am_trying_to_invest_my_money_in_mutual_funds() {

	}

	@Given("I decided to create a profile in an investment app")
	public void i_decided_to_create_a_profile_in_an_investment_app() {

	}

	@When("I verified my KYC successfully")
	public void i_verified_my_kyc_successfully() {

	}

	@Then("I am able to invest in mutual funds")
	public void i_am_able_to_invest_in_mutual_funds() {

	}

	@Then("I am able to invest in bonds")
	public void i_am_able_to_invest_in_bonds() {

	}

	@Then("I am able to invest in FD")
	public void i_am_able_to_invest_in_fd() {

	}

	@Then("I am able to invest in DigitalGold")
	public void i_am_able_to_invest_in_digital_gold() {

	}
	
}
