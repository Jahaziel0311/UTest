
# Autor: Jahaziel De Salas

@stories
Feature: UTest
  A user needs to create their credentials to enter uTest

  @scenario
  Scenario: Create credentials
    Given than Jahaziel needs to enter uTest
      | strFirstName | strLastName | strEmail                   | strMonth  | strDay  | strYear | strLanguage | strZip  | strPassword |
      | Jahaziel    | De Salas     |jahazieldesalas5@hotmail.com|November   |3        |1988     |Spanish      |07079    |YUidni8415*  |
    When he enter your data to be able to register on the uTest platform
    Then he see the welcome page on the uTest platform and see the message
      |strWelcomeMessage                                                      |
      |Welcome to the world's largest community of freelance software testers!|
