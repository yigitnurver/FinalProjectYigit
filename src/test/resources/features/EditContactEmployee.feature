Feature: Accesing information

  Scenario:Edit contact information
    When user should create Login details and enter username , password
    And user clicks on login button
    Then user navigated to dashboard
    When user cliks on PIM option
    And user cliks on employee list option
    When user enters employee name
    And user clicks on search button
    Then user able to see searched employee on screen
    And user cliks on own name from searched page
    Then user navigated to personal details page
    When user cliks on contact details
    Then user able to see contact details dashboard
    And user able to see all textboxes are displayed



