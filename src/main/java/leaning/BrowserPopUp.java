package leaning;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserPopUp {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver",
					"E:\\Eclipse_Projects\\selenium.automation.learning\\Drivers\\Chrome\\chromedriver_win32 (4)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://www.popuptest.com/goodpopups.html");
			driver.findElement(By.xpath("//a[@onfocus='this.blur()']")).click();
			Thread.sleep(2000);
            Set<String> handles=driver.getWindowHandles();
            Iterator<String> Index=handles.iterator();
            String parent=Index.next();
            System.out.println("Parent window" +parent);
            String child=Index.next();
            System.out.println("Child window" +child);
			driver.switchTo().window(child);
			System.out.println("Child window" +driver.getTitle());
			Thread.sleep(2000);
			driver.close();
			driver.switchTo().window(parent);
			System.out.println("Child window" +driver.getTitle());
	}

}
