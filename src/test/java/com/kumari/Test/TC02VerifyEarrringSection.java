package com.kumari.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.kumari.pages.KumariHomePage;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import littlestation.BaseTest;

public class TC02VerifyEarrringSection extends BaseTest {
	

	@Test
	@Description("Verify User Can close the Pop up Window")
	@Severity(SeverityLevel.MINOR)
	@Owner("Jeetendra Gupta")
	public void launchWebsite() {
		KumariHomePage page = new KumariHomePage(driver);
		Assert.assertEquals(page.closeSingupPopup(), true);
	}

	public void verifyearrringInTopNavBar() {

	}

	public void getsubmenuUnderShopByStyle() {

	}

	public void getsubmenuUnderShiopByMaterial() {

	}

	public void navigateToEarringsPage() {

	}

	public void verifysortBy() {

	}

	public void validateproductByPriceFilter() {

	}

}
