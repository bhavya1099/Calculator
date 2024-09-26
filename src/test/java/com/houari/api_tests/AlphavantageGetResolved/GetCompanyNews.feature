# ********RoostGPT********

# Test generated by RoostGPT for test advancedReportTest using AI Type  and AI Model 
# 
# ROOST_METHOD_HASH=6f115ad871
# ROOST_METHOD_SIG_HASH=b7249e4391
# 
#  ########## Scenario ########## 
# 
# {
#   feature: 'Feature: Test API from Alphavantage.co',
#   background: null,
#   rule: null,
#   scenario: {
#     title: 'Scenario: Get Company News',
#     steps: 'Given the Finnhub API base URL is "https://finnhub.io/api/v1"\n' +
#       'When I send a GET request to "/company-news?symbol=AAPL&from=2022-01-01&to=2022-01-05"\n' +
#       'Then the response status code should be 200\n' +
#       'And the response should contain a list of news articles',
#     examples: ''
#   }
# }
# 

# ********RoostGPT********
Feature: Test API from Alphavantage.co

  Scenario: Get Daily Adjusted Time Series for a Company
    * def urlBase = karate.properties['url.base'] || karate.get('urlBase', 'http://localhost:4010')
    * url urlBase
    Given path '/query'
    And param symbol = 'AAPL'
    And param function = 'TIME_SERIES_DAILY_ADJUSTED'
    And param apikey = 'demo'
    When method GET
    Then status 200
    And match response contains { 'Meta Data': '#object' }
    And match response contains { 'Time Series (Daily)': '#object' }
    And match response['Meta Data']['2. Symbol'] == 'AAPL'
    And match response['Meta Data']['1. Information'] contains 'Daily Adjusted Prices and Volumes'
    And match response['Time Series (Daily)']['#string'] == '#object'
    And match response['Time Series (Daily)']['#string'] contains
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
    * print 'Sample of Time Series Data:', karate.take(response['Time Series (Daily)'], 1)
