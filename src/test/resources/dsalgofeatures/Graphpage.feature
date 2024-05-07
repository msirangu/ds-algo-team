Feature: Graph in Homepage

  Background: 
    Given : The user is on DS Algo Homepage
    When : The user clicks on Signin button
    And : The user enters "manasa" as username and "Sahasra@123" as password and clicks on login button
    Then :The user should get message as "You are logged in" in homepage

  @TC_GR_01
  Scenario: click on Get Started
    When : The user clicks on Get Started button of Graph
    Then : The user should be navigated to the Graph page

  @TC_GR_02
  Scenario: CLick on Graph
    When : The user clicks on Graph
    Then : The user should be directed to the "Graph" of Graph Page
    And : The user clicks on "Try here" button..
    Then : user should be redirected to a page having an TryEditor with a Run button to test

  @TC_GR_03
  Scenario: click on Graph Representations
    When : The user clicks on Graph Representations
    Then : The user should be directed to the "Graph Representations" of Graph Page
    And : The user clicks on "Try here" button..
    Then : user should be redirected to a page having an TryEditor with a Run button to test
