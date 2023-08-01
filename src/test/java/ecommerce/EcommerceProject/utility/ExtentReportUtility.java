package ecommerce.EcommerceProject.utility;

import java.io.File;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;

public class ExtentReportUtility {

	private static ExtentReports extent;

	public static ExtentReports ExtentReportInstance() {
		if (extent == null) {
			extent = new ExtentReports(".\\target\\surefire-reports\\html\\extent.html", true,
					DisplayOrder.OLDEST_FIRST);
			extent.loadConfig(new File(".\\src\\test\\resources\\extentConfig\\ReportsConfig.xml"));
		}
		return extent;
	}
}
