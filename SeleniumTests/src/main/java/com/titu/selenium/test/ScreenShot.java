package com.titu.selenium.test;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.Augmenter;

public class ScreenShot {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
//		 WebDriver augmentedDriver = new Augmenter().augment(driver);
//	        File screenshot = ((TakesScreenshot)augmentedDriver).
//	                            getScreenshotAs(OutputType.FILE);
	        Thread.sleep(1000);
	        WebElement el = (WebElement) driver.findElements(By.className("mlmipi"));
	        Actions builder = new Actions(driver);
	        builder.doubleClick(el).build().perform(); 
	}

}
