Feature: regestration

@Test
  Scenario: Register new user with exsisting email
    When i am on homepage
    And i click on sign in link
    When i enter "test@test.com" to create new account
    And i click Create an account
    Then i should see "Check mini error box contain An account using this email address has already been registered. Please enter a valid password or request a new one"