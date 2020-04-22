package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

import utilities.Setup;

public class NavigationBar {
	
static WebDriver driver;
	

public static WebDriver selectOperation()

{
	driver=Setup.driverpaths();
	driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
	
	
	return driver;
	
	


}

}