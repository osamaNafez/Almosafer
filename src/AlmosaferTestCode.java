import javax.swing.text.html.HTML;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AlmosaferTestCode extends Parameters {

	
	@BeforeTest
	public void BegoreTest(){
		driver.get(URl);
	}
	
	@Test
	public void checkTheWebsiteDefaultLanguage() {
		
		if (driver.getCurrentUrl().equals(EnglishwebSite)) {

			WebElement HTMLPAGE = driver.findElement(By.tagName("html"));
			String Actual = HTMLPAGE.getAttribute("lang");
			String Expected = "en";
			myAssertion.assertEquals(Actual, Expected);

		}

		else if (driver.getCurrentUrl().equals(ArabicWebsite)) {
			WebElement HTMLPAGE = driver.findElement(By.tagName("html"));
			String Actual = HTMLPAGE.getAttribute("lang");
			String Expected = "ar";
			myAssertion.assertEquals(Actual, Expected);

		} else {

			myAssertion.assertEquals(
					driver.getCurrentUrl().equals(ArabicWebsite) || driver.getCurrentUrl().equals(EnglishwebSite),
					true, "this is to test the website url ");

		}
	}
	
	@Test
	public void checkTheWebsiteDefaultCurrency(){
		WebElement actualCurrency = driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[1]/div[2]/div/div[1]/div/button"));
		String expectedCurrency = "SAR";
		myAssertion.assertEquals(actualCurrency.getText(), expectedCurrency);
	}
	
	@Test
	public void checkWhatsApplNumber() {
		WebElement actuaWhatsApplNumber = driver.findElement(By.xpath("//*[@id=\"__next\"]/footer/div[2]/div/div/div/div/div[2]/div[3]/div/h4/a"));
		String expectedWhatsApplNumber = "+966 55 440 0000";
		myAssertion.assertEquals(actuaWhatsApplNumber.getText(), expectedWhatsApplNumber);
	}
	
	@Test
	public void check24ContactNumber() {
		WebElement actual24Number = driver.findElement(By.xpath("//*[@id=\"__next\"]/footer/div[2]/div/div/div/div/div[2]/div[1]/div/h4"));
		String expected24Number = "920000997";
		myAssertion.assertEquals(actual24Number.getText(), expected24Number);
	}
	
	@Test
	public void checkIfHotalTabDefault() {
		WebElement defualtTab = driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tab-flights\"]"));
		String expectedTab = "Flights";	
		myAssertion.assertEquals(defualtTab.getText(), expectedTab);
	}
	
	@Test
	public void checkFlightDeparture() {
		
	}
	
	@Test
	public void checkFlightReturn() {
		
	}
	
	

	
	
	
	@AfterTest
	public void AfterTest() {
		myAssertion.assertAll();
	}
	
}
