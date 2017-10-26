package solodkova3;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.*;
import org.testng.annotations.*;


public class AppTest extends solodkova3.TestNgTestBase {
	
			
		@Test
		public static void testSingIn() throws InterruptedException {
			
			
			// ????????????? скрыть информационную строку 
			/*ChromeOptions options = new ChromeOptions();
			options.addArguments("disable-infobars");					
			options.addArguments("--start-maximized");*/
			//WebDriver driver = BrowserDriverStart;
			//WebDriver driver = new ChromeDriver();
			
			System.out.println (capabilities);
			
			driver.get(baseUrl+"/php4dvd/");
			
			//скотлько ждать до выдачи ошибки - нужно перенести в Файл тест NG
			
			
			WebElement usernameField = driver.findElement(By.id("username"));
			usernameField.clear();
			usernameField.sendKeys("admin");
			WebElement passField = driver.findElement(By.name("password"));
			passField.clear();
			passField.sendKeys("admin");
			driver.findElement(By.name("submit")).click();
			//driver.quit();
			//System.out.println (browserName);
			
	 	}
}