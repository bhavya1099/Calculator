# ********RoostGPT********

# Test generated by RoostGPT for test test-workflow using AI Type Azure Open AI and AI Model roostgpt-4-32k
# 
# ROOST_METHOD_HASH=ae0ab0e28d
# ROOST_METHOD_SIG_HASH=b53f9bd50d
# 
#  ########## Scenario ########## 
# 
# {
#   feature: 'Feature: Test API from Alphavantage.co',
#   background: null,
#   rule: null,
#   scenario: {
#     title: 'Scenario: Attempt to retrieve data without providing a symbol',
#     steps: 'Given the API endpoint is "https://www.alphavantage.co/query"\n' +
#       'And I have a valid API key\n' +
#       'When I send a GET request with the following parameters:\n' +
#       '      | Parameter | Value                     |\n' +
#       '      | function  | TIME_SERIES_DAILY_ADJUSTED |\n' +
#       '      | apikey    | demo                      |\n' +
#       'Then the response should indicate an error',
#     examples: ''
#   }
# }
# 

# ********RoostGPT********
Feature: Test API from Alphavantage.co

Background:
  * def alphavantage_get_resolved_URL = karate.properties['ALPHAVANTAGE_GET_RESOLVED_URL']
  * if (alphavantage_get_resolved_URL == null) karate.set('alphavantage_get_resolved_URL', 'http://localhost:4010')
  * url alphavantage_get_resolved_URL

Scenario: Attempt to retrieve data without providing a symbol
  Given path '/query'

  And params { 
    'function': 'TIME_SERIES_DAILY_ADJUSTED', 
    'apikey': 'demo' 
  }

  When method get

  Then status 200

  And match $response.message == '#notnull'
