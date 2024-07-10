# ********RoostGPT********

# Test generated by RoostGPT for test test-workflow using AI Type Azure Open AI and AI Model roostgpt-4-32k
# 
# ROOST_METHOD_HASH=a5a26d5d9c
# ROOST_METHOD_SIG_HASH=2812de346c
# 
#  ########## Scenario ########## 
# 
# {
#   feature: 'Feature: Test API from Alphavantage.co',
#   background: null,
#   rule: null,
#   scenario: {
#     title: 'Scenario: Get Stock Dividends',
#     steps: 'Given the Finnhub API base URL is "https://finnhub.io/api/v1"\n' +
#       'When I send a GET request to "/stock/dividend?symbol=AAPL&from=2021-01-01&to=2021-12-31"\n' +
#       'Then the response status code should be 200\n' +
#       'And the response should contain dividend data',
#     examples: ''
#   }
# }
# 

# ********RoostGPT********
Feature: Test API for https://finnhub.io/api/v1

Background:
    * def finnhub_URL = karate.properties['FINNHUB_URL'] || 'http://localhost:4010'
    * def finnhub_AUTH_TOKEN = karate.properties['FINNHUB_AUTH_TOKEN'] || 'http://localhost:4010'
    * url finnhub_URL + '/api/v1'

Scenario Outline: Get Stock Dividends
    Given path '/stock/dividend'
    And param symbol = 'AAPL'
    And param from = '2021-01-01'
    And param to = '2021-12-31'
    And param token = #(finnhub_AUTH_TOKEN)
    When method get
    Then status 200
    And match response[0] contains {symbol: '#string', date: '#string', amount: '#number', adjustedAmount: '#number', payDate: '#string', recordDate: '#string', declarationDate: '#string', currency: '#string', freq: '#string'}
