package Googlesuggesstions;
import java.util.List;
import org.base.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class suggestions extends Baseclass{	
	@BeforeClass
	public void browserlaunch() {
		browserlaunch("Chrome");
		urllaunch("https://www.google.com/");
		maximize();
		implicitwait(10);
	}
	@Test
	public void suggestionsdisplay(){
		WebElement searchbox = driver.findElement(By.xpath("//input[@name='q']"));
		searchbox.sendKeys("Mahendra Singh Dhoni");
		driver.switchTo().frame("callout");
		WebElement nothanksbtn = driver.findElement(By.xpath("//button[@class='M6CB1c rr4y5c']"));
		nothanksbtn.click();
		driver.switchTo().defaultContent();
		List<WebElement> findElements = driver.findElements(By.xpath("//li[@class='sbct']"));
		for(WebElement display : findElements) {
			System.out.println(display.getText());
		}
	}
	@AfterClass
	public void closebrowser()
	{
		driver.quit();
	}
}
