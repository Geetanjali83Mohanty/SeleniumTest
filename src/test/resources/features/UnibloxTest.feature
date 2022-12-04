Feature: Validate Enrol Insurance Product feature

  Scenario: User can enroll for Insurance Product for Short Term Disability
    Given user in Insure Welcome Page
    When user Clicks "Get Started" button
    Then user landed to "Applicant Type" page
    When user Selects "Employee" radio button
    And user Clicks "Next" button
    Then user landed to "Product" page
    When user Selects "Short Term Disability" check box
    And user Clicks "Next" button
    Then user landed to "Name" page
    When user enter "First Name" in input box
    When user enter "Last Name" in input box
    And user Clicks "Next" button
    Then user landed to "Email" page
    When user enter "Email" in input box
    And user Clicks "Next" button
    Then user landed to "Salary" page
    When user enter "Salary" in input box
    And user Clicks "Next" button
    Then user landed to "Date of Birth" page
    When user enter "Date of Birth" in input box
    And user Clicks "Next" button
    Then user landed to "Gender" page
    When user Selects "Male" radio button
    Then user landed to "Phone" page
    When user enter "Phone Number" in input box
    And user Clicks "Next" button
    Then user landed to "Address" page
    When user enter "Address" in input box
    When user enter "Apt" in input box
    When user Selects "Agreement1" check box
    When user Selects "Agreement2" check box
    And user Clicks "Next" button
    Then user landed to "State of Birth" page
    When user Selects from drop down "stateOfBirth" value "Alabama"
    And user Clicks "Next" button
    Then user landed to "License" page
    When user Selects "No" radio button
    And user Clicks "Next" button
    Then user landed to "Height & Weight" page
    When user Selects from drop down "height" value "4'10"
    When user enter "Weight" in input box
    And user Clicks "Next" button
    Then user landed to "In the past 10 years" page
    When user Selects "None of the above" check box
    And user Clicks "Next" button