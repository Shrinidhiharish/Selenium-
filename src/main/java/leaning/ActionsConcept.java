package leaning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Eclipse_Projects\\selenium.automation.learning\\Drivers\\Chrome\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		Actions act=new Actions(driver);
		act.clickAndHold(driver.findElement(By.xpath("//div[@id='draggable']"))).
		moveToElement(driver.findElement(By.xpath("//div[@id='droppable']"))).release().build().perform();
		
	}
}
