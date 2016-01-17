package com.test.selenium;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Example1 {

	WebDriver driver = null;

	@BeforeClass
	public void setup() {
		driver = new FirefoxDriver();
		driver.get("file:///Z:/Work/workspace/SeleniumTest1/src/main/resources/test.html");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void test1() throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get("file:///Z:/Work/workspace/SeleniumTest1/src/main/resources/test.html");

		Thread.sleep(2000);

		WebElement divElement = driver.findElement(By.id("sampleDiv"));

		System.out.println("divElement Text :" + divElement.getText());

		driver.close();
		driver.quit();
	}

	@Test
	public void test2() throws InterruptedException {

		WebElement headElement = driver.findElement(By.tagName("h2"));
		System.out.println("headElement Text :" + headElement.getText());
		driver.close();
		driver.quit();
	}

}
