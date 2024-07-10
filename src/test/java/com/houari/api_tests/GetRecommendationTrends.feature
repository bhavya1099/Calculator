# ********RoostGPT********

# Test generated by RoostGPT for test test-workflow using AI Type Azure Open AI and AI Model roostgpt-4-32k
# 
# ROOST_METHOD_HASH=8625451764
# ROOST_METHOD_SIG_HASH=b021e62269
# 
#  ########## Scenario ########## 
# 
# {
#   feature: 'Feature: Finnhub API Testing',
#   background: null,
#   rule: null,
#   scenario: {
#     title: 'Scenario: Get Recommendation Trends',
#     steps: 'Given the Finnhub API base URL is "https://finnhub.io/api/v1"\n' +
#       'When I send a GET request to "/stock/recommendation?symbol=AAPL"\n' +
#       'Then the response status code should be 200\n' +
#       'And the response should contain recommendation trends',
#     examples: ''
#   }
# }
# 

# ********RoostGPT********
Feature: Finnhub API Testing

Background: 
  * url 'https://finnhub.io/api/v1'
  * def finnhub_AUTH_TOKEN = karate.properties['FINNHUB_AUTH_TOKEN'] || karate.get('FINNHUB_AUTH_TOKEN', 'http://localhost:4010')

Scenario: Get Recommendation Trends
  Given path '/stock/recommendation'
  And param symbol = 'AAPL'
  And param token = finnhub_AUTH_TOKEN
  When method get
  Then status 200
  And match response[0].symbol == 'AAPL'
  And match response[0].buy == '#present'
  And match response[0].hold == '#present'
  And match response[0].period == '#present'
  And match response[0].sell == '#present'
  And match response[0].strongBuy == '#present'
  And match response[0].strongSell == '#present'
