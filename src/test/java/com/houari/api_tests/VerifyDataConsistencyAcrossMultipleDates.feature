# ********RoostGPT********

# Test generated by RoostGPT for test test-workflow using AI Type Azure Open AI and AI Model roostgpt-4-32k
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
  * def alphavantage_get_resolved_URL = karate.properties['ALPHAVANTAGE_GET_RESOLVED_URL'] || karate.get('ALPHAVANTAGE_GET_RESOLVED_URL', 'http://localhost:4010')
  * url alphavantage_get_resolved_URL

Scenario Outline: Verify data consistency across multiple dates

  Given path '/query'
  And params ('symbol': 'AAPL', 'function': 'TIME_SERIES_DAILY', 'apikey': 'YOUR_API_KEY', 'date': '<date>')
  When method get
  Then status 200
  And assert response != null 
  And match response contains { 
    "Meta Data": '#notnull',
    "Time Series (Daily)": '#notnull'
  }
  
  Examples:
      | date       |
      | 2024-07-09 |
      | 2024-07-08 |
      | 2024-07-05 |
      | 2024-07-03 |
      | 2024-07-02 |

