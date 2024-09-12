# ********RoostGPT********

# Test generated by RoostGPT for test java-customannotation-test using AI Type  and AI Model 
# 
# ROOST_METHOD_HASH=61d8709361
# ROOST_METHOD_SIG_HASH=321946d6bd
# 
#  ########## Scenario ########## 
# 
# {
#   feature: 'Feature: Work Order Management API',
#   background: null,
#   rule: null,
#   scenario: {
#     title: 'Scenario: Retrieve an existing work order by ID',
#     steps: 'Given the API endpoint is "/workorders/{id}"\n' +
#       'And the work order ID is "WO123"\n' +
#       'When I send a GET request to retrieve the work order\n' +
#       'Then the response status code should be 200\n' +
#       'And the response should contain the work order details',
#     examples: ''
#   }
# }
# 

# ********RoostGPT********
Feature: Work Order Management API

  Background:
    * url 'https://api.example.com'

  Scenario: Retrieve an existing work order by ID
    Given path '/workorders/WO123'
    When method get
    Then status 200
    And match response contains
      """
      {
        id: 'WO123',
        status: '#string',
        details: '#string'
      }
      """
