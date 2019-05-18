package pomTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keyword {
	public static WebDriver driver;

	public static void openBrowser() {
		driver = new ChromeDriver();

	}
   public static void openUrl() {
	   driver.get("http://automationpractice.com/index.php");
   }
}
