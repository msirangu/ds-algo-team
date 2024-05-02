package dsalgopages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Loginpages_Pf 
{
	WebDriver driver;
	By username =By.xpath("//input[@name='username']");
	By password = By.xpath("//input[@name='password']");
	By login = By.xpath("//input[@type='submit']");
	By invalidmessage = By.xpath("//div[@role='alert']");
	By successmessage = By.xpath("//div[@role='alert']");
	
	public Loginpages_Pf(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void enterUsernamePassword(String username1, String password1) {
		
		driver.findElement(username).sendKeys(username1);
		driver.findElement(password).sendKeys(password1);
		
	}
	public void clickLogin() {
		driver.findElement(login).click();
	}
	
	public String errMsgFillFields()
	{
		WebElement activeElement =driver.switchTo().activeElement();
		String message = activeElement.getAttribute("validationMessage");
		return message;
	}
	
	public String invalidMessage() {
		 return driver.findElement(invalidmessage).getText();	
		}
	
	public String successMessage() {
		return driver.findElement(successmessage).getText();
	}
}








