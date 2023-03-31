package Sample;

import java.io.File;
import java.io.IOException;

import org.base.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.google.common.io.Files;

public class sample extends Baseclass {
	
		public static void main(String args[]) throws IOException
		
		{
			browserlaunch("Chrome");
			urllaunch("https://www.facebook.com/");
			maximize();
			TakesScreenshot tk = (TakesScreenshot) driver;
			File scr = tk.getScreenshotAs(OutputType.FILE);
			File abc = new File("C:\\Users\\USER\\eclipse-workspace\\SeleniumDec\\Browser\\Scresnshots\\img1.png");
			Files.copy(scr, abc);
			System.out.println("Screenshot taken");
			WebElement e = driver.findElement(By.name("login"));
			takescreenshot(e);
			System.out.println("Done");
			System.out.println("Done done");
	}
}
