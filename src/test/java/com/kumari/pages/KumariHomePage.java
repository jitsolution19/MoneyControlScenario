package com.kumari.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.qameta.allure.Step;
import utilities.CaptureScreenshot;

public class KumariHomePage {
	private WebDriver driver;
	private WebDriverWait wait;

	public KumariHomePage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}

	@Step("Validate the Popup Window is closed")
	public boolean closeSingupPopup() {
		boolean flag = false;
		try {
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("survey-frame-33l1hjm"));
			WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("surveyResponseFormId")));
			if (popup.isDisplayed()) {
				CaptureScreenshot.takescreenshot(driver, "popupScreenshot");
				driver.findElement(By.xpath(".//i[@class='wewidgeticon we_close icon-large']")).click();
				flag = true;
			}
		} catch (NoSuchElementException e) {
			System.out.println(e);
		}
		driver.switchTo().defaultContent();
		return flag;
	}

	@Step("Validate the Popup Window is Opened after the launch of application")
	public boolean validatePopupWindow() {
		boolean flag = false;
		try {
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("survey-frame-33l1hjm"));
			WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("surveyResponseFormId")));
			if (popup.isDisplayed()) {
				flag = true;
			}
		} catch (NoSuchElementException e) {
			System.out.println(e);
		}
		driver.switchTo().defaultContent();
		return flag;
	}
}
