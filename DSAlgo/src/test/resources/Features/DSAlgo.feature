Feature: feature to test navigation for Queue
 Background:
           Given The user is on Home page after logged in
   
 Scenario: Navigate to queue page after login/home page
           When The user clicks the Getting Started button in Queue page
           Then The user should be directed to Queue page
           And Close browser
  

 Scenario: Navigation to Implimentaion of Queue in Python page
   				 When user is on Queue page
 				   And user clicks on Implementation of Queue in Python link
  			   Then user should navigate to Implimentaion of Queue in Python page
  			    And Close browser
   
 Scenario: Navigation to Editor page from Queue in Python page
   				 When user is on Implimentaion of Queue in Python page
  				 And user clicks on button Try here 
					 Then user is navigated to a page having TryEditor with a Run button
					  And Close browser
					 
 Scenario: Navigation to Implementation using collections.deque page
   				 When user is on Queue page
 				   And user clicks on Implementation using collections.deque link
  			   Then user should navigate to Implementation using collections.deque page
  			    And Close browser
   
 Scenario: Navigation to Editor page from Implementation using collections.deque page
   				 When user is on Implementation using collections.deque page
  				 And user clicks on button Try here on collections.deque page
					 Then user is navigated to a page having TryEditor with a Run button
					  And Close browser
					 
					 
 Scenario: Navigation to Implementation using array page
   				 When user is on Queue page
 				   And user clicks on Implementation using array link
  			   Then user should navigate to Implementation using array page
  			    And Close browser
   
 Scenario: Navigation to Editor page from Implementation using array page
   				 When user is on Implementation using array page
  				 And user clicks on button Try here on Implementation using array page
					 Then user is navigated to a page having TryEditor with a Run button
					  And Close browser				 
					 
 Scenario: Navigation to Queue Operations page
   				 When user is on Queue page
 				   And user clicks on Queue Operations link
  			   Then user should navigate to Queue Operations page
  			    And Close browser
   
 Scenario: Navigation to Editor page from Queue Operations page
   				 When user is on Queue Operations page
  				 And user clicks on button Try here on Queue Operations page
					 Then user is navigated to a page having TryEditor with a Run button
					  And Close browser
					 
 Scenario: Navigation to Practice Questions page
   				 When user is on Queue Operations page
 				   And user clicks on Practice Questions link
  			   Then user should navigate to Practice Questions page 
  			   And Close browser
   
   