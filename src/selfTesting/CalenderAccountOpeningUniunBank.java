package selfTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalenderAccountOpeningUniunBank {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://icmt.unionbankofindia.co.in/account");
		Select ms = new Select(driver.findElement(By.xpath("//select[@name='ddlTitle']")));
		ms.selectByValue("MR");
		driver.findElement(By.xpath("//span[@id='PopCalendar1_Control']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//span[@id='popupSuperSpanYear0']")).click();
		driver.findElement(By.xpath("//table[@dir='ltr']//tr[" + 8 + "]")).click();
		driver.findElement(By.xpath("//span[@id='popupSuperSpanMonth0']")).click();
		driver.findElement(By.xpath("//div[@id='popupSuperMonth']//tbody/tr[" + 9 + "]")).click();
		driver.findElement(By.xpath("//div[@id='popupSuperContent0']//tbody/tr["+2+"]/td["+6+"]")).click();
		Select id = new Select (driver.findElement(By.xpath("//select[@id='ddlidproof']")));
		id.selectByVisibleText("UIDAI CARD (AADHAAR CARD)");
	}
}
