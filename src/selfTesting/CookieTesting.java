package selfTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cookiesTest.CookiesHandling;

public class CookieTesting {

	public static void main(String[] args) {
		WebDriver dr = new ChromeDriver();
		dr.get("https://codesignal.com/");
		CookiesHandling hld = new CookiesHandling();
		 System.out.println(hld.cookieSize(dr));
	}

}
