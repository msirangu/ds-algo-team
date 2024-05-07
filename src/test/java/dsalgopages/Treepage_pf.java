package dsalgopages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsalgoutilities.PythonExcelReader;

public class Treepage_pf {
	WebDriver driver;
	PythonExcelReader excel = new PythonExcelReader();
	By python_editor =By.xpath("//form[@id='answer_form']/div/div/div/textarea");
	By run = By.xpath("//button[@type='button']");
	By output = By.xpath("//pre[@id='output']");
	By tryhere = By.xpath("//a[@class='btn btn-info']");
	By getstarted = By.xpath("//a[@href='tree']");
	By overview = By.xpath("//a[@href='overview-of-trees']");
	By terminologies = By.xpath("//a[@href='terminologies']");
	By typesoftrees = By.xpath("//a[@href='types-of-trees']");
	By treetraversal = By.xpath(" //a[@href='tree-traversals']");
	By traversalillustration = By.xpath("//a[@href='traversals-illustration']");
	By binarytrees = By.xpath("//a[@href='binary-trees']");
	By typesofbinarytress = By.xpath("//a[@href='types-of-binary-trees']");
	By implementationinpython = By.xpath("//a[@href='implementation-in-python']");
	By binarytreetraversal = By.xpath("//a[@href='binary-tree-traversals']");
	By implementationofbinarytrees = By.xpath("//a[@href='implementation-of-binary-trees']");
	By application = By.xpath("//a[@href='applications-of-binary-trees']");
	By binarysearchtree = By.xpath("//a[@href='binary-search-trees']");
	By implementation = By.xpath("//a[@href='implementation-of-bst']");
	
	
	
	
	public Treepage_pf(WebDriver driver) {
		this.driver=driver;
	}

	public void getStarted() {
		driver.findElement(getstarted).click();
	}

	public void clickOnOverview() {
		driver.navigate().to("https://dsportalapp.herokuapp.com/tree/");
		driver.findElement(overview).click();
	}
	
	public void tryHere() {
		driver.findElement(tryhere).click();
		
	}
	
	

		public void clickTerminologies() {
			driver.navigate().to("https://dsportalapp.herokuapp.com/tree/");
			driver.findElement(terminologies).click();
			
		}		
		
		public void typesOfTrees() {
			
			driver.navigate().to("https://dsportalapp.herokuapp.com/tree/");
			driver.findElement(typesoftrees).click();
			
		}
		
		public void traversalIllustration() {
			driver.navigate().to("https://dsportalapp.herokuapp.com/tree/");
			driver.findElement(traversalillustration).click();
		}
		
		public void binaryTrees() {
			
			driver.navigate().to("https://dsportalapp.herokuapp.com/tree/");
			driver.findElement(binarytrees).click();
		}
		
		public void typesOfBinaryTrees() {
			
			driver.navigate().to("https://dsportalapp.herokuapp.com/tree/");
			driver.findElement(typesofbinarytress).click();
		}
		
		public void implementationInPython() {
			
			driver.navigate().to("https://dsportalapp.herokuapp.com/tree/");
			driver.findElement(implementationinpython).click();
		}
		
		public void binaryTreeTraversal() {
			
			driver.navigate().to("https://dsportalapp.herokuapp.com/tree/");
			driver.findElement(binarytreetraversal).click();
		}
		
		public void implementationOfBinaryTrees() {
			driver.navigate().to("https://dsportalapp.herokuapp.com/tree/");
			driver.findElement(implementationofbinarytrees).click();
		}
		
		public void applicationOfBinaryTrees() {
			driver.navigate().to("https://dsportalapp.herokuapp.com/tree/");
			driver.findElement(application).click();
		}
		
		
		public void binarySearchTree() {
			
			driver.navigate().to("https://dsportalapp.herokuapp.com/tree/");
			driver.findElement(binarysearchtree).click();
		}
		
		public void implementationOfBST() {
			
			driver.navigate().to("https://dsportalapp.herokuapp.com/tree/");
			driver.findElement(implementation).click();
		}
		
		public void treeTraversal() {
			driver.navigate().to("https://dsportalapp.herokuapp.com/tree/");
			driver.findElement(treetraversal).click();
			
		}
		public void pythonEditor() throws IOException {
			
			WebElement try_editor_clear=driver.findElement(python_editor);
			String[] list = excel.fileReader()	;
			Actions actions= new Actions(driver);
			actions.click(try_editor_clear).keyDown(Keys.CONTROL).sendKeys("\u0061").sendKeys(Keys.BACK_SPACE).keyUp(Keys.CONTROL).perform();
			driver.findElement(python_editor).sendKeys(list[0]);
			driver.findElement(run).click();
			System.out.println("Output is :"+driver.findElement(output).getText());
			
			actions.click(try_editor_clear).keyDown(Keys.CONTROL).sendKeys("\u0061").sendKeys(Keys.BACK_SPACE).keyUp(Keys.CONTROL).perform();
			driver.findElement(python_editor).sendKeys(list[1]);
			driver.findElement(run).click();
			System.out.println("Alert is :"+driver.switchTo().alert().getText() );
			driver.switchTo().alert().accept();
				
				
			}
		
		
		
	
}
