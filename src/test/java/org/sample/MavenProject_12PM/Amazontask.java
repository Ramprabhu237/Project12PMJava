package org.sample.MavenProject_12PM;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Amazontask {
	
			public static void main(String args[]) throws AWTException
			{
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.amazon.in");
				driver.manage().window().maximize();
				WebElement e = driver.findElement(By.name("field-keywords"));
				e.sendKeys("iphone 13");
				Robot a = new Robot();
				a.keyPress(KeyEvent.VK_ENTER);
				
				
			
		}


}
