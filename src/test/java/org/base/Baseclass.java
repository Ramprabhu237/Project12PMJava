package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
			public static WebDriver driver;
			
			public static WebDriver browserlaunch(String browsername)
			{
				if(browsername.equalsIgnoreCase("chrome"))
				{
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				}
				else if(browsername.equalsIgnoreCase("firefox")){
					WebDriverManager.firefoxdriver().setup();
					driver = new FirefoxDriver();
				}
				return driver;
			}
			
			public static void urllaunch(String url)
			{
				driver.get(url);
			}
			
			public static void maximize()
			{
				driver.manage().window().maximize();
			}
			public static void implicitwait(int secs)
			{
				driver.manage().timeouts().implicitlyWait(secs, TimeUnit.SECONDS);
			}
			public static void sendkeys(WebElement e, String user)
			{
				e.sendKeys(user);
			}
			public static void click (WebElement e)
			{
				e.click();
			}
			public static String currenturl()
			{
			String url = driver.getCurrentUrl();
			return url;
			}
			public static String currenttitle()
			{
				String title = driver.getTitle();
				return title;
			}
			
			public static void takescreenshot(WebElement e) throws IOException
			{
				TakesScreenshot tk = (TakesScreenshot) driver;
				File dec = e.getScreenshotAs(OutputType.FILE);
				File dec1 = new File("C:\\Users\\USER\\eclipse-workspace\\SeleniumDec\\Browser\\Scresnshots\\img.png");
				Files.copy(dec, dec1);
			}
			
			public static void enterkey() throws AWTException
			{
				Robot r = new Robot();
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
			
			}
			public static void downkey() throws AWTException
			{
				Robot r = new Robot();
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
			}
			public static void quit()
			{
				driver.quit();
			}
	     public static void close()
	     {
		     driver.close();
	     }
			
			
}



