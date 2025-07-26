package com.littleStation.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.qameta.allure.Step;
import utilities.CaptureScreenshot;

public class HomePage {
	private WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	@Step("Validate the header of the Website")
	public void getheader() {
		String actualText = driver.findElement(By.xpath(".//p[@class='wp-block-site-tagline has-small-font-size']"))
				.getText();
		System.out.println(actualText);
		Assert.assertEquals("Little Treasures, Big Smiles!", actualText);
		CaptureScreenshot.takescreenshot(driver, "headerText");
	}

}
