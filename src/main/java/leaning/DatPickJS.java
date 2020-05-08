package leaning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatPickJS {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Eclipse_Projects\\selenium.automation.learning\\Drivers\\Chrome\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get("https://book.spicejet.com/");
		
		WebElement date=driver.findElement(By.xpath("//input[@name='custom_date_picker']"));
		String dateval="30-12";
		selectdate(driver, date, dateval);
		
	
}
	public static void selectdate(WebDriver driver, WebElement element,String dateval)
	{
	JavascriptExecutor js= ((JavascriptExecutor)driver);
	js.executeScript("arguments[0].setAttribute('value','"+dateval+"');",element );
	
	
}
}
