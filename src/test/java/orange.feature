
Feature: Orange Juice

  
  Scenario: Title of your scenario
   Please automate the below scenario using page object model or page factory method in selenium 

Given Launch the below application.https://opensource-demo.orangehrmlive.com/web/index.php/auth/loginand login with give credentials 

When Navigate to My info - > Contact Details, enter contact details and press save button 

When Navigate to Emergency contacts and add details 

When Navigate to Dependents and add dependents 

When Navigate to recruitment menu and add a candidate 

Then Shortlist the candidate and schedule the interview 

Then Mark the interview passed and offer job 

Then Hire the cand print the candidate history(table) 

Then Navigate back to the Recruitment tab and search for the above candidate and verify the status 

Then Navigate to the Admin tab and create a user with ESS role for the above employee 

Then Logout from the application and login with the above created username & password 

Then Navigate to leave menu and apply personal leave, Logout from the application 

Then Login with the Admin user again and navigate to Leave menu 

Then Approve the above applied leave under leave list and logout   
 