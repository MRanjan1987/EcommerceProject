package ecommerce.EcommerceProject.testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import ecommerce.EcommerceProject.utility.ExtentReportUtility;

public class BaseTest {
	public static WebDriver driver;
	public static Properties prop;
	private FileInputStream fis;
	public ExtentReports extent = ExtentReportUtility.ExtentReportInstance();
	public static ExtentTest test;

	@BeforeClass
	public void setUp() throws IOException {
		fis = new FileInputStream(".//src//test//resources//properties//config.properties");
		prop = new Properties();
		prop.load(fis);

		if (driver == null) {

			if (prop.getProperty("browser").equals("chrome")) {

				driver = new ChromeDriver();
			}
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
