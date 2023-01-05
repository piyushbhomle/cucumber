package cucumber_Learning;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;



public class Rediff_StepDefinition {
	public WebDriver driver;
	String url = "https://www.rediff.com/";
	SoftAssert sa = new SoftAssert();
	


	@Given("I Open a Chrome Browser")
	public void I_Open() {

		System.out.println("I Open a Chrome Browser");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


	}
	@And("I enter the Url in the address bar")
	public void I_enter_the() {
		System.out.println("I enter the Url in the address bar");
		driver.get(url);


	}
	@Then("I click sign on link")
	public void I_click() {
		System.out.println("I click sign on link");
		driver.findElement(By.className("signin")).click();
	}

	@And("I enter RediffMail page")
	public void  I_enter_RediffMail() {
		System.out.println("I enter RediffMail page");
		String actualTitle = "Rediffmail";
		String expectedTitle = driver.getTitle();
		sa.assertEquals(actualTitle, expectedTitle);
		sa.assertAll();

	}

	@And("I Enter correct user name and password")
	public void I_Enter_correct() {
		System.out.println("I Enter correct user name and password");
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("piyushbhomle");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Kusummore99@");

	}

	@Then("I click sign in button")
	public void I_click_sign()
	{
		System.out.println("I click sign in button");
		driver.findElement(By.xpath("//input[@title='Sign in']")).click();

	}


	@And("I Check if I am in the Inbox Page of RediffMail")
	public void I_Check_if_I_am()
	{
		System.out.println("I Check if I am in the Inbox Page of RediffMail");
       
	}


	@Given("I am inside the inbox Page")
	public void I_am_inside() {
		System.out.println("I am inside the inbox Page");
	}
	
	
	@And("I Validate the presence of the Logout link")
	public void I_Validate_the_presence() {
		System.out.println("I Validate the presence of the Logout link");
//		sa.assertTrue(driver.findElement(By.xpath("//a[@class='rd_logout']")).isEnabled());
//		sa.assertAll();
		
	}
	
	
	@When("I click on the Logout Link") 
	public void I_click_on() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		System.out.println("I click on the Logout Link");
		
		driver.findElement(By.xpath("//a[@class='rd_logout']")).click();
	}
	
	@Then("I am Logged out of RediffMail")
	public void I_am_Logged_out() {
		System.out.println("I am Logged out of RediffMail");
		String actualTitle = "Rediff MyPage";
		String expectedTitle = driver.getTitle();
		sa.assertEquals(actualTitle, expectedTitle);
		sa.assertAll();
	}
	
	
	@And("I can Validate the presence of RediffHome link")
	public void I_can_Validate() {
		System.out.println("I can Validate the presence of RediffHome link");
		sa.assertTrue(driver.findElement(By.xpath("//span[@id='username']")).isEnabled());
		sa.assertAll();
	}



}
