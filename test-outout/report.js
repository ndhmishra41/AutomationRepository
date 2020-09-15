$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/nidmishr/Documents/blaze/BlazedemoProject/src/test/java/features/blazedemo.feature");
formatter.feature({
  "line": 1,
  "name": "Blazedemo application",
  "description": "",
  "id": "blazedemo-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 3,
      "value": "# Scenario Outline: Validate Blazedemo flight booking"
    },
    {
      "line": 5,
      "value": "#    Given user launch Blazedemo site"
    },
    {
      "line": 6,
      "value": "#     Then user enters departure \"\u003cdeparturecity\u003e\" and destination city\"\u003cdestinationcity\u003e\""
    },
    {
      "line": 7,
      "value": "#     Then user clicks on Find Flight"
    },
    {
      "line": 8,
      "value": "#     Then user clicks the first Choose This Flight"
    },
    {
      "line": 9,
      "value": "#     Then user enters details"
    },
    {
      "line": 10,
      "value": "#      | Name | Address    | City      | State | ZipCode | CardType | CardNo       | Month | Year | NameOnCard |"
    },
    {
      "line": 11,
      "value": "#      | Test | 123 street | Manhattan | NY    | 10001    | visa    | 400000000002 | 11    | 2022 | Test       |"
    },
    {
      "line": 12,
      "value": "#"
    },
    {
      "line": 13,
      "value": "#   Then user clicks on purchase flight"
    },
    {
      "line": 14,
      "value": "#   Then validate confirmation id on Confirmation Page"
    },
    {
      "line": 15,
      "value": "#    Examples:"
    },
    {
      "line": 16,
      "value": "#      | departurecity | destinationcity |"
    },
    {
      "line": 17,
      "value": "#      | Philadelphia  | Rome            |"
    }
  ],
  "line": 20,
  "name": "Validate Blazedemo flight booking",
  "description": "",
  "id": "blazedemo-application;validate-blazedemo-flight-booking",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 22,
  "name": "user launch Blazedemo site",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "user enters departure \"\u003cdeparturecity\u003e\" and destination city\"\u003cdestinationcity\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "user clicks on Find Flight",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "user clicks Choose This Flight for \"\u003cFlightNumber\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "user enters details",
  "rows": [
    {
      "cells": [
        "Name",
        "Address",
        "City",
        "State",
        "ZipCode",
        "CardType",
        "CardNo",
        "Month",
        "Year",
        "NameOnCard"
      ],
      "line": 27
    },
    {
      "cells": [
        "Test",
        "123 street",
        "Manhattan",
        "NY",
        "10001",
        "visa",
        "400000000002",
        "11",
        "2022",
        "Test"
      ],
      "line": 28
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "user clicks on purchase flight",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "validate confirmation id on Confirmation Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 32,
  "name": "",
  "description": "",
  "id": "blazedemo-application;validate-blazedemo-flight-booking;",
  "rows": [
    {
      "cells": [
        "departurecity",
        "destinationcity",
        "FlightNumber"
      ],
      "line": 33,
      "id": "blazedemo-application;validate-blazedemo-flight-booking;;1"
    },
    {
      "cells": [
        "Philadelphia",
        "Rome",
        "234"
      ],
      "line": 34,
      "id": "blazedemo-application;validate-blazedemo-flight-booking;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 34,
  "name": "Validate Blazedemo flight booking",
  "description": "",
  "id": "blazedemo-application;validate-blazedemo-flight-booking;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 22,
  "name": "user launch Blazedemo site",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "user enters departure \"Philadelphia\" and destination city\"Rome\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "user clicks on Find Flight",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "user clicks Choose This Flight for \"234\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "user enters details",
  "rows": [
    {
      "cells": [
        "Name",
        "Address",
        "City",
        "State",
        "ZipCode",
        "CardType",
        "CardNo",
        "Month",
        "Year",
        "NameOnCard"
      ],
      "line": 27
    },
    {
      "cells": [
        "Test",
        "123 street",
        "Manhattan",
        "NY",
        "10001",
        "visa",
        "400000000002",
        "11",
        "2022",
        "Test"
      ],
      "line": 28
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "user clicks on purchase flight",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "validate confirmation id on Confirmation Page",
  "keyword": "Then "
});
formatter.match({
  "location": "FlightbookingPageSteps.user_launch_Blazedemo_site()"
});
formatter.result({
  "duration": 7710306303,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Philadelphia",
      "offset": 23
    },
    {
      "val": "Rome",
      "offset": 58
    }
  ],
  "location": "FlightbookingPageSteps.user_enters_departure_and_destination_city(String,String)"
});
formatter.result({
  "duration": 90413189332,
  "status": "passed"
});
formatter.match({
  "location": "FlightbookingPageSteps.user_clicks_on_Find_Flight()"
});
formatter.result({
  "duration": 605278052,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "234",
      "offset": 36
    }
  ],
  "location": "FlightbookingPageSteps.user_clicks_Choose_This_Flight_for(String)"
});
formatter.result({
  "duration": 20925373042,
  "status": "passed"
});
formatter.match({
  "location": "FlightbookingPageSteps.user_enters_details(DataTable)"
});
formatter.result({
  "duration": 33992363027,
  "status": "passed"
});
formatter.match({
  "location": "FlightbookingPageSteps.user_clicks_on_purchase_flight()"
});
formatter.result({
  "duration": 622633548,
  "status": "passed"
});
formatter.match({
  "location": "FlightbookingPageSteps.validate_confirmation_id_on_Confirmation_Page()"
});
formatter.result({
  "duration": 63205049,
  "status": "passed"
});
});