package interviewquestions;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Please change the extension of the file to .java
// I added .txt because udemy currently does not allow to add .java files
public class ElementState {
	WebDriver driver;
	String baseUrl;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\me\\Downloads\\Day01Selenium (1)\\Day01\\chromedriver.exe");
		driver = new ChromeDriver();
		baseUrl="https://courses.letskodeit.com/practice";
		driver.manage().timeouts().implicitlyWait(10,  TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseUrl);
	}

	@Test
	public void test() {
		WebElement e1 = driver.findElement(By.id("enabled-button"));
		
		System.out.println("E1 is Enabled? " + e1.isEnabled());
		
		WebElement e2 = driver.findElement(By.id("gs_taif0"));
		System.out.println("E2 is Enabled? " + e2.isEnabled());
		
		WebElement e3 = driver.findElement(By.id("lst-ib"));
		System.out.println("E3 is Enabled? " + e3.isEnabled());
		
		e3.sendKeys("letskodeit");
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}


}
