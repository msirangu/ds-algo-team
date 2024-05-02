Feature: Data Structures functionality page

  Background: 
    Given : The user is on DS Algo Homepage
    When : The user clicks on Signin button
    And : The user enters "manasa" as username and "Sahasra@123" as password and clicks on login button
    Then :The user should get message as "You are logged in" in homepage

  @TC_DS_01
  Scenario: Data Structures
    When : The user clicks on Get Started button of Data structures
    Then : The user should be navigated to "Data Structures-Introduction" page

  @TC_DS_02
  Scenario: Time complexity
    Given : The user is on Data Structure Introduction page
    When : The user clicks on Time Complexity
    Then : The user should be redirected to "Time complexity" of Data structures-Introduction
    When : The user clicks on "Try here" button.
    Then : The user should be redirected to a page having an tryEditor with a Run button to test
    And : The user enter the python code and click Run
