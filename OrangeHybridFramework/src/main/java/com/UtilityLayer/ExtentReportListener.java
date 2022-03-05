package com.UtilityLayer;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ExtentReportListener extends ExtentReportSetUpspark implements ITestListener {
	public static ExtentTest extentTest;

	public void onStart(ITestContext context) {
		extent = ExtentReportSetUpspark.extentReportSetUP();
		System.out.println("Report is Starterd");
	}

	public void onTestStart(ITestResult result) {
		extentTest = extent.createTest(result.getMethod().getMethodName());

		System.out.println("Test Cases is started Name is  " + result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) {
		extentTest.log(Status.PASS, "Test Case is passed :" + result.getMethod().getMethodName());

		extentTest.addScreenCaptureFromPath(ExtentReportSetUpspark.getScreenshotPassedTestCases(result.getMethod().getMethodName()));
	}

	public void onTestFailure(ITestResult result) {

		extentTest.log(Status.FAIL, "Test Cases is fail : " + result.getMethod().getMethodName());

	extentTest.addScreenCaptureFromPath(ExtentReportSetUpspark.getScreenshotFailedTestCases(result.getMethod().getMethodName()));
	}

	public void onTestSkipped(ITestResult result) {
		extentTest.log(Status.SKIP, "Test Cases is Skip :" + result.getMethod().getMethodName());

		System.out.println("test case is skip " + result.getMethod().getMethodName());
	}

	
	public void onFinish(ITestContext context) {
		System.out.println("All test case is finish");
		extent.flush();
	}
	//public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	//}

}



