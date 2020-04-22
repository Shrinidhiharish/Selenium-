package leaning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Half_com_Example_Locators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Eclipse_Projects\\selenium.automation.learning\\Drivers\\Chrome\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://half.com");
		driver.findElement(By.linkText("register")).click();

		String Url = driver.getCurrentUrl();
		Thread.sleep(10000);
		String Urlneeded = "https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fwww.ebay.com%2F";
		if (Url.equals(Urlneeded)) {
			driver.findElement(By.xpath("//div[@class='geetest_radar_tip']")).click();
		}

		else {
			System.out.println("No captcha");
		}
	}

}
