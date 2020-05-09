package extentReporting;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Sauce_Labs {

		public static final String USERNAME = "Shrinidhi";

		  public static final String ACCESS_KEY = "xxxxx";

		  public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
		  static WebDriver driver;


		public static void main(String[] args) throws MalformedURLException {

		// TODO Auto-generated method stub



		DesiredCapabilities caps = DesiredCapabilities.chrome();

		caps.setCapability("platform", "Windows 7");

		caps.setCapability("version", "51.0");

		//WebDriver driver=new RemoteWebDriver(new URL(URL), caps);

		driver.get("http://google.com");

		System.out.println(driver.getTitle());

		}



		}


