package leaning;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoIt_Pratice {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver",
				"E:\\Eclipse_Projects\\selenium.automation.learning\\Drivers\\Chrome\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		driver.findElement(By.id("pickfiles")).click();
		Runtime.getRuntime().exec("C:\\Users\\Admin\\Desktop\\AutoIT\\AutoIt_Fileupload_Script.exe");
		WebDriverWait  wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("processTask")));
		
		driver.findElement(By.id("processTask")).click();
		File f = new File("C:\\Users\\Admin\\Downloads\\TestNG.docx");
	if(	f.exists())
	{
		System.out.println("file is found");
	}
		
		
	else
		System.out.println("not found");
		
	driver.close();
	}

}
