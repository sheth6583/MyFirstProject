package interviewquestions;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicActions {
	
	WebDriver driver;
	String baseUrl;
@Before
public void setUp()throws Exception{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\me\\Downloads\\Day01Selenium (1)\\Day01\\chromedriver.exe");
	driver=new ChromeDriver();
	baseUrl="https://courses.letskodeit.com/practice";
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();}
	
@Test
public void testSelenium()throws Exception{
	driver.get(baseUrl);
	driver.findElement(By.xpath("//*[@id='navbar-inverse-collapse']/div/div/a")).click();
	System.out.println("Clicked on login");
	driver.findElement(By.id("email")).sendKeys("test@gmail.com");
    System.out.println("Sending keys to username fields");
    driver.findElement(By.id("password")).sendKeys("test");
    System.out.println("Sending keys to password fields");
    driver.findElement(By.id("email")).clear();
    System.out.println("clearing username fields");}
@After
public void tearDown()throws Exception{
	Thread.sleep(5000);
	driver.quit();
    
	
}
}


