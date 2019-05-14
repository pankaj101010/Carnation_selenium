package cookiesTest;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesHandling {
	 WebDriver driver;

	/***
	 * This method is used to get all cookies in the form of array .
	 * 
	 * @param driver
	 * @return it will return all cookies in arrays.
	 */
	public Set getCookies(WebDriver driver) {
		Set<Cookie> cookies = driver.manage().getCookies();
		return cookies;
	}
	

	/***
	 * 
	 * @param driver
	 * @return it will return {@code int} size of all cookies
	 */
	public  int cookieSize(WebDriver driver) {
		Set<Cookie> cookies = driver.manage().getCookies();
		return cookies.size();
	}

	/***
	 * 
	 * @param driver
	 */
	public  void cookieName(WebDriver driver) {
//    	 Set<Cookie> cookies  = driver.manage().getCookies();
//    	 for (Cookie string : cookies) {
// 			System.out.println(string.getName());
// 		}
		// System.out.println(driver.manage().getCookieNamed("session-id-time"));
	}

	public  void addCookie(WebDriver driver, String name, String value) {
		Cookie cookies = new Cookie(name, value);
		driver.manage().addCookie(cookies);

	}

	public  String getCookieName(WebDriver driver) {
		String name = "";
		Set<Cookie> cookies = driver.manage().getCookies();
		for (Cookie string : cookies) {
			name = string.getName();
		}
		return name;
	}
	public void deletcookies(WebDriver driver) {
		driver.manage().deleteAllCookies();
	}

//	public static void main(String[] args) {
//		driver = new ChromeDriver();
//		driver.get("https://www.google.in");
//		for (Object string : getCookies(driver)) {
//			System.out.println(string);
//		}
//
//		System.out.println("size of cookies is : " + cookieSize(driver));
//		cookieName(driver);
//		addCookie(driver, "pankaj", "11234");
//		System.out.println(getCookieName(driver));
//		System.out.println("size of cookies is : " + cookieSize(driver));

	//}

}
