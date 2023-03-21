package Automations;

import java.awt.AWTException;

import org.base.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Gmailautomation extends Baseclass{
	

	@BeforeClass
	public void browserlaunch() {
		browserlaunch("Chrome");
		ChromeOptions op= new ChromeOptions();
		op.addArguments("--incognito");
		urllaunch("https://www.gmail.com/mail/help/intl/en/promos/blue/");
		maximize();
		implicitwait(10);
	}
	@Test
	public void gmailautomation() throws InterruptedException, AWTException {
		WebElement signin = driver.findElement(By.id("gmail-sign-in"));
		signin.click();
		WebElement emailorphone = driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']"));
		emailorphone.sendKeys("ramprabhu237@gmail.com");
		Thread.sleep(5000);
		enterkey();
		Thread.sleep(2000);
		WebElement pass = driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']"));
		pass.sendKeys("Uranium_235");
		Thread.sleep(2000);
		WebElement appsbtn = driver.findElement(By.xpath("//svg[@class='gb_1e']"));
		appsbtn.click();
	
	
	}
	@AfterClass
	public void closebrowser()
	{
		driver.quit();
	}
}
