package com.qateam.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qateam.pagelayer.HomePage;
import com.qateam.testbase.TestbaseClass;

public class HomePage_TC extends TestbaseClass {
	HomePage h;
	@Test
	public void verifySearchBox() {
		h = new HomePage();
		h.entertext("StopWatch");
		h.ClickonS();
	}
	
	@Test
	public void verifyTitle() {
		String veri = h.gettitle();
		Assert.assertEquals(veri, "timeanddate.com");
	}
}
