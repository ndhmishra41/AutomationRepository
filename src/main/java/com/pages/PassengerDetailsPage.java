package com.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.util.TestBase;


public class PassengerDetailsPage extends TestBase {
	
	  WebDriverWait wait; 
		
	
	@FindBy(id= "inputName")
	private WebElement name;
	
	@FindBy(id= "address")
	private WebElement address;
	
	
	@FindBy(id= "city")
	private WebElement city;
	
	@FindBy(id= "state")
	private WebElement state;
	
	@FindBy(id= "zipCode")
	private WebElement zipCode;
	
	@FindBy(xpath= "//select[@id='cardType']")
	private WebElement cardType;
	
	@FindBy(id= "creditCardNumber")
	private WebElement creditCardNumber;
	
	@FindBy(id= "creditCardMonth")
	private WebElement month;
	

	@FindBy(id= "creditCardYear")
	private WebElement creditCardYear;
	
	@FindBy(id= "nameOnCard")
	private WebElement nameOnCard;
	
	//@FindBy(className= "btn btn-primary")
	//WebElement purchaseFlight;
	

	@FindBy(xpath= "//input[@value='Purchase Flight']")
	WebElement purchaseFlight;
	
	
	
	
	//Initializing the Page Objects:
	
	public PassengerDetailsPage()
	{
		PageFactory.initElements(driver, this);
		
		wait = new WebDriverWait(driver,30);
		
	}
	
	public void Inputname(String firstName) throws Exception
	{
	Thread.sleep(3000);
	
	name.sendKeys(firstName);
	}
	public void address_info(String addData) throws Exception
	{
	
	
	address.sendKeys(addData);
	}
	public void city_selection(String cityData) throws Exception
	{
	
		city.sendKeys(cityData);
	}
	
	public void state_selection(String stateData) throws Exception
	{
	
		state.sendKeys(stateData);
	}

	public void zipCode_selection(String ZipData) throws Exception
	{
	
		zipCode.sendKeys(ZipData);
	}
	

	public void cardType_selection(String cardtypeData) 
	{
		Select select = new Select(wait.until(ExpectedConditions.visibilityOf (cardType)));

		select.selectByValue(cardtypeData);
	
	}
	
	public void cardno_selection(String cardNoData) throws Exception
	{
	
		creditCardNumber.sendKeys(cardNoData);
	}
	
	public void Month_selection(String monthData) throws Exception
	{
	
		month.sendKeys(monthData);
	}
	
	public void Year_selection(String yearData) throws Exception
	{
	
		creditCardYear.sendKeys(yearData);
	}
	

	public void Name_on_card_selection(String nameData) throws Exception
	{
	
		nameOnCard.sendKeys(nameData);
	}
	public ConfirmationPage Purchaseflight(){
		
		purchaseFlight.click();
		
		return new ConfirmationPage();
		
	}

	
	

}

