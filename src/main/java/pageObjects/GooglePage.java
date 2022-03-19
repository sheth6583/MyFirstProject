package pageObjects;


//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class GooglePage {

    public GooglePage(WebDriver webDriver) {
        PageFactory.initElements(new AjaxElementLocatorFactory(webDriver, 15), this);
    }
   
    @FindBy(xpath = "//a[contains(text(),'Sign in')]")
    private WebElement signInButton;

    @FindBy(name ="username")
    private WebElement usernameField;
    
    @FindBy(name = "signin")
    private WebElement nextButton;

    @FindBy(name = "password")
    private WebElement passwordField;
    
    @FindBy(id = "login-signin") 
    private WebElement clickNextButton;

     @FindBy(name = "verifyPassword")
    private WebElement verifyPasswordButton;

    @FindBy(xpath = "//*[@id='ybar-logo']/img[1]")
    private WebElement loginHeaderTitle;

   
    @FindBy(xpath = "//*[@id='ybarAccountMenuOpener']/span")
    private WebElement accountMenuOpener;
    
    @FindBy(xpath = "profile-signout-link")
   // private WebElement signOutButton;
    private WebElement signOutButton;
    
   
    public void clickSignInButton() {
      signInButton.isDisplayed();
     signInButton.isEnabled();
      signInButton.click();
    }

    public void typeUsername() {
    	usernameField.isDisplayed();
        usernameField.isEnabled();
        usernameField.sendKeys("sheth6583@yahoo.com");
    }
    public void clickNextButton() {
    	nextButton.isDisplayed();
    	nextButton.isEnabled();
    	nextButton.click();
    }
    

    public void typePassword() {
    	  passwordField.isDisplayed();
      passwordField .isEnabled();
       passwordField.sendKeys("shrinathji");
       }
    
    public void nextButton() {
    	clickNextButton.isDisplayed();
    	clickNextButton.isEnabled();
    	clickNextButton.click();
    }


    public void verifyPassword() {
       verifyPasswordButton.isDisplayed();
       verifyPasswordButton.click();
    }

    public void loginHeaderTitle() {
       loginHeaderTitle.isDisplayed();}
    
    
    public void clickSignOutButton() {
    	signOutButton.isDisplayed();
    	signOutButton.isEnabled();
    	signOutButton.click();
    }

    public void mouseHover() {
    	WebDriver webDriver ;
    	 ChromeOptions chromeOptions = new ChromeOptions();
    	 webDriver = new ChromeDriver(chromeOptions);
    	 accountMenuOpener.isDisplayed();
    	 accountMenuOpener.isEnabled();
    	 Actions action = new Actions(webDriver);
         action.moveToElement(accountMenuOpener).click().perform();
    }
    }

    
   
   

   