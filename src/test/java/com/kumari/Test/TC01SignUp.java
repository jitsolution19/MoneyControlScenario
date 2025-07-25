package com.kumari.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.kumari.pages.KumariHomePage;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import littlestation.BaseTest;

public class TC01SignUp extends BaseTest {

	@Test
	@Description("Validate User is able to Sign up from the popup Window")
	@Severity(SeverityLevel.MINOR)
	@Owner("Jeetendra Gupta")
	public void SignupWebsitefromPopup() {
		KumariHomePage page = new KumariHomePage(driver);
		Assert.assertEquals(page.validatePopupWindow(),true);
	}
}
