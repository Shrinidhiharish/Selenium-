package selenium4;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GroupOfWebElementScreenShots {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.get("https://www.w3schools.com/html/html_tables.asp");
		//WebElement table = driver.findElement(By.id("customers"));
		driver.get("https://register.freecrm.com/register/");
	WebElement Form = driver.findElement(By.cssSelector(".ui.form"));
		//CaptureScreenShot(table, "tablegroup");
		CaptureScreenShot(Form, "form");
	}

	public static void CaptureScreenShot(WebElement element, String Filename) {

		File screenshot = element.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshot, new File("./target/screenshot/" + Filename + ".png"));
		} catch (IOException e) {

			e.printStackTrace();
		}

	}
}
