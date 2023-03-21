package Googlesuggesstions;
import java.awt.AWTException;
import java.util.List;
import org.base.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class flipkartsuggesstions extends Baseclass {

	@BeforeClass
	public void browserlaunch() {
		browserlaunch("Chrome");
		urllaunch("https://www.flipkart.com/");
		maximize();
		implicitwait(10);
	}
	@Test
	public void suggestionsdisplay() throws AWTException{
		WebElement loginpopup = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		loginpopup.click();
		WebElement searchbox = driver.findElement(By.xpath("//input[@class='_3704LK']"));
		searchbox.sendKeys("Shoes for Men");
		downkey();
		List<WebElement> findElements = driver.findElements(By.xpath("//li[@class='Y5N33s']"));
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
