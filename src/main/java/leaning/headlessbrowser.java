package leaning;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class headlessbrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Eclipse_Projects\\selenium.automation.learning\\Drivers\\Chrome\\chromedriver_win32 (4)\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		WebDriver driver = new HtmlUnitDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get("https://book.spicejet.com/");
		driver.getTitle();
		boolean radio=driver.findElement(By.xpath("//input[@value='RoundTrip']")).isSelected();
		System.out.println(radio);
		
		//driver.findElement(By.xpath("//input[@value='RoundTrip']")).click();
		
		//boolean radio1=driver.findElement(By.xpath("//input[@value='RoundTrip']")).isSelected();
		//System.out.println(radio1);
	}

}
