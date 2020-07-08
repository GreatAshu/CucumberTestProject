Feature: login to facebook application

  Background: Common step
    Given Open chrome and start application
  
  Scenario Outline: Test logon with valid credentials 
  
     When I enter valid "<username>" and valid "<password>"
     Then user should not get error message
  
    Examples: 
      | username        | password | 
      | ashu@gmail.com  | ashu     | 
      | ashu1@gmail.com | ashu1    | 
      | ashu2@gmail.com | ashu2    | 
      | ashu3@gmail.com | ashu3    | 
  
  Scenario Outline: Test logon with Invalid credentials
  
     When I do enter valid usrname and valid password
     Then user should get error message
  
    Examples: 
      | username        | password | 
      | ashu@gmail.com  | ashu     | 
      | ashu1@gmail.com | ashu1    | 
      | ashu2@gmail.com | ashu2    | 
      | ashu3@gmail.com | ashu3    | 
  
