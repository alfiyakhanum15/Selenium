package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommands {
	public static void main(String[] args) {
		// Create a new instance of the FireFox driver
		WebDriver driver = new ChromeDriver();

		// Open ToolsQA web site
		String appUrl = "https://demoqa.com/";
		driver.get(appUrl);

		
		// Click on Registration link
//		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[1]")).click();

		// Go back to Home Page
		driver.navigate().back();

		// Go forward to Registration page
		driver.navigate().forward();

		// Go back to Home page
		driver.navigate().to(appUrl);

		// Refresh browser
		driver.navigate().refresh();

		// Close browser
		driver.close();
		driver.quit();
	}
}