package dsalgopages;


import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
 public class HomePages_Pf 
 {
	 private WebDriver driver;
	    By message= By.xpath("//p[contains(text(),'You are at the right place')]");
		By getBtn = By.xpath("//button[@class='btn']");
		By signin = By.linkText("Sign in");
		By dropdown = By.xpath("//a[@class='nav-link dropdown-toggle']");
		By dropdownsize = By.xpath("//div[@class='dropdown-menu show']/a");
		By linkedlist = By.xpath("//a[contains(text(),'Linked List')]");
		By alert = By.xpath("//div[@role='alert']");
		By getStarted = By.xpath("//a[@href='data-structures-introduction']");
		By register = By.linkText("Register");
		By login =By.linkText("Login");
	public HomePages_Pf(WebDriver driver)
	{
		this.driver = driver;
	}
    public void getUrl()
    {
		driver.get("https://dsportalapp.herokuapp.com/");
	}
	public String message()
	{
		
		return driver.findElement(message).getText();
		
	}
	public void clickGetStarted() 
	{
		
		driver.findElement(getBtn).click();
	}
	public String registerLink()
	{
		return driver.findElement(register).getText();
	}
	public String signinLink() 
	{
	
		return driver.findElement(signin).getText();
	}
	public void dropDown() 
	{
		
		driver.navigate().to("https://dsportalapp.herokuapp.com/home");	
		driver.findElement(dropdown).click();
	}
	public int dropDownMenuSize() 
	{
		driver.navigate().to("https://dsportalapp.herokuapp.com/home");
		driver.findElement(dropdown).click();
		return driver.findElements(dropdownsize).size();
	}
	public List<String> dropDownList() 
	{

		List<String> dropdownlist = new ArrayList<String>();
		List <WebElement> dropdown = driver .findElements(By.xpath("//div[@class='dropdown-menu show']/a"));
		
		for (WebElement e : dropdown) {	
			String text = e.getText();		
			System.out.println(text);		
			 dropdownlist.add(text);
	}
		return dropdownlist;
    }
	public void clickDropdown()
	{
		driver.findElement(dropdown).click();
		driver.findElement(linkedlist).click();			
	}
		public String errorMSg() 
	{
		
		String alertmsg = driver.findElement(alert).getText();
		return alertmsg;
	}
public void clickDataStructures() 
    {
		
		 driver.findElement(getStarted).click();
		
	}
		public String errorMsg1() 
	{
		 String alertmsg1 = driver.findElement(alert).getText();
				return alertmsg1;
	}	public void getRegisterPage() 
	{
		driver.get("https://dsportalapp.herokuapp.com/register");
	}
	public String gettextLogin() 
	{
		
	return driver.findElement(login).getText();
	}	
}
