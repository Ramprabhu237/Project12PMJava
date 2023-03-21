package Flipkartvalidation;
import java.awt.*;
import org.base.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class Getttext extends Baseclass{
public static void main(String args[]) throws AWTException, InterruptedException {
		
		browserlaunch("Chrome");
		urllaunch("https://www.flipkart.com/");
		maximize();
		implicitwait(10);
		WebElement loginpopup = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		loginpopup.click();
		WebElement searchbox = driver.findElement(By.xpath("//input[@class='_3704LK']"));
		searchbox.sendKeys("Apple iphone 13");
		enterkey();
		int i = 1;
		while(i<=4) 
		{
		System.out.println("Page number" +i);
		java.util.List<WebElement> findElements = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		for (WebElement prdt:findElements) {
		System.out.println(prdt.getText());
		}
		WebElement nextbtn = driver.findElement(By.xpath("//span[text()='Next']"));
		nextbtn.click();
		Thread.sleep(3000);
		i++;
		}
}
}
