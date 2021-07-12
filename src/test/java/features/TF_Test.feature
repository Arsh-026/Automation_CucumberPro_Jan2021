@TF_Test @Smoke
Feature: Set color background

	 

 @Scenario1
Scenario: Sky blue background color button test
	Given Set SkyBlue Background button exists 
	Given Set White Background button exists    
	When User click on the button   
	Then the background color will change to sky blue

 @Scenario2
Scenario: White background color button test
	When user click the button
	Then the background color will change to white 
