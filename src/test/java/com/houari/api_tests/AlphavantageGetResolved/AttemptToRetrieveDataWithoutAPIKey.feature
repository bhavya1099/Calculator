# ********RoostGPT********

# Test generated by RoostGPT for test advancedReportTest using AI Type  and AI Model 
# 
# ROOST_METHOD_HASH=6fd420fbbc
# ROOST_METHOD_SIG_HASH=dcb7881d11
# 
#  ########## Scenario ########## 
# 
# {
#   feature: 'Feature: Test API from Alphavantage.co',
#   background: null,
#   rule: null,
#   scenario: {
#     title: 'Scenario: Attempt to retrieve data without an API key',
#     steps: 'Given the Alpha Vantage API endpoint is "https://www.alphavantage.co/query"\n' +
#       'When I send a GET request with the following parameters:\n' +
#       '      | Parameter | Value             |\n' +
#       '      | function  | TIME_SERIES_DAILY |\n' +
#       '      | symbol    | AAPL              |\n' +
#       'Then the response should indicate an error for missing API key',
#     examples: ''
#   }
# }
# 

# ********RoostGPT********
Feature: Test API from Alphavantage.co

  Scenario: Attempt to retrieve data without an API key
    * def urlBase = karate.properties['url.base'] || karate.get('urlBase', 'http://localhost:4010')
    * url urlBase
    Given path '/query'
    And param function = 'TIME_SERIES_DAILY'
    And param symbol = 'AAPL'
    When method GET
    Then status 400
    And match response contains { 'Error Message': '#string' }
    And match response['Error Message'] contains 'apikey'

  Scenario: Retrieve data with a valid API key
    * def urlBase = karate.properties['url.base'] || karate.get('urlBase', 'http://localhost:4010')
    * url urlBase
    Given path '/query'
    And param function = 'TIME_SERIES_DAILY_ADJUSTED'
    And param symbol = 'IBM'
    And param apikey = 'demo'
    When method GET
    Then status 200
    And match response contains { 'Meta Data': '#object', 'Time Series (Daily)': '#object' }
    And match response['Meta Data'] contains { '1. Information': '#string', '2. Symbol': 'IBM' }
    And match response['Time Series (Daily)'] == '#object'

  Scenario Outline: Retrieve data with different symbols and functions
    * def urlBase = karate.properties['url.base'] || karate.get('urlBase', 'http://localhost:4010')
    * url urlBase
    Given path '/query'
    And param function = '<function>'
    And param symbol = '<symbol>'
    And param apikey = 'demo'
    When method GET
    Then status 200
    And match response contains { 'Meta Data': '#object' }
    And match response['Meta Data'] contains { '2. Symbol': '<symbol>' }

    Examples:
      | function                   | symbol |
      | TIME_SERIES_DAILY          | GOOGL  |
      | TIME_SERIES_DAILY_ADJUSTED | MSFT   |
      | TIME_SERIES_WEEKLY         | AMZN   |
