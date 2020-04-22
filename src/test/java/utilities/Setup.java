package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setup {
	static WebDriver driver;
	public static WebDriver driverpaths()
	{
		System.setProperty("webdriver.chrome.driver",
				"E:\\Eclipse_Projects\\selenium.automation.learning\\Drivers\\Chrome\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		return driver;
		
	}
	
}
