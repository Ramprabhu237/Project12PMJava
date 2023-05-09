package Sample;

import java.io.IOException;
import org.base.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class bestbuyautomation extends Baseclass{
	

public static void main(String args[]) throws IOException {
	
	browserlaunch("edge");
	urllaunch("https://www.bestbuy.ca/en-ca\r\n");
	maximize();
	implicitwait(50);
	WebElement account = driver.findElement(By.xpath("//a[@class='SignInOutNavIcon_P7Grx signIn_3nvJ4 SignInOutNavIcon_oX_oB signIn_QP8nt']"));
	WebElement destination = driver.findElement(By.xpath("//p[text()='Save up to $150 on select laptops.']"));
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true)", destination);  // scroll down
	js.executeScript("arguments[0].scrollIntoView(false)", account);   // scroll up
	
	WebElement services = driver.findElement(By.xpath("//li[@data-automation='services']"));
	services.click();
//	TakesScreenshot tk= (TakesScreenshot)driver;
//	String fileName =  new SimpleDateFormat(" yyyy-MM-dd hh-mm-ss'.png'").format(new Date());
//	FileUtils fl = new FileUtils();
//	File src = tk.getScreenshotAs(OutputType.FILE);	  // taking screenshot
//	File des=new File("C:\\Users\\USER\\eclipse-workspace\\Maven-Project\\test-output"+fileName);
//	fl.copyFile(src, des);
	takescreenshot(driver);
	System.out.println("Screenshot taken");
//	List<WebElement> serviceslist = driver.findElements(By.xpath("//li[@class='rootMenuItem_Qh9am isVisible']"));
//	for(WebElement display : serviceslist) {
//		System.out.println(display.getText());
	quit();
}
}

