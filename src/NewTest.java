import org.openqa.selenium.By;
import com.beust.jcommander.JCommander;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.beust.jcommander.Parameter;
import org.testng.TestNG;

public class NewTest {
	
	public WebDriver driver;
	
	@Test
  public void main()
  {
	  System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver"); //Set a system property “webdriver.chrome.driver” to the path of your ChromeDriver.exe file
	  
      WebDriver driver = new ChromeDriver(); //instantiate a driver object in Selenium
      //WebDriverWait waiting = new WebDriverWait(driver, 10, 100);
      
      driver.get("https://facebook.com/");  //navigate to a page.
      driver.findElement(By.id("email")).sendKeys("shilpa.jain812@gmail.com"); 
      driver.findElement(By.id("pass")).sendKeys("Facebook@123");
      
      driver.findElement(By.id("loginbutton")).click();
      System.out.println("Successfully logged in");
 
  }
}
