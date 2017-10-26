package solodkova3;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class isPresent extends solodkova3.AppTest {
	
	boolean isElementPresent (By locator, WebDriver driver) {
		
		try {
			driver.findElement(locator);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
		
	boolean isElementPresent2 (By locator, WebDriver driver) {
			
			return driver.findElements(locator).size()>0;
		}
		
	

}
