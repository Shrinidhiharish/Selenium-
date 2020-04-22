package leaning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Xpath_Pratice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Eclipse_Projects\\selenium.automation.learning\\Drivers\\Chrome\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.xpath("//div[@id='nav-signin-tooltip']/child::a")).click();
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("9916546369");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Amazon@123");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		
		
		driver.findElement(By.xpath("//a[@class='nav-a nav-a-2 a-popover-trigger a-declarative']")).click();
		//driver.findElement(By.xpath("//a[contains(text(), 'Manage address book')]/following::input[2]/following::span[3]")).click();
		
		
		
		
		
		//driver.quit();
	}

}
