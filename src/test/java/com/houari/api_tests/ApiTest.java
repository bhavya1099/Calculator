
    package com.houari.api_tests;
  
    import com.intuit.karate.Results;
    import com.intuit.karate.Runner;
    // import com.intuit.karate.http.HttpServer;
    // import com.intuit.karate.http.ServerConfig;
    import org.junit.jupiter.api.Test;
  
    import static org.junit.jupiter.api.Assertions.assertEquals;
  
    class ApiTest {
  
        @Test
        void testAll() {
            String alphavantage_get_resolved_url_URL = System.getenv().getOrDefault("alphavantage-get-resolved_URL", "http://localhost:4010");
String alphavantage_get_resolved_auth_token = System.getenv().getOrDefault("alphavantage-get-resolved_AUTH_TOKEN", "dummy_alphavantage-get-resolved_AUTH_TOKEN");
String alphavantage_get_resolved_url = System.getenv().getOrDefault("alphavantage_get_resolved_URL", "dummy_alphavantage_get_resolved_URL");
String alphavantage_get_resolved_auth_token = System.getenv().getOrDefault("alphavantage_get_resolved_AUTH_TOKEN", "dummy_alphavantage_get_resolved_AUTH_TOKEN");
            Results results = Runner.path("src/test/java/com/houari/api_tests")
                    .systemProperty("alphavantage-get-resolved_URL",alphavantage_get_resolved_url_URL)
.systemProperty("alphavantage-get-resolved_AUTH_TOKEN", alphavantage_get_resolved_auth_token)
.systemProperty("alphavantage_get_resolved_URL", alphavantage_get_resolved_url)
.systemProperty("alphavantage_get_resolved_AUTH_TOKEN", alphavantage_get_resolved_auth_token)
                    .reportDir("testReport").parallel(1);
            assertEquals(0, results.getFailCount(), results.getErrorMessages());
        }
  
    }
