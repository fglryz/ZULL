
Feature:As a user, I should be able to add link, insert video, mention, quote, add tag in Appreciation

  Background:
    Given user is on the homepage
    Given user clicks the More drop down
    Given  user click the Appreciation

     @A1101
     Scenario: User should be able to add mentions about only department employees
     When user clicks the mention sign button
     When user add member "hr99@cybertekschool.com" from department employees
     And user click the send button
     Then user sees the mail of chosen employees "hr99@cybertekschool.com"

   @1102
   Scenario: User should be able to attach a link to the specified text.
    When user clicks the link sign button
    When user texts to textBox "How to use Jira", uploads "https://www.youtube.com/watch?v=GWxMTvRGIpc " link
    When user click the "save" button
    When user click the send button
    Then user sees the link "How to use Jira" on the message box

  @1103
   Scenario: User should be able to insert YouTube and Vimeo videos.
    When user clicks the video button
    When User upload the URL of videos "https://vimeo.com/76979871" and saves
    When user click the send button
    Then user sees the "attached video" on the box

     @1104
   Scenario Outline:User should be able to add quotes.
    When user clicks a Quote Text Button
    When User enter a "<Quote>" in a yellow quote ribbon
    When user click the send button
    Then user sees the quote  on the Active Stream

    Examples:The quotes are as following
    |Quote                                    |
    | An apple a day keeps the doctor away.   |
    |Don't judge a book by its cover.         |



   @1105
   Scenario Outline: User should be able to add tags to messages.
  When user clicks the tag button
  When user texts "<Tag>" on the text input box and clicks add
  When user click the send button
  Then user sees tags  on the Active Stream

   Examples:
     |Tag|
     | In his short story.       |
     | Write properly.          |



   @1106
  Scenario: User should be able to remove tags before sending the message
    When user clicks the tag button
    When user texts "Tag" on the text input box and clicks add
    When user clicks the delete sign
    Then user removes tag

  @wip @1107
  Scenario:User should be able to upload pictures.
   When user clicks upload button
   And user drag and drop  a picture
   Then user sees the picture on the Active Stream
















