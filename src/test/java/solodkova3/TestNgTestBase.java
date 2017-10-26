package solodkova3;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import ru.stqa.selenium.factory.WebDriverPool;
//import ru.stqa.selenium.factory.WebDriverFactory;
//import ru.stqa.selenium.factory.WebDriverFactoryMode;
import solodkova3.util.PropertyLoader;



/**
 * Base class for TestNG-based test classes
 */
public class TestNgTestBase {

  protected static String gridHubUrl;
  protected static String baseUrl;
  protected static Capabilities capabilities;
  
  protected static WebDriver driver;
  //protected static String browserName;
  
   //protected WebDriver driver;

  @BeforeSuite
  public void initTestSuite() throws IOException {
	   baseUrl = PropertyLoader.loadProperty("site.url");
	   //browserName = PropertyLoader.loadProperty("browser.name");
	   capabilities = PropertyLoader.loadCapabilities();
	  
	  /* gridHubUrl = PropertyLoader.loadProperty("");
	    if ("".equals(gridHubUrl)) {
	      gridHubUrl = null;
	    }*/
	   //capabilities = PropertyLoader.loadCapabilities(); 
	    
 }
 
  @BeforeMethod
  public void initWebDriver() throws IOException {
	  /*if (browserName.equals("chrome")) capabilities = DesiredCapabilities.chrome();
	  else capabilities = DesiredCapabilities.firefox();*/
	  capabilities = PropertyLoader.loadCapabilities();
	  driver = WebDriverPool.DEFAULT.getDriver(capabilities);
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }
  
  
  @AfterSuite
  public void tearDown() {
    WebDriverPool.DEFAULT.dismissAll();
  }
}
  
