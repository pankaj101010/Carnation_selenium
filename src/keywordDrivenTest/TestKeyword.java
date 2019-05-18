package keywordDrivenTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestKeyword {

	@Test
	public void tc_01() {
		PropertiesFile fis = new PropertiesFile();
		Keyword key = new Keyword();
		key.launchDriver("chrome");
		key.maximizeWindow();
		key.launchWebSite( "https://www.facebook.com/");
		String [] email=fis.getLocator("email");
		String [] pass=fis.getLocator("password");
		String [] click=fis.getLocator("login");
		key.enterText(email[0],email[1],email[2]);
		key.enterText(pass[0],pass[1],pass[2]);
		key.clickOnElement( click[0],click[1]);
		key.closeWindow();
		
	}
}
