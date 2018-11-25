package MainPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Utilities.Functionalities;


public class DomainOfCompany extends Functionalities  {
	WebDriver driver;
	@BeforeTest
	@Parameters("browser")
	public void setUp(String browserName){
		if (browserName.equalsIgnoreCase("ch")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\eclipse-workspace\\WeightWathers\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.weightwatchers.com");
		}
		else if (browserName.equalsIgnoreCase("ff")){
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Owner\\eclipse-workspace\\WeightWathers\\drivers\\geckodriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.weightwatchers.com");
			driver.manage().window().maximize();  	
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
			}
		@AfterTest
		public void tearDown() {
			driver.quit();
		}
	}


