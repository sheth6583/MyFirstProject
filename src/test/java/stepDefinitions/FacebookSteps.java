package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FacebookSteps {
	WebDriver driver;
	@Given("Open chrome and start application")
	public void open_chrome_and_start_application()throws Throwable {
	    
	   
	    driver=new ChromeDriver ();
	    driver.manage().window().maximize();
	    driver.get("http://www.facebook.com");
	}

	@When("I enter valid username and valid password")
	public void i_enter_valid_username_and_valid_password()throws Throwable {
		driver.findElement(By.id("email")).sendKeys("ami@learn-automation.com");
		driver.findElement(By.id("pass")).sendKeys("ami@12345");
	   
	}
	@When("I click on loginbutton")
	public void i_click_on_loginbutton()throws Throwable {
	   
	}

	@Then("user should be able to login successfully")
	public void user_should_be_able_to_login_successfully() throws Throwable {
	    driver.findElement(By.name("login")).click();
	  
	}


}
