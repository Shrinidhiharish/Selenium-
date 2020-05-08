package pages;

import java.awt.Window;
import java.io.File;
import java.io.IOException;

import javax.swing.plaf.FileChooserUI;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Repository.Inputforms_Repository;

public class InputForms {
	static WebDriver driver;

	public static WebDriver simpleformdemo() throws InterruptedException, IOException {

		Inputforms_Repository obj = new Inputforms_Repository(driver);
		driver = NavigationBar.selectOperation();
		driver.findElement(obj.select()).click();
		WebElement text=driver.findElement(obj.text());
		System.out.println(text.getText());
		 return simpleforms();
		
		
	}
		public static WebDriver simpleforms() throws IOException
		{
			driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys("Hello is learning automation fun?");
			driver.findElement(By.xpath("//button[@onclick='showInput();']")).click();
			JavascriptExecutor obj = (JavascriptExecutor)driver;
			obj.executeScript("scroll(0,450)");
			
			driver.findElement(By.xpath("//input[@id='sum1']")).sendKeys("1");
			driver.findElement(By.xpath("//input[@id='sum2']")).sendKeys("2");
			driver.findElement(By.xpath("//button[@onclick='return total()']")).click();
			
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src,new File("E:\\Eclipse_Projects\\selenium.automation.learning\\Screenshot\\screen2.png")); 	
			return driver;
		}
		
}
