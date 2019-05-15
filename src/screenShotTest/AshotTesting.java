package screenShotTest;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class AshotTesting { 
	public static WebDriver driver ;
	public static void main(String[] args) {
		 driver = new ChromeDriver();
		 driver.get("https://naukri.com");
		 AShot shot = new AShot();
		 //Screenshot a = shot.takeScreenshot(driver);
		  Screenshot a =  shot.shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		 try {
			ImageIO.write(a.getImage(), "PNG", new File("F:\\scren.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
