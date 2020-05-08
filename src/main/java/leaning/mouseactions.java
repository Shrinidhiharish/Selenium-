package leaning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseactions {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver",
					"E:\\Eclipse_Projects\\selenium.automation.learning\\Drivers\\Chrome\\chromedriver_win32 (4)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			//WebDriver driver = new HtmlUnitDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.get("https://book.spicejet.com/");
			driver.findElement(By.xpath("//a[@id='highlight-addons']"));
			Actions act=new Actions(driver);
			//act.moveToElement();
			
	}

}
