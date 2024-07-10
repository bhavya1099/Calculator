# ********RoostGPT********

# Test generated by RoostGPT for test test-workflow using AI Type Azure Open AI and AI Model roostgpt-4-32k
# 
# ROOST_METHOD_HASH=e027123530
# ROOST_METHOD_SIG_HASH=24c692fb0c
# 
#  ########## Scenario ########## 
# 
# {
#   feature: 'Feature: Test API from Alphavantage.co',
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
Feature: Test API from Alphavantage.co

Background: 
  * def alphavantage_get_resolved_URL = karate.properties['ALPHAVANTAGE_GET_RESOLVED_URL'] || karate.get('ALPHAVANTAGE_GET_RESOLVED_URL', 'http://localhost:4010')
  * url alphavantage_get_resolved_URL
  
Scenario Outline: Verify time series order
  
  # Retrieve the daily time series data for AAPL stock
  Given path '/query'
  And param symbol = 'AAPL'
  And param apikey = 'YOUR_API_KEY'
  And param function = 'TIME_SERIES_DAILY'
  When method get
  Then status 200
  
  # Validation steps to be included in their own scenario or step definitions
  * call read('validationSteps.feature')

Examples: // add examples if required
  
---ROOST FEATURES END---
