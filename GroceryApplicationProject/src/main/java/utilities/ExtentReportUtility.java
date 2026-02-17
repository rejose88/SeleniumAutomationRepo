package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportUtility {

	public static final ExtentReports extentReports = new ExtentReports();

	public synchronized static ExtentReports createExtentReports() {

		ExtentSparkReporter reporter = new ExtentSparkReporter("./extent-reports/extent-report.html");
		// specify the path where the report will be generated
		reporter.config().setReportName("7RMartSupermarketProject");
		extentReports.attachReporter(reporter);

		extentReports.setSystemInfo("Organization", "Obsqura"); // set informations to be included in the report
		extentReports.setSystemInfo("Name", " Reena");
		return extentReports;

	}
}
