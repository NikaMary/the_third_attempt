package solodkova3;

import java.io.IOException;

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

import solodkova3.util.PropertyLoader;



public class AppTest extends solodkova3.TestNgTestBase {
	
			
		@Test
		public static void testSingIn() throws InterruptedException, IOException {
			
			
			// ????????????? скрыть информационную строку 
			ChromeOptions options = new ChromeOptions();
			options.addArguments("disable-infobars");					
			options.addArguments("--start-maximized");
			// открыть в хроме
			WebDriver driver = new ChromeDriver();
			driver.get(baseUrl+"/php4dvd/");
			WebElement usernameField = driver.findElement(By.id("username"));
			usernameField.clear();
			usernameField.sendKeys("admin");
			WebElement passField = driver.findElement(By.name("password"));
			passField.clear();
			passField.sendKeys("admin");
			driver.findElement(By.name("submit")).click();
			
			
			System.out.println (PropertyLoader.loadProperty("capabilities"));			
	 
			/*FirefoxDriver driverFF = new FirefoxDriver ();
			driverFF.get("http://www.google.com");*/
		}
}