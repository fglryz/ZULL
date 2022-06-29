@wip
Feature:User should be able to attach a link to the specified text.
  User should be able to attach a link to the specified text.

    Background: Assuming user is on  homepage
    Given user is on the Appreciation tab

   Scenario: User should be able to attach a link to the specified text.
    When user clicks the link sign buttonWhen user texts "textbox", "uploads link" and saves
    When user clicks the send button.
    Then user sees his/her link on the “Active Stream"


       Scenario Outline:
         When user clicks the link sign button
         When user texts "<textbox>", "<uploads link>" and saves
         When user clicks the send button.
         Then user sees his/her link on the “Active Stream"
         Examples:

     |  textbox                                     |uploads link |
     |How to use Jira                            |  https://www.youtube.com/watch?v=GWxMTvRGIpc     |
     | How to download and install sql server    | https://www.youtube.com/watch?v=QsXWszvjMBM                                                |