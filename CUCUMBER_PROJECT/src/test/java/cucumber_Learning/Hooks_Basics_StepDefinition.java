package cucumber_Learning;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Hooks_Basics_StepDefinition {
	
//	@Before("@Hook1")                                 //2
//	public void beforehook() {
//		System.out.println("before ,,,, hook1"); 
//	}
//	
//	@Before (order = 1)                                         //1
//	public void beforestephook() {
//		System.out.println("blank1");         
//	}
//	
//	@After ("@Hook1")                                        //1
//	public void afterhook() {
//		System.out.println("After ,,,, hook1");
//	}
//	
//	@After (order = 1)                                             //2
//	public void afterstephook() {
//		System.out.println("blank2");
//	}
	
	
	
	
	
	
	   //order //before  = 123456789
	  // order //after   = 987654321
		
//		@Before(order = 1 )
//		public void beforehook() {
//			System.out.println("++++++++++ This is before hook1 which will execute before every scenario ++++++++++++");
//		}
//		
//		@Before (order = 2 )
//		public void beforestephook() {
//			System.out.println("*********** This is before hook2 which will execute before every Scenario but after beforehook1 *************");
//		}
//		
//		@After (order = 2 )
//		public void afterhook() {
//			System.out.println("++++++++++ This is After hook1 which will execute After every scenario ++++++++++++");
//		}
//		
//		@After (order = 1 )
//		public void afterstephook() {
//			System.out.println("*********** This is after hook2 which will execute after every Scenario but after beforehook1 *************");
//		}
	
	
	
	
	
	
//	@Before
//	public void beforehook() {
//		System.out.println("++++++++++ This is before hook which will execute before every scenario ++++++++++++");
//	}
//	
//	@After
//	public void afterhook() {
//		System.out.println("++++++++++ This is After hook which will execute After every scenario ++++++++++++");
//	}
//	
//	@BeforeStep
//	public void beforestephook() {
//		System.out.println("*********** This is before stephook which will execute before every each step *************");
//	}
//	
//	@AfterStep
//	public void afterstephook() {
//		System.out.println("*********** This is after stephook which will execute after every each step *************");
//	}
	

	@Given("I am Trying to open RediffMail Login page in a certain browser")
	public void i_am_trying_to_open_rediff_mail_login_page_in_a_certain_browser() {
	  
	}

	@Given("I think i enteredthe correct usename and password")
	public void i_think_i_enteredthe_correct_usename_and_password() {
	
	}

	@When("I hit the enter button")
	public void i_hit_the_enter_button() {
	
	}

	@Then("I am re-directed to the login page in sometime")
	public void i_am_re_directed_to_the_login_page_in_sometime() {

	}
	
	@Given("I am Trying to open YohooMail Login page in a certain browser")
	public void i_am_trying_to_open_yohoo_mail_login_page_in_a_certain_browser() {

	}

	@Given("I think i entered the email")
	public void i_think_i_entered_the_email() {

	}

	@When("I hit the submitgreen button")
	public void i_hit_the_submitgreen_button() {

	}

	@Then("I am navigate to the login page in sometime")
	public void i_am_navigate_to_the_login_page_in_sometime() {
	 
	}

	
}
