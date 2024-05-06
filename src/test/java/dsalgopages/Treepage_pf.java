package dsalgopages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Treepage_pf {

	 WebDriver driver;
	public Treepage_pf(WebDriver driver)
	{ 
		PageFactory.initElements(driver, this);
		this.driver = driver; 
		}
}
