# ********RoostGPT********

# Test generated by RoostGPT for test test-workflow using AI Type Azure Open AI and AI Model roostgpt-4-32k
# 
# ROOST_METHOD_HASH=49853aea8d
# ROOST_METHOD_SIG_HASH=24c692fb0c
# 
#  ########## Scenario ########## 
# 
# {
#   feature: 'Feature: Alpha Vantage Daily Time Series API',
#   background: null,
#   rule: null,
#   scenario: {
#     title: 'Scenario: Verify time series order',
#     steps: 'Given I have retrieved the daily time series data for AAPL stock\n' +
#       'Then the dates should be in descending order\n' +
#       'And the most recent date should not be in the future',
#     examples: ''
#   }
# }
# 

# ********RoostGPT********
Feature: Alpha Vantage Daily Time Series API

Background: 
  * def alphavantage_get_resolved_URL = karate.properties['ALPHAVANTAGE_GET_RESOLVED_URL'] || 'http://localhost:4010'
  * url alphavantage_get_resolved_URL
  * def symbol = 'AAPL'
  * def apikey = 'your_api_key'
  * def function = 'TIME_SERIES_DAILY'

Scenario Outline: Verify time series order
  Given path '/query'
  And param symbol = '<symbol>'
  And param apikey = '<apikey>'
  And param function = '<function>'
  When method get
  Then status 200
  * def response = response
  
  # Ensure response has required format
  * match response contains { "Time Series (Daily)": '#(not_null)' }
  
  # Get dates from the response
  * def dates = $response['Time Series (Daily)'].keySet()
  
  # assertThat dates are in descending order
  * assert karate.jsonPath(dates, "$[*]").isAscending() == false
  
  # assertThat the most recent date is less than or equal to current date
  * assert karate.jsonPath(dates, "$[0]") <= '#(java.time.LocalDate.now().toString())'
  
  Examples: 
    | symbol | apikey | function |
    | AAPL   | your_api_key | TIME_SERIES_DAILY |
