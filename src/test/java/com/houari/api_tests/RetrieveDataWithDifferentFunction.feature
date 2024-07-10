# ********RoostGPT********

# Test generated by RoostGPT for test test-workflow using AI Type Azure Open AI and AI Model roostgpt-4-32k
# 
# ROOST_METHOD_HASH=5fa26a145f
# ROOST_METHOD_SIG_HASH=c420c35532
# 
#  ########## Scenario ########## 
# 
# {
#   feature: 'Feature: Test API from Alphavantage.co',
#   background: null,
#   rule: null,
#   scenario: {
#     title: 'Scenario: Retrieve data with a different function',
#     steps: 'Given the API endpoint is "https://www.alphavantage.co/query"\n' +
#       'And I have a valid API key\n' +
#       'When I send a GET request with the following parameters:\n' +
#       '      | Parameter | Value        |\n' +
#       '      | function  | <function>   |\n' +
#       '      | symbol    | IBM          |\n' +
#       '      | apikey    | demo         |\n' +
#       'Then the response status code should be 200',
#     examples: 'Examples:\n' +
#       '      | function           |\n' +
#       '      | TIME_SERIES_WEEKLY |\n' +
#       '      | TIME_SERIES_MONTHLY|'
#   }
# }
# 

# ********RoostGPT********
Feature: Test API from Alphavantage.co

Background:
    * def alphavantage_get_resolved_URL = karate.properties['alphavantage_get_resolved_URL'] || karate.get('alphavantage_get_resolved_URL', 'http://localhost:4010')
    * url alphavantage_get_resolved_URL

Scenario Outline: Retrieve data with a different function

Given path '/query'
And param symbol = 'IBM'
And param apikey = 'demo'
And param function = '<function>'
When method get
Then assert responseStatus == 200
And match response contains { 'Symbol': '#string', 'indicator': '#string' }

Examples:
      | function           |
      | TIME_SERIES_WEEKLY |
      | TIME_SERIES_MONTHLY|
