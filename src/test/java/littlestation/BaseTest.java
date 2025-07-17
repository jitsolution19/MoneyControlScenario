package littlestation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.qameta.allure.Step;
import utilities.CaptureScreenshot;

public class BaseTest {
	static WebDriver driver = null;

	@BeforeTest
	public void setup() {
		settingChrome();
		deleteCookies();
		launchbrowser();
	}

	@Step("Setting the Chrome Browser for Testing")
	public void settingChrome() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new");
		options.addArguments("--disable-gpu");
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-dev-shm-usage");
		driver = new ChromeDriver(options);
	}

	@Step("Delete the Cookies and Maximize the Browser")
	public void deleteCookies() {
		new CaptureScreenshot();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}

	@Step("Launch the Application Url")
	public void launchbrowser() {

		driver.get("https://littlestation.in/");
		
	}

	@AfterTest
	public void teardown() {
		driver.quit();

	}
}
