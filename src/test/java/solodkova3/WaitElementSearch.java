package solodkova3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;

public class WaitElementSearch {
	
	public void WaitTimeAfterException(int timeForWait, By locator, WebDriver driver) throws InterruptedException
	{
		for (int count =0;; count++) {
			if (count >= timeForWait)  
				throw new TimeoutException();
			try { driver.findElement(locator);
			break;
			} catch (NoSuchElementException e) {}
			Thread.sleep(1000);
			
			}
		}
	}
	

