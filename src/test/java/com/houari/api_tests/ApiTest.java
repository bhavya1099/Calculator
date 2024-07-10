
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
            String alphavantage_get_resolved_url = System.getenv().getOrDefault("ALPHAVANTAGE_GET_RESOLVED_URL", "http://localhost:4010");
String finnhub_url = System.getenv().getOrDefault("FINNHUB_URL", "http://localhost:4010");
String finnhub_auth_token = System.getenv().getOrDefault("FINNHUB_AUTH_TOKEN", "dummy_FINNHUB_AUTH_TOKEN");
String alphavantage_get_resolved_auth_token = System.getenv().getOrDefault("ALPHAVANTAGE_GET_RESOLVED_AUTH_TOKEN", "dummy_ALPHAVANTAGE_GET_RESOLVED_AUTH_TOKEN");
            Results results = Runner.path("src/test/java/com/houari/api_tests")
                    .systemProperty("ALPHAVANTAGE_GET_RESOLVED_URL",alphavantage_get_resolved_url)
.systemProperty("FINNHUB_URL",finnhub_url)
.systemProperty("FINNHUB_AUTH_TOKEN", finnhub_auth_token)
.systemProperty("ALPHAVANTAGE_GET_RESOLVED_AUTH_TOKEN", alphavantage_get_resolved_auth_token)
                    .reportDir("testReport").parallel(1);
            assertEquals(0, results.getFailCount(), results.getErrorMessages());
        }
  
    }
