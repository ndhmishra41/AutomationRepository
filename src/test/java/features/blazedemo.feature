Feature: Blazedemo application

  Scenario Outline: Validate Blazedemo flight booking
  
    Given user launch Blazedemo site
     Then user enters departure "<departurecity>" and destination city"<destinationcity>"
     Then user clicks on Find Flight
     Then user clicks the first Choose This Flight
     Then user enters details
      | Name | Address    | City      | State | ZipCode | CardType | CardNo       | Month | Year | NameOnCard | 
      | Test | 123 street | Manhattan | NY    | 10001   | visa     | 400000000002 | 11    | 2022 | Test       | 
  
     Then user clicks on purchase flight
     Then validate confirmation id on Confirmation Page
    Examples: 
      | departurecity | destinationcity | 
      | Philadelphia  | Rome            | 
  
  Scenario Outline: Validate Blazedemo flight booking for specific flight no
  
    Given user launch Blazedemo site
     Then user enters departure "<departurecity>" and destination city"<destinationcity>"
     Then user clicks on Find Flight
     Then user clicks Choose This Flight for "<FlightNumber>"
     Then user enters details
      | Name | Address    | City      | State | ZipCode | CardType | CardNo       | Month | Year | NameOnCard | 
      | Test | 123 street | Manhattan | NY    | 10001   | visa     | 400000000002 | 11    | 2022 | Test       | 
  
     Then user clicks on purchase flight
     Then validate confirmation id on Confirmation Page
    Examples: 
      | departurecity | destinationcity | FlightNumber | 
      | Philadelphia  | Rome            | 234          | 
