# ********RoostGPT********

# Test generated by RoostGPT for test advancedReportTest using AI Type  and AI Model 
# 
# ROOST_METHOD_HASH=0a60f0444c
# ROOST_METHOD_SIG_HASH=736ee1b30e
# 
#  ########## Scenario ########## 
# 
# {
#   feature: 'Feature: Test API from Alphavantage.co',
#   background: null,
#   rule: null,
#   scenario: {
#     title: 'Scenario: Get Basic Financials',
#     steps: 'Given the Finnhub API base URL is "https://finnhub.io/api/v1"\n' +
#       'When I send a GET request to "/stock/metric?symbol=AAPL&metric=all"\n' +
#       'Then the response status code should be 200\n' +
#       'And the response should contain financial metrics',
#     examples: ''
#   }
# }
# 

# ********RoostGPT********
Feature: Test API from Alphavantage.co

  Background:
    * def urlBase = karate.properties['url.base'] || karate.get('urlBase', 'http://localhost:4010')
    * url urlBase

  Scenario Outline: Get Time Series Daily Adjusted for a stock symbol
    Given path '/query'
    And param symbol = '<symbol>'
    And param apikey = '<apikey>'
    And param function = 'TIME_SERIES_DAILY_ADJUSTED'
    When method GET
    Then status 200
    And match response != null
    And match response contains { 'Meta Data': '#object', 'Time Series (Daily)': '#object' }

    Examples:
      | symbol | apikey |
      | IBM    | demo   |
      | AAPL   | demo   |

  Scenario: Get Time Series Daily Adjusted with invalid API key
    Given path '/query'
    And param symbol = 'IBM'
    And param apikey = 'invalid_key'
    And param function = 'TIME_SERIES_DAILY_ADJUSTED'
    When method GET
    Then status 401
    And match response contains { 'Error Message': '#notnull' }

  Scenario: Get Time Series Daily Adjusted with missing required parameter
    Given path '/query'
    And param apikey = 'demo'
    And param function = 'TIME_SERIES_DAILY_ADJUSTED'
    When method GET
    Then status 400
    And match response contains { 'Error Message': '#notnull' }
