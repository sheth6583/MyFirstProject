package stepDefinitions;



import io.cucumber.java.en.Given;

//import java.util.concurrent.TimeUnit;


//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

//import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.GooglePage;
//import pageObjects.HomePage;
import utilities.TestContext;

public class GoogleSteps2 {

GooglePage googlePage;
TestContext testContext;



public GoogleSteps2(TestContext context) {
	
	 testContext = context;
	   googlePage = testContext.getPageObjectManager().getGooglePage();}
	   
	@Given("I am on Home page")
	public void i_am_on_home_page()throws Throwable{
//	driver=new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	driver.get("http://www.yahoo.com");
	
	
	}

	@When("I navigate to Login page")
	public void i_navigate_to_login_page()throws Throwable{
		googlePage.clickSignInButton();
	   
	}
	@When("I enter  username and  password")
	public void i_enter_username_and_password()throws Throwable {
		googlePage.typeUsername();
		googlePage.clickNextButton();
		googlePage.typePassword();
		googlePage.nextButton();
		
	}

	@Then("Message display login successfully")
	public void message_display_login_successfully()throws Throwable {
	 googlePage.loginHeaderTitle();
	}

	@When("I logout frome the Application")
	public void i_logout_frome_the_application()throws Throwable {
		
	googlePage.mouseHover();
	// Actions action = new Actions(driver);
	//	 action.moveToElement(mainElement).click().perform();
		Thread.sleep(5000);
		googlePage.clickSignOutButton();

	   	}

	@Then("Message display logout successfully")
	public void message_display_logout_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}
