package interviewquestions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverMac {

	public static void main(String[] args)throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\me\\Downloads\\Day01Selenium (1)\\Day01\\chromedriver.exe");
		String baseURL="http://www.google.com";
	    WebDriver driver;
		driver=new ChromeDriver();
		driver.get(baseURL);
		Thread.sleep(3000);
		driver.quit();
		

	}

}
