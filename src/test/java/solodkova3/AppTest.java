package solodkova3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.*;
import org.testng.annotations.*;



public class AppTest extends solodkova3.TestNgTestBase {
	
			
		@Test
		public void testSingIn() throws InterruptedException {
			
			// ????????????? скрыть информационную строку 
			ChromeOptions options = new ChromeOptions();
			options.addArguments("disable-infobars");					
			options.addArguments("--start-maximized");
			// открыть в хроме
			WebDriver driverChrome = new ChromeDriver();
			driverChrome.get(baseUrl+"/php4dvd/");
			WebElement usernameField = driverChrome.findElement(By.id("username"));
			usernameField.clear();
			usernameField.sendKeys("admin");
			WebElement passField = driverChrome.findElement(By.name("password"));
			passField.clear();
			passField.sendKeys("admin");
			driverChrome.findElement(By.name("submit")).click();
						
	 
			/*FirefoxDriver driverFF = new FirefoxDriver ();
			driverFF.get("http://www.google.com");*/
		}
}