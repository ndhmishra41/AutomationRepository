package stepdefinitions;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.pages.BlazedemohomePage;
import com.pages.ConfirmationPage;
import com.pages.FlightselectionPage;
import com.pages.PassengerDetailsPage;
import com.util.TestBase;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class FlightbookingPageSteps extends TestBase {
	
	//public static WebDriver driver;
	
	BlazedemohomePage demo;
	
	PassengerDetailsPage passengerdetails;
	
	FlightselectionPage flightselection;
	
	ConfirmationPage confirmation;
	
	@Given("^user launch Blazedemo site$")
	public void user_launch_Blazedemo_site() throws Throwable {
	   TestBase.initialization();
	}

	@Then("^user enters departure \"([^\"]*)\" and destination city\"([^\"]*)\"$")
	public void user_enters_departure_and_destination_city(String arg1, String arg2) throws Throwable {
	    demo = new BlazedemohomePage();
		String fromCity =demo.selectDepartureCity(arg1);
		String toCity= demo.selectDestinationCity(arg2);
	}

	@Then("^user clicks on Find Flight$")
	public void user_clicks_on_Find_Flight() throws Throwable {
		
		flightselection=demo.findFlights();
	   
	}
	@Then("^user clicks Choose This Flight$")
	public void user_clicks_on_Choose_this_Flight() throws Throwable {
		
	
		passengerdetails = flightselection.chooseFlight_button_click();
	   
	}

	@Then("^user enters details$")
	public void user_enters_details(DataTable passengerData) throws Throwable {
		
	for ( Map <String, String> data: passengerData.asMaps(String.class, String.class))
	{
		passengerdetails.Inputname(data.get("Name"));
		passengerdetails.address_info(data.get("Address"));
		passengerdetails.city_selection(data.get("City"));
		passengerdetails.state_selection(data.get("State"));
		passengerdetails.zipCode_selection(data.get("ZipCode"));
		passengerdetails.cardType_selection(data.get("CardType"));
		passengerdetails.cardno_selection(data.get("CardNo"));
		passengerdetails.Month_selection(data.get("Month"));
		passengerdetails.Year_selection(data.get("Year"));
		passengerdetails.Name_on_card_selection(data.get("NameOnCard"));
		
	}
	   
	}

	@Then("^user clicks on purchase flight$")
	public void user_clicks_on_purchase_flight() throws Throwable {
		
		confirmation =passengerdetails.Purchaseflight();
	   
	}

	@Then("^validate confirmation id on Confirmation Page$")
	public void validate_confirmation_id_on_Confirmation_Page() throws Throwable {
		
		
		String confid =confirmation.verify_confirmation_id();
		
		if(confid!= null)
		{
			Assert.assertTrue(true);
		}
		
		else
		{
			Assert.assertFalse(false);
		}
		
		
	    }
	

@Then("^user clicks Choose This Flight for \"([^\"]*)\"$")
public void user_clicks_Choose_This_Flight_for(String arg3) throws Throwable {

	passengerdetails =	flightselection.flight_no_selection(arg3);


}
}
