package selenium4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetRectMethod {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://app.hubspot.com/login");
		WebElement Click = driver.findElement(By.id("loginBtn"));
		// selenium 3
		Dimension ClickDim = Click.getSize();
		System.out.println(ClickDim.getHeight());
		System.out.println(ClickDim.getWidth());
		System.out.println(ClickDim.getClass());
		Point p = Click.getLocation();
		System.out.println(p.getX());
		System.out.println(p.getY());

		// Selenium4
		Rectangle dimension = Click.getRect();
		System.out.println(dimension.getHeight());
		System.out.println(dimension.getWidth());
		System.out.println(dimension.getX());
		System.out.println(dimension.getY());
	}
	//In Dom check like document.getElementById (webElement).getBoundingClientReact(); for more details.

}
