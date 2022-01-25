package com.qateam.utilies;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.qateam.testbase.TestbaseClass;

public class Highlighter extends TestbaseClass {

	public static void highlighter(WebElement ele) {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].setAttribute('style','background:yellow; border:2px solid red;')",ele);
	}

}
