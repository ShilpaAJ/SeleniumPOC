import org.openqa.selenium.By;
import com.beust.jcommander.JCommander;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import com.beust.jcommander.Parameter;
import org.testng.TestNG;

public class NewTest {
	
	public WebDriver driver;
	
	@Test
  public void main()
  {
	  //System.out.println("setting /usr/local/share/chromedriver");
	  //System.setProperty("webdriver.chrome.driver","/usr/local/share/chromedriver");
      System.out.println("About to Initialize");
      WebDriver driver = new FirefoxDriver(); //instantiate a driver object in Selenium
      System.out.println("Initialized");
      //WebDriverWait waiting = new WebDriverWait(driver, 10, 100);
      
      driver.get("https://facebook.com/");  //navigate to a page.
      driver.findElement(By.id("email")).sendKeys("shamit619"); 
      driver.findElement(By.id("pass")).sendKeys("pastasalsa22");
      
      driver.findElement(By.id("loginbutton")).click();
      System.out.println("Successfully logged in");
 
  }
}
