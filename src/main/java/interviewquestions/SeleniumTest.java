package interviewquestions;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SeleniumTest {
	private WebDriver driver;
	private String baseUrl;
@Before
public void setUp()throws Exception{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\me\\Downloads\\Day01Selenium (1)\\Day01\\chromedriver.exe");
	driver=new ChromeDriver();
	baseUrl="https://courses.letskodeit.com/practice";
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();}
@Test
public void testSelenium() throws Exception{
	driver.get(baseUrl + "/");
	driver.findElement(By.id("i90scv3glabel")).click();
	driver.findElement(By.id("practice")).click();}
@After
public void tearDown()throws Exception{
	Thread.sleep(3000);
	driver.quit();}
	
			
	
}
	
	
	


