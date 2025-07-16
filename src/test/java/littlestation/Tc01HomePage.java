package littlestation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tc01HomePage {
	@Test
	public void launchApplciation() {

		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://littlestation.in/");
		String actualText = driver.findElement(By.xpath(".//p[@class='wp-block-site-tagline has-small-font-size']"))
				.getText();
		System.out.println(actualText);
		Assert.assertEquals("Little Treasures, Big Smiles!", actualText);
		driver.quit();

	}
}
