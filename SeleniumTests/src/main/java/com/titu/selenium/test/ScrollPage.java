package com.titu.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;

public class ScrollPage {
	public static void main(String[] args)throws Exception {
		FirefoxProfile profile = new FirefoxProfile();
		profile.setEnableNativeEvents(true);
		WebDriver driver = new FirefoxDriver(profile);
		driver.get("http://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		Thread.sleep(6000L);
		WebElement element = driver.findElement(By .xpath("/html/body/div"));
		Actions actn = new Actions(driver);
		actn.dragAndDropBy(element, 50, 50).build().perform();
		
	}

}
