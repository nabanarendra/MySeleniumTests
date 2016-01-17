package com.titu.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLoginLogout {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(1000, 500);
//		String str = driver.getTitle();
//		System.out.println(str);
//		driver.getCurrentUrl();
//		Thread.sleep(5000);
//		driver.navigate().refresh();
		
		driver.findElement(By.id("email")).sendKeys("itsmetitu@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("india2020");
		Thread.sleep(1000);
		driver.findElement(By.id("u_0_v")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("pageLoginAnchor")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("_54nc")).click();
//		Select sel = new Select(driver.findElement(By.id("pageLoginAnchor")));
//		sel.selectByValue("_54nh");
		
	

	}

}
