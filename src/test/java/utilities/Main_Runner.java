package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.InputForms;
import pages.NavigationBar;


public class Main_Runner {
	static WebDriver driver;
	public static void main(String[] args) {
		//driver=Setup.driverpaths();
		//NavigationBar.selectOperation();
		driver=InputForms.simpleformdemo();
		driver.quit();

	}

}
