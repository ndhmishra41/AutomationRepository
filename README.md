# AutomationRepository
Framework is Cucumber Based with Page Object Model. Page Object Model has Pages of the application as Java classes and all the elements of the Page and other page actions and behaviour are in Page Classes. Framework has below structure-
 
Main-
Config.properties-It has browser and url information
Base Class- It reads browser and url from Config file
Page Classes - Individual Page classes having all the elements and behaviour of specific Page

Test-
Feature File- Here, Features with Scenarios are written using Gherkin annotations
Step Definition- Here, the code is written for the scenarios in Feature file, in this we call page classes where actual code is written for individual pages, to achieve abstraction
Runner Class- From here, the execution starts, it has feaure file, step def path ,execution starts with feature file, then it goes to Step def to search for the scenarios written in feature file
