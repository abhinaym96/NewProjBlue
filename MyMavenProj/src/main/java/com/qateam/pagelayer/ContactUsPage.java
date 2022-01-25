package com.qateam.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qateam.testbase.TestbaseClass;

public class ContactUsPage extends TestbaseClass {
	public ContactUsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='fullname']")
	WebElement UName;
	public void UNAme1(String text) {
		UName.sendKeys(text);
	}
	
	@FindBy(xpath="//input[@id='email']")
	WebElement EmailID;
	public void enterEmailID(String text) {
		EmailID.sendKeys(text);
	}
	
	@FindBy(xpath="//textarea[@id='body']")
	WebElement Feedback;
	public void enterFeedback(String text) {
		Feedback.sendKeys(text);
	}
}
