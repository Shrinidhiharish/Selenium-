package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InputForms {
	static WebDriver driver;
	
	public static WebDriver simpleformdemo()
	{
		
		driver=NavigationBar.selectOperation();
		driver.findElement(By.xpath("//ul[@class='dropdown-menu']/li/a")).click();
		WebElement linkcount = driver.findElement(By.tagName("a"));
		System.out.println("The total number of link present in present web page" +linkcount);
		return driver;
	}
	
	
}
