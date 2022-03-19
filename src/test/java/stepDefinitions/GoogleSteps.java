//package stepDefinitions;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class GoogleSteps {
//	WebDriver driver;
//	@Given("I am on Home page")
//	public void i_am_on_home_page()throws Throwable{
//	driver=new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	driver.get("http://www.yahoo.com");
//	
//	  
//	}
//
//	@When("I navigate to Login page")
//	public void i_navigate_to_login_page()throws Throwable{
//		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
//	   
//	}
//	@When("I enter  username and  password")
//	public void i_enter_username_and_password()throws Throwable {
//		driver.findElement(By.name("username")).sendKeys("sheth6583@yahoo.com");
//	driver.findElement(By.name("signin")).click();
//	driver.findElement(By.name("password")).sendKeys("shrinathji");
//	driver.findElement(By.name("verifyPassword")).click();	
//	   
//	}
//
//	@Then("Message display login successfully")
//	public void message_display_login_successfully()throws Throwable {
//	   driver.findElement(By.xpath("//*[@id='ybar-logo']/img[1]")).click();
//	}
//
//	@When("I logout frome the Application")
//	public void i_logout_frome_the_application()throws Throwable {
//		
//	WebElement mainElement=driver.findElement(By.xpath("//*[@id='ybarAccountMenuOpener']/span"));
//	 Actions action = new Actions(driver);
//		 action.moveToElement(mainElement).perform();
//		Thread.sleep(5000);
//		driver.findElement(By.id("profile-signout-link")).click();
//
//	   	}
//
//	@Then("Message display logout successfully")
//	public void message_display_logout_successfully() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//
//}
