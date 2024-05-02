@Loginfeature
Feature: Login Functionality Testing

  Background: 
    Given : User must be in the Loginpage

 
  @TC_LP_01
  Scenario Outline: Negative Scenario testing with invalid data
    When : The user clicks on login button by entering invalid values in "<username>" and "<password>" textboxes
    Then : The user must be displayed with the warning message or error message "<message>"
    Examples: 
      | username    | password |message                       |
      |Techtesters  |          |Please fill in this field.   |
      |          		| ipps@151 |Please fill in this field.   |
      | Invalid     | Invalid  |Invalid Username and Password |
      |Techtesters  | Invalid  |Invalid Username and Password |
      |Invalid      | ipps@151 |Invalid Username and Password |

  @TC_LP_02
  Scenario Outline: Positive Scenario testing with valid inputs
    When : The user clicks on login button by entering valid values in "<username>" and "<password>" textboxes
    Then : User must be redirected to the DS-Algo Home page with username and successful login "<message>"
    Examples: 
       |username    | password |message          |
       |manasa | Sahasra@123 |You are logged in|