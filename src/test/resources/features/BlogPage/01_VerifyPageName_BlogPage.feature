#Author: Raghwen@QATechTesting.com
Feature: Home Page Verifications

  @blog_page
  Scenario: Check page display
    Given User navigates to QATechTesting HomePage
    Then User verify that Blog Link is displayed
    And User verify that Blog page title is displayed