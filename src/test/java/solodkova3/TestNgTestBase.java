package solodkova3;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeDriver;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import solodkova3.util.PropertyLoader;



/**
 * Base class for TestNG-based test classes
 */
public class TestNgTestBase {

  protected static String gridHubUrl;
  protected static String baseUrl;
  protected static Capabilities capabilities;
  
  
   //protected WebDriver driver;

  @BeforeSuite
  public void initTestSuite() throws IOException {
	  baseUrl = "http://localhost/";
	  //baseUrl = PropertyLoader.loadProperty("site.url");
	  //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  
  
  
  
  /* @AfterSuite(alwaysRun = true)
	  public void tearDown() {
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  }*/

	  //driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
    //baseUrl = PropertyLoader.loadProperty("http://localhost/");
   /* gridHubUrl = PropertyLoader.loadProperty("");
    if ("".equals(gridHubUrl)) {
      gridHubUrl = null;
    }
    capabilities = PropertyLoader.loadCapabilities();
    WebDriverFactory.setMode(WebDriverFactoryMode.THREADLOCAL_SINGLETON);*/
  }

 /* @BeforeMethod
  public void initWebDriver() {
    driver = WebDriverFactory.getDriver(gridHubUrl, capabilities);
  }

  @AfterSuite(alwaysRun = true)
  public void tearDown() {
    WebDriverFactory.dismissAll();
  }*/

