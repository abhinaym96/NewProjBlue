package com.qateam.testbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.qateam.utilies.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestbaseClass {
	public static WebDriver driver;
	
	ReadConfig readcondata = new ReadConfig();
	
	@Parameters("browser")
	@BeforeMethod
	public void setup(String br) {
		if(br.equalsIgnoreCase("Brave")) {
			ChromeOptions options = new ChromeOptions().setBinary("C:\\Program Files (x86)\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(options);
		}
		else if(br.equalsIgnoreCase("FireFox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(br.equalsIgnoreCase("IE")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		else {
			System.out.println("Please Enter Correct Browser Name");
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(readcondata.getAppURl());
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
