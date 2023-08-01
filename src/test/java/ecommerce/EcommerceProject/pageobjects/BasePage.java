package ecommerce.EcommerceProject.pageobjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;

import com.relevantcodes.extentreports.LogStatus;

import ecommerce.EcommerceProject.testcases.BaseTest;
import ecommerce.EcommerceProject.utility.ScreenShotUtility;

public class BasePage extends BaseTest {

	public void click(String loactor, String info) {
		test.log(LogStatus.INFO, info);
		driver.findElement(By.xpath(loactor)).click();
	}

	public void type(String locator, String inputdata, String info) {
		test.log(LogStatus.INFO, info);
		driver.findElement(By.xpath(locator)).sendKeys(inputdata);
	}

	public void verifyEquals(String actualLocator, String expected) throws IOException {
		String actual = driver.findElement(By.xpath(actualLocator)).getText();
		try {
			Assert.assertEquals(actual, expected);
		} catch (Throwable t) {

			ScreenShotUtility.captureScreenshot();

			// ReportNG
			Reporter.log("<br>" + "Verification failure : " + t.getMessage() + "<br>");
			Reporter.log("<a target=\"_blank\" href=" + ScreenShotUtility.screenshotname + "><img src="
					+ ScreenShotUtility.screenshotname + " height=300 width=400></img></a>");
			Reporter.log("<br>");
			Reporter.log("<br>");

			// Extent Report

			test.log(LogStatus.FAIL, "Verification Failed With Exception : " + t.getMessage());
			test.log(LogStatus.FAIL, test.addScreenCapture(ScreenShotUtility.screenshotname));

		}

	}
}
