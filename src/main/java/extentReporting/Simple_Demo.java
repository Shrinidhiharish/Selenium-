package extentReporting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Simple_Demo {
	ExtentReports extent;

	@BeforeTest
	public void report() {
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("Testing Demo");
		reporter.config().setReportName("My first report");

		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Programer Ananlyst", "Nidhi");

	}

	@Test
	public void demo() {
		extent.createTest("demo");
		System.setProperty("webdriver.chrome.driver",
				"E:\\Eclipse_Projects\\selenium.automation.learning\\Drivers\\Chrome\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("ShrinidhiHarish");
		driver.close();
		extent.flush();
	}
}