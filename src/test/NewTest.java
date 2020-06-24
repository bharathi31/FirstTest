package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest {
	
	public WebDriver driver;
	
  @Test
  public void openMyBlog() {
	driver.get("https://iniapro.objectfrontier.com/login");
  }
  
  @BeforeClass
  public void beforeClass() {
	  
	/*  System.setProperty("webdriver.gecko.driver", "F:\\SeleniumJAR\\geckodriver-v0.26.0-win64\\geckodriver.exe");
	  driver = new FirefoxDriver(); */
	  
	  System.setProperty("webdriver.chrome.driver", "F:\\SeleniumJAR\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
