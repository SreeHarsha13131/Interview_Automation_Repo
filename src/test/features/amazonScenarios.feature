Feature: Amazon Automation
  @AmazonRun
  Scenario Outline: Dynamic Search + Filters Scenarios
    Given Login in to the amazon application
    When Click on the search field and Enter "mobile phone" text and click on the search btn
    Then Select multiple "<brand>" , "<Carrier>" , "<Storage Capacity>" and "<Operating System Version>"
    Examples:
      | brand   | Carrier       | Storage Capacity | Operating System Version |
      | Samsung | AT&T Wireless | 128 GB           | Android 14               |
      | Apple   | T-Mobile      | 256 GB           | iOS 16                   |

