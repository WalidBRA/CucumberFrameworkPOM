Feature: Login to automation exercise Application

  Background:
    Given User is on automation exercise login page "https://www.automationexercise.com/login"

  @ValidCredentials
  Scenario: Login with valid credentials

    When User enters username as "walidbra@outlook.com" and password as "123456789"
    Then User should be able to login successfully and new page open