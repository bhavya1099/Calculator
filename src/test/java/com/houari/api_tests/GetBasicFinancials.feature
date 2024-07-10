# ********RoostGPT********

# Test generated by RoostGPT for test test-workflow using AI Type Azure Open AI and AI Model roostgpt-4-32k
# 
# ROOST_METHOD_HASH=9ab31c5775
# ROOST_METHOD_SIG_HASH=736ee1b30e
# 
#  ########## Scenario ########## 
# 
# {
#   feature: 'Feature: Finnhub API Testing',
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
Feature: Finnhub API Testing

Background:
    * def finnhub_URL = karate.properties['FINNHUB_URL'] || karate.get('FINNHUB_URL', 'http://localhost:4010')
    * def finnhub_AUTH_TOKEN = karate.properties['FINNHUB_AUTH_TOKEN'] || karate.get('FINNHUB_AUTH_TOKEN', 'http://localhost:4010')

Scenario: Setup Request Parameters 
  * def params = { symbol: 'AAPL', metric: 'all', token: '#(finnhub_AUTH_TOKEN)' }

Scenario: Call the Finnhub API
  * url finnhub_URL
  * path '/stock/metric'
  * param params
  * method get

Scenario: Get Basic Financials
  * status 200 
  * match response contains { symbol: '#string', metricType: '#string', series: '#(typeof expectedValue === 'object')', metric: '#object' }

Scenario: Print the Response
  * print 'The response should contain financial metrics'
