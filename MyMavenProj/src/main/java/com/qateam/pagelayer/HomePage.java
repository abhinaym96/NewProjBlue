package com.qateam.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qateam.testbase.TestbaseClass;

public class HomePage extends TestbaseClass {
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//input[@class='picker-city__input'])[1]")
	WebElement search_box;
	public void entertext(String text) {
		search_box.sendKeys(text);
	}
	@FindBy(xpath="(//button[@class='picker-city__button'])[1]")
	WebElement ClickOn_Search;
	public void ClickonS() {
		ClickOn_Search.click();
	}
	
	public String gettitle() {
		String title= driver.getTitle();
		return title;
	}

}
