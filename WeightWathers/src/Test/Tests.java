package Test;

import org.testng.annotations.Test;

import Locators.Xpaths;
import MainPage.DomainOfCompany;
import Values.Input;

public class Tests extends DomainOfCompany {
	Xpaths 	locators = new Xpaths();
	Input		values = new Input();
	
	@Test
	public void weightWatchers() {
		pageAssertion(values.PageTitle); 								//verifying the home page title
		typeByXpath(locators.findAMeeting);								//Clicking on Find a Meeting 
		pageAssertion(values.schedulePageTitle);						//Verifying the meeting page title 
		typeByClass(locators.zipFild,values.zipCode);					//Typing the zip code on zip field 
		typeByClick(locators.searchButton);								//Clicking on Search button
		gettingText(locators.locationAndDistance);						//Printing out the first location title and it's distance
		

	}

}
