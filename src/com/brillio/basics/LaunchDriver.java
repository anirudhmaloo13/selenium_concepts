package com.brillio.basics;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchDriver {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driver.get("https://www.facebook.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.linkText("Create New Account")).click();
		
	//driver.findElement(By.id("email")).sendKeys("Anirudh.maloo@brillio.com");
	//	driver.findElement(By.id("pass")).sendKeys("Anirudh123");
	//	Thread.sleep(3000);
	//	driver.findElement(By.name("login")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("John123");
		driver.findElement(By.name("lastname")).sendKeys("John123");
		driver.findElement(By.id("password_step_input")).sendKeys("John123");
		
		Select day= new Select(driver.findElement(By.id("day")));
		day.selectByIndex(14);
		
		Select month= new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("Dec");
		
		Select year= new Select(driver.findElement(By.id("year")));
		year.selectByValue("2000");
		
		driver.findElement(By.xpath("//input[@value='2']")).click();
		driver.findElement(By.name("websubmit")).click();
			}

}
