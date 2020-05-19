package selenium4;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GeoLocation {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Map<String, Object> CoordinatesMap = new HashMap<String, Object>();
		CoordinatesMap.put("latitude", 34.05223);
		CoordinatesMap.put("longitude", -118.24368);
		CoordinatesMap.put("accuracy", 100);
		((ChromeDriver)driver).executeCdpCommand("Emulation.setGeolocationOverride",CoordinatesMap );
		driver.get("https://oldnavy.gap.com/stores");
	}
}
