package RahulSheetyAcademy.MavenProjectUdemy.Resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReprotNG {
public static ExtentReports getReportObject() {
	String path = System.getProperty("user.dir")+"\\reports\\index.html";
	ExtentSparkReporter reporter = new ExtentSparkReporter(path);
	reporter.config().setReportName("web automation");
	reporter.config().setDocumentTitle("test Results");

	ExtentReports extent = new ExtentReports();
	extent.attachReporter(reporter);
	extent.setSystemInfo("tester", "mahendra");
	return extent;
}
}
