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

public class InputForms {
	static WebDriver driver;

	public static WebDriver simpleformdemo() throws InterruptedException, IOException {

		driver = NavigationBar.selectOperation();
		driver.findElement(By.xpath("//ul[@class='dropdown-menu']/li/a")).click();
		WebElement linkcount = driver.findElement(By.tagName("a"));
		System.out.println("The total number of link present in present web page" + linkcount);
		WebElement text=driver.findElement(By.xpath("//div[@class='panel-heading']"));
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
			FileUtils.copyFile(src,new File("E:\\Eclipse_Projects\\selenium.automation.learning\\Screenshot\\screen1.png")); 	
			return driver;
		}
		
}
