package screenShotTest;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class AllTypeScreenShot {
	public static String getDate() {
		String fname = "";
		Date d = new Date();
		fname = d.toString().replace(" ", "-");
		return fname;
	}

	public static void currentPageAshot(WebDriver driver) {
		AShot shot = new AShot();
		Screenshot a = shot.takeScreenshot(driver);
		// Screenshot a =
		// shot.shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		try {
			ImageIO.write(a.getImage(), "JPG", new File("F:\\1.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void fullPageScreenShotAshot(WebDriver driver) {
		AShot shot = new AShot();
		Date ds = new Date();
	    Screenshot a = shot.takeScreenshot(driver);
	             a = shot.shootingStrategy(ShootingStrategies.viewportPasting(2000)).takeScreenshot(driver);
		try {
			ImageIO.write(a.getImage(), "PNG",
					new File("E:/test/SampleWS/test/Carnation-selenium/screenshot/"+ds.toString()+".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void defaultScreenShot(WebDriver driver) {
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshot, new File("F:\\shot.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void buffredImage(WebDriver driver) {
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			BufferedImage fullimg = ImageIO.read(screenshot);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		// System.out.println(date());
		// currentPageAshot();
		// System.out.println(getDate());
		fullPageScreenShotAshot(driver);
		driver.quit();
	}

}
