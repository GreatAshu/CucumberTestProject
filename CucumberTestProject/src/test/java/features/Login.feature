Feature: login to facebook application

  Scenario Outline: Test logon with valid credentials
  
    Given Open chrome and start application
     When I enter valid "<username>" and valid "<password>"
     Then user should get error message
  
    Examples: 
      | username        | password | 
      | ashu@gmail.com  | ashu     | 
      | ashu1@gmail.com | ashu1    | 
      | ashu2@gmail.com | ashu2    | 
      | ashu3@gmail.com | ashu3    | 
  
