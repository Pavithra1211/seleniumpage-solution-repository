Feature: Validating Selenium page

@Validate_the_external_links 
Scenario Outline: Verify that the external links in External links section work 
	Given User opened the application
	When The page "<Selenium>" is opened 
	Then All the external links should work
	And Browser should be closed
	
	Examples:
	|Selenium|
	|Selenium - Wikipedia|
	
@Validate_Oxygen_Link_Periodic_Table 
Scenario Outline: Validate the oxygen link
	Given User opened the application
	When User clicks on oxygen link
	Then "<Oxygen>" page should be opened
	And Browser should be closed
	
	Examples:
	|Oxygen|
	|Oxygen - Wikipedia|
	
@Verify_whether_page_is_featured_article
Scenario Outline: Validate whether page is featured article
	Given User opened the application
	When The page "<Selenium>" is opened
	Then Featured article icon should not be present
	And Browser should be closed
	
	Examples:
	|Selenium|
	|Selenium - Wikipedia|

@Take_screenshot_of_righthand_box_elements 
Scenario Outline: Take a screenshot of right hand element 
	Given User opened the application
	When The page "<Selenium>" is opened
	Then Screenshot should be taken
	And Browser should be closed
		
	Examples:
	|Selenium|
	|Selenium - Wikipedia|
	
@Count_the_pdf_links 
Scenario Outline: Validate the number pdf links 
	Given User opened the application
	When The page "<Selenium>" is opened
	Then Count the number pdf links
	And Browser should be closed
	
	Examples:
	|Selenium|
	|Selenium - Wikipedia|
	
@Search_pluto_and_select_second_suggestion 
Scenario: Validate whether user is able to search for pluto and select second suggestion
	Given User opened the application 
	When User enters pluto in search box
	Then Second suggestion should be selected
	And Browser should be closed