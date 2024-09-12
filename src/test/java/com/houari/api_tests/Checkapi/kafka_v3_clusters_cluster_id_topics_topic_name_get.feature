# ********RoostGPT********

# Test generated by RoostGPT for test java-customannotation-test using AI Type  and AI Model 
# 
# Feature file generated for /kafka/v3/clusters/{cluster_id}/topics/{topic_name}_get for http method type GET 
# RoostTestHash=dc56f44070
# 
# 

# ********RoostGPT********
Feature: Kafka Topic Management

  Background:
    * def urlBase = karate.properties['url.base'] || karate.get('urlBase', 'http://localhost:4010')
    * url urlBase

  Scenario Outline: Get Kafka Topic Details with Valid Inputs
    Given path 'kafka/v3/clusters/', <cluster_id>, '/topics/', <topic_name>
    And param include_authorized_operations = <include_authorized_operations>
    And header Authorization = 'Bearer ' + karate.properties['AUTH_TOKEN']
    When method get
    Then status 200
    And match response == <expected_response>

    Examples:
      | read('kafka_v3_clusters_cluster_id_topics_topic_name_get.csv') |

  Scenario Outline: Get Kafka Topic with Invalid Cluster ID or Topic Name
    Given path 'kafka/v3/clusters/', <cluster_id>, '/topics/', <topic_name>
    And param include_authorized_operations = <include_authorized_operations>
    And header Authorization = 'Bearer ' + karate.properties['AUTH_TOKEN']
    When method get
    Then status <status_code>
    And match response == <expected_error>

    Examples:
      | read('kafka_v3_clusters_cluster_id_topics_topic_name_get.csv') |

  Scenario Outline: Test Rate Limiting Error
    Given path 'kafka/v3/clusters/', <cluster_id>, '/topics/', <topic_name>
    And param include_authorized_operations = <include_authorized_operations>
    And header Authorization = 'Bearer ' + karate.properties['AUTH_TOKEN']
    When method get
    Then status 429
    And match response contains 'Too Many Requests'

    Examples:
      | cluster_id  | topic_name | include_authorized_operations |
      | 'cluster-1' | 'topic-1'  | true                          |
