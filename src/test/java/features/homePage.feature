Feature: USDA home page
@testUSDA
Scenario: Click on animal button
Given User navigate to home page
When User click on topics button,topics dropdown should display
Then User click on animals button
