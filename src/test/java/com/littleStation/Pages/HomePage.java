package com.littleStation.Pages;

import java.io.ByteArrayInputStream;
import java.util.Base64;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.qameta.allure.Allure;

public class HomePage {
	private WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void getheader() {
		String actualText = driver.findElement(By.xpath(".//p[@class='wp-block-site-tagline has-small-font-size']"))
				.getText();
		System.out.println(actualText);
		Assert.assertEquals("Little Treasures, Big Smiles!", actualText);
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		String source = screenshot.getScreenshotAs(OutputType.BASE64);
		byte[] decodedImg = Base64.getDecoder().decode(source);
		Allure.addAttachment("Header Screenshot", new ByteArrayInputStream(decodedImg));
	}
	
	

}
