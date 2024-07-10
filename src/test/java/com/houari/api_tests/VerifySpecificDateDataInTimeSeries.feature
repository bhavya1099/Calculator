# ********RoostGPT********

# Test generated by RoostGPT for test test-workflow using AI Type Azure Open AI and AI Model roostgpt-4-32k
# 
# ROOST_METHOD_HASH=4d8e97d704
# ROOST_METHOD_SIG_HASH=d5853d6df0
# 
#  ########## Scenario ########## 
# 
# {
#   feature: 'Feature: Alpha Vantage Daily Time Series API',
#   background: null,
#   rule: null,
#   scenario: {
#     title: 'Scenario: Verify specific date data in time series',
#     steps: 'Given I have retrieved the daily time series data for AAPL stock\n' +
#       'When I check the data for "2024-07-09"\n' +
#       'Then it should have the following values:\n' +
#       '      | Field     | Value     |\n' +
#       '      | 1. open   | 227.9300  |\n' +
#       '      | 2. high   | 229.4000  |\n' +
#       '      | 3. low    | 226.3721  |\n' +
#       '      | 4. close  | 228.6800  |\n' +
#       '      | 5. volume | 48169822  |',
#     examples: ''
#   }
# }
# 

# ********RoostGPT********
Feature: Alpha Vantage Daily Time Series API

  Background:
    * def alphavantage_get_resolved_URL = karate.properties['ALPHAVANTAGE_GET_RESOLVED_URL'] || karate.get('ALPHAVANTAGE_GET_RESOLVED_URL', 'http://localhost:4010')
    # No authentication required as per the API spec security field
    * url alphavantage_get_resolved_URL

  Scenario Outline: Verify specific date data in time series
    Given path '/query'
    And params {symbol: 'AAPL', apikey: 'demo', function: 'TIME_SERIES_DAILY'}
    When method get
    Then status 200
    # Expect the date key to be present in the response
    And match $ contains '<timestamp>'
    # Check the data for the date "<timestamp>"
    * def date_data = response['<timestamp>']
    # Assert the values for the given date
    And assert date_data['1. open'] == '<open>'
    And assert date_data['2. high'] == '<high>'
    And assert date_data['3. low'] == '<low>'
    And assert date_data['4. close'] == '<close>'
    And assert date_data['5. volume'] == '<volume>'

  Examples:
    | timestamp    | open       | high       | low        | close      | volume     |
    | '2024-07-09' | '227.9300' | '229.4000' | '226.3721' | '228.6800' | '48169822' |
