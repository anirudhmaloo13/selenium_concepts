package com.brillio.frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoHdfc {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		//switch to frame
		driver.switchTo().frame(0);
		driver.findElement(By.name("fldLoginUserId")).sendKeys("123");
		driver.findElement(By.xpath("//a[contains(text(),'CONTINUE')]")).click();
	
		// come out of frame
		driver.switchTo().defaultContent();
		
	}

}
