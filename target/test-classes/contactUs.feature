Feature: Contact Us
  As an end user
  i want to contact to customer service
  so i can send message to customer service
@Test
  Scenario: send message to customer service
    Given i am on homepage
    When i click on contact us button
    Then i should redirect to contact us page
    When i enters all details
    And click on send button
    Then i should see the message sent sucessfully