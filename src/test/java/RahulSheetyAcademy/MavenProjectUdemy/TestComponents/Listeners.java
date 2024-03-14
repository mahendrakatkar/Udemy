package RahulSheetyAcademy.MavenProjectUdemy.TestComponents;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import RahulSheetyAcademy.MavenProjectUdemy.Resources.ExtentReprotNG;

public class Listeners implements ITestListener {
	ExtentTest test;
	ExtentReports extent = ExtentReprotNG.getReportObject();

	@Override
	public void onStart(ITestContext context) {

	}

	@Override
	public void onTestStart(ITestResult result) {
	 test=	extent.createTest(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
test.log(Status.PASS, "passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
test.log(Status.FAIL, "failed");
test.fail(result.getThrowable());
	}

	@Override
	public void onTestSkipped(ITestResult result) {

	}

	@Override
	public void onFinish(ITestContext context) {

	}

}
