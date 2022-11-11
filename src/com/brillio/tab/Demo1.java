package com.brillio.tab;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://db4free.net/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		// click on php link
		// then new tab will open
		
	//	List<String> windows= new ArrayList<String>(driver.getWindowHandles());
		
	//	driver.switchTo().window(windows.get(1));
		
		driver.close(); // close current tab
		
		driver.quit(); // close the browser and kill the process associated to it.

	}

}
