package javaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import allTimeRequirement.FirstToRun;

public class DemoTest {
	static WebDriver driver;
	public static void scriptRun() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeAsyncScript("document.getElementById(\"u_0_2\").click()");
	}
	public static void scrollPage() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeAsyncScript("window.scrollBy(1000,1000)");
	}

	public static void main(String[] args) throws InterruptedException {
		 driver = new ChromeDriver();
		driver.get("https://facebook.com");
		scriptRun();
		Thread.sleep(1000);
		scrollPage();
		

	}

}
