package pomTesting;

import org.openqa.selenium.By;



public class HomePage {
	public static void enterTextinSearchBox(String textTosearch) {
		Keyword.driver.findElement(By.id("search_query_top")).sendKeys(textTosearch);
	}
//   public static void main(String[] args) {
//	Keyword.openBrowser();
//	Keyword.openUrl();
//}
}
