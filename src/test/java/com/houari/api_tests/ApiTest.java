
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
            String resourcepoolmanagement_db0413cb31_url = System.getenv().getOrDefault("RESOURCEPOOLMANAGEMENT_DB0413CB31_URL", "http://localhost:4010");
String serviceactivation_92c99a67c4_url = System.getenv().getOrDefault("SERVICEACTIVATION_92C99A67C4_URL", "http://localhost:4010");
String resourcepoolmanagement_db0413cb31_auth_token = System.getenv().getOrDefault("RESOURCEPOOLMANAGEMENT_DB0413CB31_AUTH_TOKEN", "dummy_RESOURCEPOOLMANAGEMENT_DB0413CB31_AUTH_TOKEN");
String serviceactivation_92c99a67c4_auth_token = System.getenv().getOrDefault("SERVICEACTIVATION_92C99A67C4_AUTH_TOKEN", "dummy_SERVICEACTIVATION_92C99A67C4_AUTH_TOKEN");
            Results results = Runner.path("src/test/java/com/houari/api_tests")
                    .systemProperty("RESOURCEPOOLMANAGEMENT_DB0413CB31_URL",resourcepoolmanagement_db0413cb31_url)
.systemProperty("SERVICEACTIVATION_92C99A67C4_URL",serviceactivation_92c99a67c4_url)
.systemProperty("RESOURCEPOOLMANAGEMENT_DB0413CB31_AUTH_TOKEN", resourcepoolmanagement_db0413cb31_auth_token)
.systemProperty("SERVICEACTIVATION_92C99A67C4_AUTH_TOKEN", serviceactivation_92c99a67c4_auth_token)
                    .reportDir("testReport").parallel(1);
            assertEquals(0, results.getFailCount(), results.getErrorMessages());
        }
  
    }
