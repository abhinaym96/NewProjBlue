package com.qateam.utilies;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class MyScreenShot {
	public static void takeSS(WebDriver driver,String filenames){
		try {
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File des = new File("C:\\Users\\Abhinay Meshram\\eclipse-workspace\\New Testing Batch\\MyMavenProj\\Saved ScreenShot"+filenames+".png");
			FileHandler.copy(src, des);
			System.out.println("ScreenShot has been taken");
		} catch (IOException e) {
			System.out.println("Exception while ScreenShot taken"+e.getMessage());
		}
}
}