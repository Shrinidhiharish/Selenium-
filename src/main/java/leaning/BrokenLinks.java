package leaning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
	
	
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver",
			"E:\\Eclipse_Projects\\Git Pull\\Selenium-\\Drivers\\Chrome\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.amazon.com/");
	driver.findElement(By.xpath("//div[@id='nav-signin-tooltip']/child::a")).click();
	driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("9916546369");
	driver.findElement(By.xpath("//input[@id='continue']")).click();
	
	driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Amazon@123");
	driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
	driver.manage().window().maximize();
	List<WebElement>linkslist = (List<WebElement>) driver.findElement(By.tagName("a"));
	linkslist.addAll(driver.findElements(By.tagName("img")));

}
}
