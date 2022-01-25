package com.qateam.testcases;

import org.testng.annotations.Test;

import com.qateam.pagelayer.ContactUsPage;
import com.qateam.testbase.TestbaseClass;

public class ContactUs_TC extends TestbaseClass{
	ContactUsPage C;
	
	@Test
	public void verifyContactUS() {
		
		driver.get("https://www.timeanddate.com/information/feedback.html");
		C = new ContactUsPage();
		C.UNAme1("Abhinay");
		C.enterEmailID("abhinay@gmail.com");
		C.enterFeedback("habbsdjhbahsd asd");
	}
}
