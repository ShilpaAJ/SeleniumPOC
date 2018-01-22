import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import org.apache.commons.io.FileUtils;
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
  public void main() throws InterruptedException, IOException
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
      
      Thread.sleep(2000);
      System.out.println("Before capture & driver is " + driver);
      File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      System.out.println("line 553, time is " + System.currentTimeMillis());
      //FileUtils.copyFile(screenshot, new File("/home/jenkins/sharedspace/TO_BE_Deleted_sk8457/selenium_chrome/src/Results/Reports/screenshot" + System.currentTimeMillis() + ".png"));
      FileUtils.copyFile(screenshot, new File("/home/jenkins/sharedspace/screenshot" + System.currentTimeMillis() + ".png"));
      System.out.println("Screenshot captured");
      driver.findElement(By.xpath("//span[contains(text(), 'Make Post')]")).click();
      Thread.sleep(2000);
      File screenshot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

      FileUtils.copyFile(screenshot1, new File("/home/jenkins/sharedspace/screenshot" + System.currentTimeMillis() + ".png"));

      driver.findElement(By.xpath("//span[contains(text(), 'Post')]")).click();
      File screenshot2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

      FileUtils.copyFile(screenshot2, new File("/home/jenkins/sharedspace/screenshot" + System.currentTimeMillis() + ".png"));

      
  }
}
