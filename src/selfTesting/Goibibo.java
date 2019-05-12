package selfTesting;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Goibibo {

	public static void close(WebDriver d) {
		//d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.switchTo().frame("notification-frame-22a342a1b");
		d.findElement(By.xpath("//a[@id='webklipper-publisher-widget-container-notification-close-div']//i")).click();
		d.switchTo().defaultContent();
	}
	public static void  switchTocal(WebDriver d) {
		int maxamount = 1000000;
		List<WebElement> week = d.findElements(By.xpath("//div[@class='DayPicker-Body']/div"));
		for (int i = 1; i <= week.size(); i++) {
			List<WebElement> weeekdays = d.findElements(
					By.xpath("//div[@class='DayPicker-Body']/div[" + i + "]/div[@aria-disabled='false']"));
			int count = weeekdays.size();
			for (int j = 1; j <= count; j++) {
				String amount = d.findElement(By.xpath("//div[@class='DayPicker-Body']/div[" + i
						+ "]/div[@aria-disabled='false'][" + j + "]/descendant::*[5]")).getText();
				int p = Integer.parseInt(amount);
				if (p < maxamount) {
					maxamount = p;
				}
			}
		}
		for (int i = 1; i <= week.size(); i++) {
			String a = Integer.toString(maxamount);
			List<WebElement> weekdays = d.findElements(
					By.xpath("//div[@class='DayPicker-Body']/div[" + i + "]/div[@aria-disabled='false']"));
			int count = weekdays.size();
			for (int j = 1; j <= count; j++) {
				String b = d.findElement(By.xpath("//div[@class='DayPicker-Body']/div[" + i
						+ "]/div[@aria-disabled='false'][" + j + "]/descendant::*[5]")).getText();
				if (a.equals(b)) {
					d.findElement(By.xpath("//div[@class='DayPicker-Body']/div[" + i + "]/div[@aria-disabled='false']["
							+ j + "]/descendant::*[5]")).click();
					break;
				}
			}
		}
		
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.get("https://www.goibibo.com/");
		d.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		//d.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		Thread.sleep(10000);
		close(d);
		WebElement s = d.findElement(By.xpath("//input[@id='gosuggest_inputSrc']"));
		s.sendKeys("pune");
		Thread.sleep(1000);
		s.sendKeys(Keys.ARROW_DOWN);
		s.sendKeys(Keys.ENTER);
		WebElement dp = d.findElement(By.xpath("//input[@id='gosuggest_inputDest']"));
		dp.sendKeys("nag");
		Thread.sleep(1000);
		dp.sendKeys(Keys.ARROW_DOWN);
		dp.sendKeys(Keys.ENTER);
		for (int i = 0; i < 4; i++) {
			d.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
			Thread.sleep(1000);
		}
		switchTocal(d);
//		int maxamount = 0;
//		List<WebElement> week = d.findElements(By.xpath("//div[@class='DayPicker-Body']/div"));
//		for (int i = 1; i <= week.size(); i++) {
//			List<WebElement> weeekdays = d.findElements(
//					By.xpath("//div[@class='DayPicker-Body']/div[" + i + "]/div[@aria-disabled='false']"));
//			int count = weeekdays.size();
//			for (int j = 1; j <= count; j++) {
//				String amount = d.findElement(By.xpath("//div[@class='DayPicker-Body']/div[" + i
//						+ "]/div[@aria-disabled='false'][" + j + "]/descendant::*[5]")).getText();
//				int p = Integer.parseInt(amount);
//				if (p > maxamount) {
//					maxamount = p;
//				}
//			}
//		}
//		for (int i = 1; i <= week.size(); i++) {
//			String a = Integer.toString(maxamount);
//			List<WebElement> weekdays = d.findElements(
//					By.xpath("//div[@class='DayPicker-Body']/div[" + i + "]/div[@aria-disabled='false']"));
//			int count = weekdays.size();
//			for (int j = 1; j <= count; j++) {
//				String b = d.findElement(By.xpath("//div[@class='DayPicker-Body']/div[" + i
//						+ "]/div[@aria-disabled='false'][" + j + "]/descendant::*[5]")).getText();
//				if (a.equals(b)) {
//					d.findElement(By.xpath("//div[@class='DayPicker-Body']/div[" + i + "]/div[@aria-disabled='false']["
//							+ j + "]/descendant::*[5]")).click();
//					break;
//				}
//			}
//		}
//		
		
		
//		d.findElement(By.xpath("//i[@class='icon-bus db blue ico24 lh1-2 padT5 padB5']")).click();		
//		WebElement p=d.findElement(By.xpath("//input[@id='gi_source']"));
//		WebElement q=d.findElement(By.xpath("//input[@id='gi_destination']"));
//		p.sendKeys("pune");
//		Thread.sleep(1000);
//		p.sendKeys(Keys.ARROW_DOWN);
//		p.sendKeys(Keys.ENTER);
//		q.sendKeys("amra");
//		Thread.sleep(1000);
//		q.sendKeys(Keys.ARROW_DOWN);
//		q.sendKeys(Keys.ENTER);
//        
	}
}