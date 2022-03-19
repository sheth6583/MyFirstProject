package interviewquestions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindByClassName {
	public static void main(String[]args)throws Exception{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\me\\Downloads\\Day01Selenium (1)\\Day01\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    String baseUrl="http://demostore.x-cart.com/";
	    driver.manage().window().maximize();
	    driver.get(baseUrl);
	    Thread.sleep(5000);
	   driver.findElement(By.cssSelector("input[id^='substring-def']")).sendKeys("iphone");
	   driver.findElement(By.cssSelector("input[id$='-default]")).sendKeys("iphone");
	   Thread.sleep(5000);
	    driver.findElement(By.cssSelector("input[id*=string-defa]")).sendKeys("iphone");
	    
	    Thread.sleep(5000);
	    
	    
	    driver.quit();
	}
	

}
