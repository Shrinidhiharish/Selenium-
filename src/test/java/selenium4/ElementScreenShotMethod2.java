package selenium4;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementScreenShotMethod2 {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://app.hubspot.com/login");
		WebElement email = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		
		CaptureScreenShot(email, "Email");
		
	}

	public static void CaptureScreenShot(WebElement element, String Filename)
	{
		//TakesScreenshot fullpage = ((TakesScreenshot) driver);
		TakesScreenshot fullpage = ((TakesScreenshot) element);
		File srcFile = fullpage.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File("./target/scrennshots/" +Filename + "page.png"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	}

