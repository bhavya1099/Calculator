# ********RoostGPT********

# Test generated by RoostGPT for test test-workflow using AI Type Azure Open AI and AI Model roostgpt-4-32k
# 
# ROOST_METHOD_HASH=afeaf9d0ee
# ROOST_METHOD_SIG_HASH=6da47dc804
# 
#  ########## Scenario ########## 
# 
# {
#   feature: 'Feature: Finnhub API Testing',
#   background: null,
#   rule: null,
#   scenario: {
#     title: 'Scenario: Get Company Profile',
#     steps: 'Given the Finnhub API base URL is "https://finnhub.io/api/v1"\n' +
#       'When I send a GET request to "/stock/profile2?symbol=AAPL"\n' +
#       'Then the response status code should be 200\n' +
#       'And the response should contain the company profile details',
#     examples: ''
#   }
# }
# 

# ********RoostGPT********
: Finnhub API Testing
 Background: 
    Given def finnhub_URL = karate.properties['FINNHUB_URL'] || 'https://finnhub.io/api/v1'
    And def finnhub_AUTH_TOKEN = karate.properties['FINNHUB_AUTH_TOKEN']
    And url finnhub_URL

Scenario: Get Company Profile
    Given def API_ENDPOINT_ROUTE = '/stock/profile2?symbol=AAPL'
    And def headers = { 'Content-Type': 'application/json', 'Authorization': '#(finnhub_AUTH_TOKEN)' }
    And path API_ENDPOINT_ROUTE
    And headers headers
    When method get
    Then status 200
    And match response == 
    """
    {
      "country": "#string",
      "currency": "#string",
      "exchange": "#string",
      "name": "#string",
      "ticker": "#string",
      "ipo": "#string",
      "marketCapitalization": "#number",
      "shareOutstanding": "#number",
      "logo": "#string",
      "phone": "#string",
      "weburl": "#string",
      "finnhubIndustry": "#string",
    }
    """
