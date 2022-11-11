package com.brillio.alert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/IpinResetUsingOTP.htm");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.xpath("//img[contains(@alt,'Go')]")).click();
		
		String alertmsg= driver.switchTo().alert().getText();
		System.out.println(alertmsg);
		
		driver.switchTo().alert().accept();
		
		driver.quit();

	}

}
