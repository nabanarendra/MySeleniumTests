package com.titu.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "Z:\\software\\chromedriver.exe");
//		System.setProperty("webdriver.ie.driver", "Z:\\software\\IEDriverServer.exe");
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(1000);
		driver.get("http://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.id("lst-ib")).sendKeys("Sachin Tendulkar");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.name("btnG")).click();
		driver.findElement(By.className("fl q _KCd _tWc")).click();
		
	}
}