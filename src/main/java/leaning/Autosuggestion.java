package leaning;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Autosuggestion {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Eclipse_Projects\\selenium.automation.learning\\Drivers\\Chrome\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Actions act = new Actions(driver); 
		act.moveToElement(driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
				
//		.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("mum");
//		WebElement select = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
//		select.sendKeys(Keys.ARROW_DOWN);
//		select.sendKeys(Keys.ENTER);
	}

}
