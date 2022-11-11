package com.brillio.javascript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://www.myntra.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		// element is not visible
		
		//driver.findElement(By.xpath("//a[text()='login / Signup']")).click();
		
		WebElement ele = driver.findElement(By.xpath("//a[texaant()='login / Signup']"));
				JavascriptExecutor js= (JavascriptExecutor) driver;
				js.executeScript("arguments[0].click()", ele);
				

	}

}
