package selfTesting;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowhandle {

	public static void main(String[] args) {
//		@Test
//		public void  main() {
		System.setProperty("webdriver.chrome.driver", "E:\\\\Software file\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.get("https://www.bankersadda.com/");
		String parent =  driver.getWindowHandle();
		System.out.println(parent);
		driver.findElement(By.xpath("//li[@class='ebooks']//a//img")).click();
		//driver.findElement(By.name("q")).sendKeys("kindle online reader");
		//driver.findElement(By.xpath("//input[@value='Google Search']")).click();
       	Set <String> child = driver.getWindowHandles(); 
       	System.out.println(child);
       	 int count = child.size();
       	 System.out.println(count);
       	 for (String string : child) {
			if (!parent.equalsIgnoreCase(string)) {
				driver.switchTo().window(string);
				driver.getTitle();
				driver.close();
			}
			driver.switchTo().window(parent);
		}
 
		}
//	}

}
