
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
            String serviceactivation_url = System.getenv().getOrDefault("SERVICEACTIVATION_URL", "http://localhost:4010");
String resourcepoolmanagement_url = System.getenv().getOrDefault("RESOURCEPOOLMANAGEMENT_URL", "http://localhost:4010");
            Results results = Runner.path("src/test/java/com/houari/api_tests")
                    .systemProperty("SERVICEACTIVATION_URL",serviceactivation_url)
.systemProperty("RESOURCEPOOLMANAGEMENT_URL",resourcepoolmanagement_url)
                    .reportDir("testReport").parallel(1);
            assertEquals(0, results.getFailCount(), results.getErrorMessages());
        }
  
    }
