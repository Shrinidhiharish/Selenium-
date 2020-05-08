package leaning;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Staticdropdown {
	
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"E:\\Eclipse_Projects\\selenium.automation.learning\\Drivers\\Chrome\\chromedriver_win32 (4)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://book.spicejet.com/");
	//WebElement dropbox=driver.findElement(By.xpath("//select[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency']"));
	//Select s = new Select(dropbox);
	//s.getOptions();
	//s.selectByValue("AED");
	driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
	driver.findElement(By.xpath("//a[@value='IXU']")).click();
	driver.findElement(By.xpath("//a[@value='CJB']")).click();
	
}
}
