import org.openqa.selenium.By;
import com.beust.jcommander.JCommander;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import com.beust.jcommander.Parameter;
import org.testng.TestNG;

public class NewTest {
	
	public WebDriver driver;
	
	@Test
  public void main() throws InterruptedException
  {
	  System.out.println("setting chromedriver");
	  System.setProperty("webdriver.chrome.driver","C:/Users/ag081u/Documents/aalok/softwares/chromedriver.exe");
      System.out.println("About to Initialize");
      ChromeOptions options = new ChromeOptions();
      options.addArguments("--disable-notifications");
      
   	  FirefoxProfile ffprofile = new FirefoxProfile();
  	  ffprofile.setPreference("dom.webnotifications.enabled", false);
  	  WebDriver driver = new FirefoxDriver(ffprofile);
     // WebDriver driver = new ChromeDriver(options); //instantiate a driver object in Selenium
     // WebDriver driver = new FirefoxDriver(); //instantiate a driver object in Selenium


      System.out.println("Initialized");
      //WebDriverWait waiting = new WebDriverWait(driver, 10, 100);
      
      driver.get("https://facebook.com/");  //navigate to a page.
      driver.findElement(By.id("email")).sendKeys("shilpa.jain812@gmail.com"); 
      driver.findElement(By.id("pass")).sendKeys("Facebook@123");
      
      driver.findElement(By.id("loginbutton")).click();
      System.out.println("Successfully logged in");
     // driver.findElement(By.partialLinkText("on your mind, Aalok?")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//span[contains(text(), 'Make Post')]")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//span[contains(text(), 'Post')]")).click();

      
  }
}
