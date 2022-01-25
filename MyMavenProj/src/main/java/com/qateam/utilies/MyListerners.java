package com.qateam.utilies;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.qateam.testbase.TestbaseClass;


public class MyListerners extends TestbaseClass implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("Testcases Started because : "+result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Testcases Success because : "+result.getName());
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Testcases failed and taking SS because : "+result.getName());
		MyScreenShot.takeSS(driver, result.getName());
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Testcases Skipped because : "+result.getName());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Testcases Partically Failed because : "+result.getName());
		
	}

	public void onStart(ITestContext context) {
		System.out.println("Testcases Started on because : "+context.getName());
		
	}

	public void onFinish(ITestContext context) {
		System.out.println("Testcases Finish on because : "+context.getName());
		
	}
	
}
