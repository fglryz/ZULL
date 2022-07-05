
Feature:To test link,insert video.mention,quote and tag in Assertion


  Background:
    Given user is on the homepage
    Given user clicks the More drop down
    Given  user click the Appreciation

  Scenario: User should be able to attach a link to the specified text.
    When user clicks the link sign button
    When user texts to textBox, uploads link
    When user click the save button
    When user click the send button
    Then user sees the link on the message box

  Scenario: User should be able to add mentions about only department employees.
    When user clicks the mention sign button
    When user add member from   department employees
    And user click the send button
    Then user sees the mail of chosen employees
  @wip
  Scenario:User should be able to add quotes.
    When user clicks the quotes button
    When User writes a quote  with quotation mark
    When user click the send button
    Then user sees the quote on message on the Active Stream

  Scenario: User should be able to add tags to messages.
    When user clicks the tag button
    When user texts the text on the text input box and clicks add
    Then user sees the attach tag

  Scenario: User should be able to remove tags before sending the message
    When user clicks the tag button
    When user texts the text on the text input box and clicks add
    When user clicks the delete sign

  Scenario: User should be able to insert YouTube and Vimeo videos.
    When user clicks the video button
    When User upload the URL of videos and saves
    When user click the send button
    Then user sees the attached video on the box



