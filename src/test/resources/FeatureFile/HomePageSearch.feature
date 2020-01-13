Feature: SearchPage Validations
Scenario Outline:Search the product group and check the corresponding product links are displayed 
Given user navigates to the Kohls application 
When user enters the product description "<Products>" 
And clicks on search
Then User should be navigated to the search results page 

Examples:
|Products|
|shoes|
#|Electronics|
#|Toys|
#|Beauty|
#|Furniture|

#Scenario Outline:Product selection with shop by Department
#Given user navigates to the Kohls application 
#When user clicks on shop by department
#And user selects the "<Category>"
#Then user should be navigated to the "<Category>" page 
#
#Examples:
#|Category|
#|Men|
#|Women|
#|Kids|
#|Baby|
#|Toys|