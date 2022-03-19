package interviewquestions;


import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


// Please change the extension of the file to .java before using
// I have to change it to .txt because udemy does not allow uploading .java files
public class SwitchFrame {
	private WebDriver driver;
	private String baseUrl;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\me\\Downloads\\Day01Selenium (1)\\Day01\\chromedriver.exe");
		driver = new ChromeDriver();
		baseUrl="https://courses.letskodeit.com/practice";

		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}

	@Test
	public void test() throws InterruptedException {
		Thread.sleep(10000);
		// Switch to frame by Id
		driver.switchTo().frame("courses-iframe");
		// Switch to frame by name
		//driver.switchTo().frame("iframe-name");
		// Switch to frame by numbers
		//driver.switchTo().frame(0);
		
		Thread.sleep(10000);
		
		WebElement searchBox = driver.findElement(By.id("search"));
		searchBox.sendKeys("python");
		
		driver.switchTo().defaultContent();
		Thread.sleep(6000);
		driver.findElement(By.id("name")).sendKeys("Test Successful");
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(10000);
		driver.quit();
	}
}


