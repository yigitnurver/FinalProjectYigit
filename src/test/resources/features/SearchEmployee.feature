Feature: Search Employees

    Background:
    #Given user is able to access HRMS application
      When admin user enter username and password
      And admin user cliks on login button
      Then admin user navigated to the dashboard page
      When admin user cliks on PIM option button
      And admin user cliks employee list option



  Scenario: Search Employee By Their fullname
    When admin user enter employee name
    And admin user click on search button
    Then admin user able to see searched employee name on screen

  Scenario: Search Employe By Employe ID
    When admin user enters employee ID
    And admin user clicks on search button
    Then user is able to  see searched employee on screen
