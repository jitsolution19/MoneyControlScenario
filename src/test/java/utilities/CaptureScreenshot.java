package utilities;

import java.io.ByteArrayInputStream;
import java.util.Base64;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.qameta.allure.Allure;

public class CaptureScreenshot {

	public static void takescreenshot(WebDriver driver,String screenshotName) {
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		String source = screenshot.getScreenshotAs(OutputType.BASE64);
		byte[] decodedImg = Base64.getDecoder().decode(source);
		Allure.addAttachment(screenshotName, new ByteArrayInputStream(decodedImg));
	}
}
