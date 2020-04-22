package leaning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session1 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver",
"E:\\Eclipse_Projects\\selenium.automation.learning\\Drivers\\Chrome\\chromedriver_win32 (4)\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		System.out.println("******class()");
		//System.out.println(driver.getClass());
		System.out.println("currenturl()");
		System.out.println(driver.getCurrentUrl());
		System.out.println("Page source");
		//System.out.println(driver.getPageSource());
		System.out.println("get title");
		String Title = driver.getTitle();
		System.out.println(Title);
		if(Title.equals("Google"))
		{
			System.out.println("Correct title");	
		}
		else
		{
			System.out.println("InCorrect title");	
		}
		
		System.out.println("windowhandle");
		System.out.println(driver.getWindowHandle());
		System.out.println("window handles");
		System.out.println(driver.getWindowHandles());
		System.out.println("The end");
		driver.quit();

	}

}
