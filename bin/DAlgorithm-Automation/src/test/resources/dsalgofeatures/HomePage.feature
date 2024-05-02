@Getstartedpagetest
Feature: GetStartedPage testing

  Background: User enters DS_Algo portal
    Given : The user should be able to open the browser
    When : The user enters the DS_Algo Portal  <URL>

  @TC_GS_01
  Scenario: User enters DS Algo Portal
    Then : The user should be landed on the DS_Algo Get Started page with message "You are at the right place"
    When : The user clicks the Get started button
    Then : The user should land in Data Structure Introduction Page with "Register" and "Sign in" links
    When : The user clicks the data structure"dropdown  arrow"
    Then : The user should able to see 6 options Arrays in drop down section
      | Arrays      |
      | Linked List |
      | Stack       |
      | Queue       |
      | Tree        |
      | Graph       |

  @TC_GS_02
  Scenario: User clicks Register button
    When : The user selects any data structures item from the drop down without Sign in.
    Then : The user should able to see an warning message "You are not logged in"
    When : The user clicks any Get Started buttons of data structures  on the DS Introduction page
    Then : The user should able to see the warning message "You are not logged in"
    When : The user clicks Register link on the DS Introduction page
    Then : The user should be redirected to Register form
    And : The user should able see message "Login" at the bottom of the page
