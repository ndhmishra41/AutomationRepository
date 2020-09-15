package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.util.TestBase;


public class FlightselectionPage extends TestBase {
	
	@FindBy(xpath= "//table[@class='table']/tbody/tr/td[1]/input[@type='submit']")
  private WebElement chooseFlight;
	
	@FindBy(xpath= "//table[@class='table']/tbody/tr/td[1]")
	 private List<WebElement> chooseFlightlist;
	
	@FindBy(xpath= "//table[@class='table']/tbody/tr/td[2]")
	private List<WebElement> flightNolist;

	
	//Initializing the Page Objects:
	
	public FlightselectionPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public PassengerDetailsPage chooseFlight_button_click() throws Exception
	{
	Thread.sleep(3000);
	chooseFlight.click();
	
	return new PassengerDetailsPage();
	
	}
	
	public PassengerDetailsPage flight_no_selection(String flightNumber) throws Exception
	
	{
		ArrayList<WebElement> arrayflightno = new ArrayList<WebElement>();
		
	
		
		int x = 0 ;
		for(WebElement flightnoelements : flightNolist)
		{
			arrayflightno.add(flightnoelements);
			
			if(flightnoelements.getText().equals(flightNumber))
			 {
				x =arrayflightno.indexOf(flightnoelements);
		       
					}
		}
		
		ArrayList<WebElement> arraychooseflight = new ArrayList<WebElement>();
		for(WebElement chooseflightelements :chooseFlightlist)
		{
			arraychooseflight.add(chooseflightelements);
		}
		arraychooseflight.get(x).click();
		
		Thread.sleep(20000);
		
		return new PassengerDetailsPage();
		
	}
	
	
}
	

	
	



