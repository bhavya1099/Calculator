
    package com.houari.api_tests;
  
    import com.intuit.karate.Results;
    import com.intuit.karate.Runner;
    // import com.intuit.karate.http.HttpServer;
    // import com.intuit.karate.http.ServerConfig;
    import org.junit.jupiter.api.Test;
  
    import static org.junit.jupiter.api.Assertions.assertEquals;
  
    class AlphavantageGetResolvedTest {
  
        @Test
        void testAll() {
            String alphavantage_get_resolved_8bef8e59c6_url = System.getenv().getOrDefault("ALPHAVANTAGE_GET_RESOLVED_8BEF8E59C6_URL", "http://127.0.0.1:4010");
String url_base = System.getenv().getOrDefault("url.base", "dummy_url.base");
            Results results = Runner.path("src/test/java/com/houari/api_tests/AlphavantageGetResolved")
                    .systemProperty("ALPHAVANTAGE_GET_RESOLVED_8BEF8E59C6_URL",alphavantage_get_resolved_8bef8e59c6_url)
.systemProperty("url.base", url_base)
                    .reportDir("testReport").parallel(1);
            assertEquals(0, results.getFailCount(), results.getErrorMessages());
        }
  
    }
