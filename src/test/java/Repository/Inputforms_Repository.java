package Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Inputforms_Repository {
	WebDriver driver;
public Inputforms_Repository(WebDriver driver)

{
this.driver=driver;
}

	public By select=By.xpath("//ul[@class='dropdown-menu']/li/a");
	public By text =By.xpath("//div[@class='panel-heading']");
	
	public By select()
	{
		return select;
	}
	
	public By text()
	{
		return text;
	}
	
	
}
