package ecommerce.EcommerceProject.pageobjects;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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

	public WebElement WebdriverWait(String locator, int time) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		WebElement waitForElement = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(locator))));
		return waitForElement;
	}

	public void getWindowAlertText() {
		Alert alert = driver.switchTo().alert();
		String aletText = alert.getText();
		test.log(LogStatus.INFO, "Text on the alert is : " + aletText);
	}

	public void acceptWindowAlertText() {
		Alert alert = driver.switchTo().alert();
		String aletText = alert.getText();
		test.log(LogStatus.INFO, "Click ok button on the alert which is appear after adding product into cart");
	}

	public void getText(String locator) {
		String text = driver.findElement(By.xpath(locator)).getText();
		test.log(LogStatus.INFO, text);
	}

	public void capturescreenshot() {
		try {
			ScreenShotUtility.captureScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// test.log(LogStatus.PASS, test.addScreenCapture(TestUtil.screenshotname));
		test.log(LogStatus.INFO, test.addScreenCapture(ScreenShotUtility.screenshotname));
		extent.endTest(test);
		extent.flush();
	}
}
