package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Functionalities {
	 WebDriver driver;
	public void typeByXpath (String locators){
		driver.findElement(By.xpath(locators)).click();

	}
	//============================dealingWithTypeByClass============================//
	public void typeByClass(String locators,String zip) {
		driver.findElement(By.xpath(locators)).sendKeys(zip);
		
	}
	//==========================dealingWithClickButton==========================================//
	public void typeByClick(String locators) {
		driver.findElement(By.xpath(locators)).click();
		
	}

	//=======================pageloadAssertion==============================================//
	public void pageAssertion(String expected) {
		String pageTitle="Weight Loss Program, Recipes & Help | Weight Watchers";
		if(pageTitle.equalsIgnoreCase(pageTitle)) {
			System.out.println("The page title is expected");
		
		}
		else {System.out.println("The page title is not Expected");
		
		}
	}
	
	
	public void gettingText(String Locator){
		String elementText =driver.findElement(By.xpath(Locator)).getText();
		System.out.println(elementText);
		
	}
}
