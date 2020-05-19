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

public class ScreenShotOfWebElement {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://app.hubspot.com/login");
		WebElement email = driver.findElement(By.id("username"));
		WebElement password =	driver.findElement(By.id("password"));
		WebElement Click =driver.findElement(By.id("loginBtn"));
		CaptureScreenShot(email, "emailId");
		CaptureScreenShot(password, "Password");
		CaptureScreenShot(Click, "Button");
		driver.quit();
		
	}
	
	public static void CaptureScreenShot(WebElement element, String Filename)
	{
		File screenshot = element.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshot, new File("./target/screenshot/"+Filename +".png"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}

}
