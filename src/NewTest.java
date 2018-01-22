import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	
	public WebDriver driver;
	
	@Test
  public void main() throws InterruptedException, IOException
  {
	  System.setProperty("webdriver.chrome.driver","D:\\ChromeWebDriver\\chromedriver.exe"); 
	  //Set a system property webdriver.chrome.driverto the path of your ChromeDriver.exe file
	  //instantiate a driver object in Selenium
      WebDriver driver = new ChromeDriver(); 
      driver.manage().window().maximize();
      //WebDriverWait waiting = new WebDriverWait(driver, 10, 100);
      
      String strControl1 = "//div[contains(@class, 'tup')]//a[contains(text(), 'Movies')]";
      String strControl2 = "//div[contains(@class, 'page-module-content')]//div[contains(@class, 'Carousel')][1]//li[1]//a[contains(@class, 'flip-title')]";
      
      //driver.get("https://facebook.com/");  //navigate to a page.
      driver.get("https://www.directv.com/entertainment");
      Thread.sleep(5000);
      driver.findElement(By.xpath(strControl1)).click();
      Thread.sleep(5000);
      System.out.println("Before capture & driver is " + driver);
      File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      System.out.println("After Movie click, time is " +  System.currentTimeMillis());
      FileUtils.copyFile(screenshot, new File("D:\\ChromeWebDriver\\screenshot" + System.currentTimeMillis() + ".png"));
      System.out.println("Screenshot1 captured");

      driver.findElement(By.xpath(strControl2)).click();
      Thread.sleep(5000);
      
      File screenshot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      System.out.println("After movie elemet click, time is " +  System.currentTimeMillis());
      FileUtils.copyFile(screenshot1, new File("D:\\ChromeWebDriver\\screenshot" + System.currentTimeMillis() + ".png"));
      System.out.println("Screenshot2 captured");
      
      //driver.findElement(By.id("email")).sendKeys("shilpa.jain812@gmail.com"); 
      //driver.findElement(By.id("pass")).sendKeys("Facebook@123");
      
      //driver.findElement(By.id("loginbutton")).click();
      System.out.println("Successfully logged in");
 
  }
}