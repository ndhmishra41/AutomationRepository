package com.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.util.TestBase;

public class BlazedemohomePage extends TestBase {
	
	   WebDriverWait wait; 
	
	@FindBy(xpath= "//select[@name='fromPort']")
	private WebElement departureCity;
	
	@FindBy(name = "toPort")
	private WebElement destinationCity;
	
	//@FindBy(className = "btn btn-primary")
    //WebElement findFlight;
	
	@FindBy(xpath = "//input[@value='Find Flights']")
	private WebElement findFlight;

	public BlazedemohomePage()
	{
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver,30);
	
	}
	
	public String selectDepartureCity(String depCity) throws InterruptedException {
	
		
		Select select = new Select (wait.until(ExpectedConditions.visibilityOf(departureCity)));
	
	   select.selectByValue(depCity);
		System.out.println(depCity);
	
		return depCity;
		
	}
	
  public String selectDestinationCity(String destCity) throws Exception {
	
		
		Select select = new Select (wait.until(ExpectedConditions.visibilityOf(destinationCity)));
		
		select.selectByValue(destCity);
		return destCity;
		
	}
  
  public FlightselectionPage findFlights()
  {
	  findFlight.click();
	  
	  return new FlightselectionPage();
  }
}


