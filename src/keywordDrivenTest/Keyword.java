package keywordDrivenTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

public class Keyword {
	public static WebDriver driver;
	public static void launchDriver(String browsername) {
		switch(browsername) {
		case "chrome": 
			driver =new ChromeDriver();
			break;
		case "firefox": 
			driver =new FirefoxDriver();
			break;
			default: System.out.println("please provide proper browser driver");
			
		}
	}
	
	
	public void maximizeWindow() {
		driver.manage().window().maximize();
	}

	public void enterText( String locator, String value, String SendkeysText) {
		getWebElements(locator, value).sendKeys(SendkeysText);
	}

	private WebElement getWebElements( String locator, String value) {
		WebElement element = null;

		switch (locator) {
		case "xpath":
			element = driver.findElement(By.xpath(value));
			break;
		case "css":
			element = driver.findElement(By.cssSelector(value));
			break;
		case "id":
			element = driver.findElement(By.id(value));
			break;
		case "class":
			element = driver.findElement(By.className(value));
			break;
		case "name":
			element = driver.findElement(By.name(value));
			break;
		case "linktext":
			element = driver.findElement(By.linkText(value));
			break;
		case "partialLinkText":
			element = driver.findElement(By.partialLinkText(value));
			break;
		default:
			System.out.println("No such locator found please provide proper path ");
		}
		return element;
	}

	public void clickOnElement( String locator, String value) {
		getWebElements( locator, value).click();
	}
 public void selectFromDropDown( String locator , String value , String textToSelect) {
	 WebElement element = getWebElements( locator, value);
	  Select select = new Select(element);
 }
	public void launchWebSite(String site) {
		driver.get(site);
	}

	public void closeWindow() {
		driver.close();
	}

	public void quitWindows() {
		driver.quit();
	}

//	public static void main(String[] args) {
//		//WebDriver driver ;
//		Keyword key = new Keyword(driver);
//		key.defineWebdriver(driver, "chrome");
//		key.launchWebSite(driver, "https://www.google.com");
//
//	}

}
