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
	  
	  
	//  System.out.println("setting /usr/local/share/chromedriver");
 	  //System.setProperty("webdriver.chrome.driver","/usr/local/share/chromedriver");
 
 
	  //System.setProperty("webdriver.chrome.driver","D:\\ChromeWebDriver\\chromedriver.exe"); 
	  //Set a system property webdriver.chrome.driverto the path of your ChromeDriver.exe file

     // WebDriver driver = new ChromeDriver(); 
	  WebDriver driver = new FirefoxDriver();
      driver.manage().window().maximize();
      //WebDriverWait waiting = new WebDriverWait(driver, 10, 100);
      
      //Facebook application code
      driver.get("https://facebook.com/");  //navigate to a page.
      
	  Thread.sleep(5000);
	  driver.findElement(By.id("email")).sendKeys("shilpa.jain812@gmail.com"); 
      driver.findElement(By.id("pass")).sendKeys("Facebook@123");
        
      driver.findElement(By.id("loginbutton")).click();
        System.out.println("Successfully logged in");
	        Thread.sleep(2000);

      driver.findElement(By.xpath("//span[contains(text(), 'Make Post')]")).click();
	  
	  File screenshot0 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(screenshot0, new File("/home/jenkins/sharedspace/src/Results/Reports/screenshot" + System.currentTimeMillis() + ".png"));
      System.out.println("Screenshot0 captured");
	  Thread.sleep(30000);

     /// driver.findElement(By.xpath("//span[contains(text(), 'Post')]")).click();
      //Thread.sleep(2000);

	  File screenshot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(screenshot1, new File("/home/jenkins/sharedspace/src/Results/Reports/screenshot" + System.currentTimeMillis() + ".png"));
      System.out.println("Screenshot1 captured");
	  
      Thread.sleep(5000);
	  
	  //Directv Entertainment site code
	  /*String strControl1 = "//*[@id='nav_item_2]/span/a";	  
      String strControl2 = "//div[contains(@class, 'page-module-content')]//div[contains(@class, 'Carousel')][1]//li[1]//a[contains(@class, 'flip-title')]";
	  
      driver.get("https://www.directv.com/entertainment");
      driver.findElement(By.xpath(strControl1)).click();
	  File screenshot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(screenshot1, new File("/home/jenkins/sharedspace/src/Results/Reports/" + System.currentTimeMillis() + ".png"));
      System.out.println("Screenshot1 captured");


      Thread.sleep(5000);
      System.out.println("Before capture & driver is " + driver);
      File screenshot2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      System.out.println("After Movie click, time is " +  System.currentTimeMillis());
      FileUtils.copyFile(screenshot2, new File("/home/jenkins/sharedspace/src/Results/Reports/" + System.currentTimeMillis() + ".png"));
      System.out.println("Screenshot2 captured");

      driver.findElement(By.xpath(strControl2)).click();
      Thread.sleep(5000);
      
      File screenshot3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      System.out.println("After movie elemet click, time is " +  System.currentTimeMillis());
      FileUtils.copyFile(screenshot3, new File("/home/jenkins/sharedspace/src/Results/Reports/" + System.currentTimeMillis() + ".png"));
      System.out.println("Screenshot3 captured");*/
	  
      System.out.println("Successfully logged in");
 
  }
}