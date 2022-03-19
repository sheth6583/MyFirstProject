package interviewquestions;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ElementDisplayed {
	WebDriver driver;
	String baseUrl1;
	String baseUrl2;
@Before
public void setUp()throws Exception{
System.setProperty("webdriver.chrome.driver","C:\\Users\\me\\Downloads\\Day01Selenium (1)\\Day01\\chromedriver.exe");
	driver=new ChromeDriver();
	baseUrl1="https://courses.letskodeit.com/practice";
	baseUrl2="http://www.expedia.com";
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	driver.manage().window().maximize();}
@Test
public void testLetsKodeIt()throws InterruptedException{
	driver.get(baseUrl1);
	WebElement textBox=driver.findElement(By.id("displayed-text"));
	System.out.println("Text Box Displayed: " + textBox.isDisplayed());
	Thread.sleep(3000);
	WebElement hideButton=driver.findElement(By.id("hide-textbox"));
	hideButton.click();
	System.out.println("Click on hide Button");
	Thread.sleep(10000);
	System.out.println("Text Box Displayed: " + textBox.isDisplayed());
	WebElement showButton=driver.findElement(By.id("show-textbox"));
	showButton.click();
	System.out.println("Click on Show Button");
    System.out.println("Text Box Displayed: " + textBox.isDisplayed());}
@Test
public void testExpedia()throws InterruptedException{
	driver.get(baseUrl2);
	WebElement childDropdown=driver.findElement(By.id("package-1-age-select-1"));
	System.out.println("Child Dropdown Displayed: " + childDropdown.isDisplayed());}
@After
public void tearDown() throws Exception{
	Thread.sleep(2000);
	driver.quit();
}
}
		
	
	
	

	
	

	


