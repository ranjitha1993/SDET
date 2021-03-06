@CRM_Activity_2
Feature: To Create Leads
 
  Scenario Outline: Creating Leads using parameterization
    Given The user is at login page
    And Admin User enters"<Username>"and"<Password>"
    When User navigates to Sales Page
    And Select the Leads option
    And Clicks on Create Lead option
    And User enters the values"<FirstName>"and"<LastName>"and"<EmailID>"
    And Saves the Lead 
    Then Navigates to the View Leads Page to see results
    And Closes the browser

Examples:
    | Username | Password |FirstName|LastName|EmailID       |
    | admin    | pa$$w0rd |Deary   |Russo   |Daery@abc.com|