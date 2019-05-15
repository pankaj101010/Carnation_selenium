package screenShotTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumScreenShot {
   public static WebDriver driver ;
   public static void screenShot(WebDriver driver) {
	   File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	     try {
			FileUtils.copyFile(screenshot, new File("F:\\shot.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   }
	public static void main(String[] args) {
	 driver = new ChromeDriver();
	 driver.get("https://www.google.com");
    
	}

}
