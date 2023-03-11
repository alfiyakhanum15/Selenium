package com.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxOperations {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/checkbox");
		driver.manage().window().maximize();
		Thread.sleep(10000);


		/**
		 * Validate isSelected and click
		 */

		WebElement checkBoxSelected = driver.findElement(By.cssSelector("#tree-node > ol > li > span > label > span.rct-checkbox > svg"));
		boolean isSelected = checkBoxSelected.isSelected();
		System.out.println(isSelected);

		// performing click operation if element is not selected 
		if(isSelected == false) {
			checkBoxSelected.click();
		}

		/**
		 * Validate isDisplayed and click
		 */
		WebElement checkBoxDisplayed = driver.findElement(By.cssSelector("#tree-node > ol > li > span > label > span.rct-checkbox > svg"));
		boolean isDisplayed = checkBoxDisplayed.isDisplayed();
		System.out.println(isSelected);

		// performing click operation if element is displayed
		if (isDisplayed == true) {
			checkBoxDisplayed.click();
		}

		/**
		 * Validate isEnabled and click
		 */
		WebElement checkBoxEnabled = driver.findElement(By.cssSelector("#tree-node > ol > li > span > label > span.rct-checkbox > svg"));
		boolean isEnabled = checkBoxEnabled.isEnabled();
		System.out.println(isSelected);

		// performing click operation if element is enabled
		if (isEnabled == true) {
			checkBoxEnabled.click();
		}
		driver.quit();

	}

}