package littlestation;

import java.util.Base64;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Issue;
import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.TmsLink;
import utilities.CaptureScreenshot;

import java.io.ByteArrayInputStream;

public class Tc01HomePage extends BaseTest{

	@Test
	@Description("Test the Title of the Website")
	@Severity(SeverityLevel.CRITICAL)
	@Owner("Jeetendra Gupta")
	@Link(name = "Website", url = "https://littlestation.in/")
	@Issue("AUTH-123")
	@TmsLink("TMS-456")
	public void launchApplciation() {	
		String actualText = driver.findElement(By.xpath(".//p[@class='wp-block-site-tagline has-small-font-size']"))
				.getText();
		System.out.println(actualText);
		Assert.assertEquals("Little Treasures, Big Smiles!", actualText);
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		String source = screenshot.getScreenshotAs(OutputType.BASE64);
		byte[] decodedImg = Base64.getDecoder().decode(source);
		Allure.addAttachment("Header Screenshot", new ByteArrayInputStream(decodedImg));
	}
	
	@Test
	public void validateLink() {	
		String actualText = driver.findElement(By.xpath(".//p[@class='wp-block-site-tagline has-small-font-size']"))
				.getText();
		System.out.println(actualText);
		Assert.assertEquals("Little Treasures, Big Smiles!", actualText);		
		CaptureScreenshot.takescreenshot(driver, "font validation");
	}
}
