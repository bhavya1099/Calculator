# ********RoostGPT********

# Test generated by RoostGPT for test advancedReportTest using AI Type  and AI Model 
# 
# ROOST_METHOD_HASH=6bf7bc56ab
# ROOST_METHOD_SIG_HASH=bc3085fe0d
# 
#  ########## Scenario ########## 
# 
# {
#   feature: 'Feature: Test API from Alphavantage.co',
#   background: null,
#   rule: null,
#   scenario: {
#     title: 'Scenario Outline: Verify data consistency across multiple dates',
#     steps: 'Given I have retrieved the daily time series data for AAPL stock\n' +
#       'When I check the data for "<date>"\n' +
#       'Then it should have all required fields\n' +
#       'And the values should be valid numbers',
#     examples: 'Examples:\n' +
#       '      | date       |\n' +
#       '      | 2024-07-09 |\n' +
#       '      | 2024-07-08 |\n' +
#       '      | 2024-07-05 |\n' +
#       '      | 2024-07-03 |\n' +
#       '      | 2024-07-02 |'
#   }
# }
# 

# ********RoostGPT********
Feature: Test API from Alphavantage.co

  Background:
    * def urlBase = karate.properties['url.base'] || karate.get('urlBase', 'http://localhost:4010')
    * url urlBase
    * def isValidNumber =
      """
      function(str) {
        return !isNaN(parseFloat(str)) && isFinite(str);
      }
      """

  Scenario Outline: Verify data consistency across multiple dates
    Given path '/query'
    And param symbol = 'AAPL'
    And param apikey = 'demo'
    And param function = 'TIME_SERIES_DAILY_ADJUSTED'
    When method GET
    Then status 200
    And match response contains { 'Time Series (Daily)': '#object' }
    And match response['Time Series (Daily)']['<date>'] == '#object'
    And match response['Time Series (Daily)']['<date>'] contains
      """
      {
        '1. open': '#string',
        '2. high': '#string',
        '3. low': '#string',
        '4. close': '#string',
        '5. adjusted close': '#string',
        '6. volume': '#string',
        '7. dividend amount': '#string',
        '8. split coefficient': '#string'
      }
      """
    And match each response['Time Series (Daily)']['<date>'] == '#? isValidNumber(_)'

    Examples:
      | date       |
      | 2024-07-09 |
      | 2024-07-08 |
      | 2024-07-05 |
      | 2024-07-03 |
      | 2024-07-02 |

  Scenario: Test API with invalid input
    Given path '/query'
    And param symbol = 'INVALID'
    And param apikey = 'demo'
    And param function = 'TIME_SERIES_DAILY_ADJUSTED'
    When method GET
    Then status 200
    And match response contains { 'Error Message': '#string' }

  Scenario: Test API with missing required parameters
    Given path '/query'
    When method GET
    Then status 200
    And match response contains { 'Error Message': '#string' }
