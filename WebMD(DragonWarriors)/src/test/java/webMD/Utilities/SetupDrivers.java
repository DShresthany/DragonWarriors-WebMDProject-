package webMD.Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SetupDrivers {

	public static WebDriver chromeDriver;

	public static void setupChromeDriver() {
		WebDriverManager.chromedriver().setup();
		chromeDriver = new ChromeDriver();
		chromeDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static void closeChromeDriver() {
		chromeDriver.quit();
	}
}
