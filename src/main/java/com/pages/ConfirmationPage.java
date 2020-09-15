package com.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.util.TestBase;

public class ConfirmationPage extends TestBase {
	
	@FindBy(xpath= "//table[@class='table']/tbody/tr[1]/td[2]")
	private WebElement confirmationId;
	
	
   public ConfirmationPage()
	{
		PageFactory.initElements(driver, this);
	
	}
	

	public String verify_confirmation_id()
	
	{
		String conid=confirmationId.getText();
		return conid;
	}
  
 
}



