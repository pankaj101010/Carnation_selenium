package selfTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cookiesTest.CookiesHandling;

public class CookieTesting {

	public static void main(String[] args) {
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.amazon.com/");
		CookiesHandling hld = new CookiesHandling();
		System.out.println(hld.cookieSize(dr));
		System.out.println(hld.cookieName(dr));
		WebDriverWait wait = new WebDriverWait(dr,20);
		// webdriver wait has 3 constructor 
		wait.pollingEvery(10,TimeUnit.SECONDS);
		wait.ignoring(TimeoutException.class);
		wait.until(ExpectedConditions.alertIsPresent());
	}

}
