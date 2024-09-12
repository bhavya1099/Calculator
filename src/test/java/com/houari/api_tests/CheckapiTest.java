
    package com.houari.api_tests;
  
    import com.intuit.karate.Results;
    import com.intuit.karate.Runner;
    // import com.intuit.karate.http.HttpServer;
    // import com.intuit.karate.http.ServerConfig;
    import org.junit.jupiter.api.Test;
  
    import static org.junit.jupiter.api.Assertions.assertEquals;
  
    class CheckapiTest {
  
        @Test
        void testAll() {
            String checkapi_43f280e94d_url = System.getenv().getOrDefault("CHECKAPI_43F280E94D_URL", "http://127.0.0.1:4010");
String checkapi_43f280e94d_auth_token = System.getenv().getOrDefault("CHECKAPI_43F280E94D_AUTH_TOKEN", "dummy_CHECKAPI_43F280E94D_AUTH_TOKEN");
            Results results = Runner.path("src/test/java/com/houari/api_tests/Checkapi")
                    .systemProperty("CHECKAPI_43F280E94D_URL",checkapi_43f280e94d_url)
.systemProperty("CHECKAPI_43F280E94D_AUTH_TOKEN", checkapi_43f280e94d_auth_token)
                    .reportDir("testReport").parallel(1);
            assertEquals(0, results.getFailCount(), results.getErrorMessages());
        }
  
    }
