package Flipkartvalidation;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.base.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginvalidation extends Baseclass{

	  public static void main(String[] args) {
	 
		browserlaunch("Chrome");

	    driver.get("https://www.flipkart.com");
	    maximize();
	    implicitwait(20);
	    
	    WebElement phoneNumberField = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	    phoneNumberField.sendKeys("7010290788");
	    
	    WebElement requestbtn = driver.findElement(By.xpath("(//button[@class])[3]"));
	    requestbtn.click();
	    
	    String phoneNumberRegex = "^[0-9]{10}$"; // Regular expression to match a 10-digit phone number
	    Pattern phoneNumberPattern = Pattern.compile(phoneNumberRegex);
	    Matcher phoneNumberMatcher = phoneNumberPattern.matcher(phoneNumberField.getText());

	    if (phoneNumberMatcher.matches()) {
	      System.out.println("Phone number is valid");
	    } else {
	      System.out.println("Phone number is invalid");
	    }
	    driver.quit();
	  }
	}

