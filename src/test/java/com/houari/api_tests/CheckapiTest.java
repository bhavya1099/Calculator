
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
          String apiHostServer = System.getenv().getOrDefault("UIOP_URL_BASE", "http://localhost:4010");
String uiopauthtoken = System.getenv().getOrDefault("UIOP_AUTH_TOKEN", "dummy_UIOP_AUTH_TOKEN");
String apiHostServer = System.getenv().getOrDefault("UIOP_URL_BASE", "http://localhost:4010");
String uiopauthtoken = System.getenv().getOrDefault("UIOP_AUTH_TOKEN", "dummy_UIOP_AUTH_TOKEN");
String apiHostServer = System.getenv().getOrDefault("UIOP_URL_BASE", "http://localhost:4010");
String uiopauthtoken = System.getenv().getOrDefault("UIOP_AUTH_TOKEN", "dummy_UIOP_AUTH_TOKEN");
String apiHostServer = System.getenv().getOrDefault("UIOP_URL_BASE", "http://localhost:4010");
String uiopauthtoken = System.getenv().getOrDefault("UIOP_AUTH_TOKEN", "dummy_UIOP_AUTH_TOKEN");
String apiHostServer = System.getenv().getOrDefault("UIOP_URL_BASE", "http://localhost:4010");
String uiopauthtoken = System.getenv().getOrDefault("UIOP_AUTH_TOKEN", "dummy_UIOP_AUTH_TOKEN");
String apiHostServer = System.getenv().getOrDefault("UIOP_URL_BASE", "http://localhost:4010");
String uiopauthtoken = System.getenv().getOrDefault("UIOP_AUTH_TOKEN", "dummy_UIOP_AUTH_TOKEN");
String apiHostServer = System.getenv().getOrDefault("UIOP_URL_BASE", "http://localhost:4010");
String uiopauthtoken = System.getenv().getOrDefault("UIOP_AUTH_TOKEN", "dummy_UIOP_AUTH_TOKEN");
String apiHostServer = System.getenv().getOrDefault("UIOP_URL_BASE", "http://localhost:4010");
String uiopauthtoken = System.getenv().getOrDefault("UIOP_AUTH_TOKEN", "dummy_UIOP_AUTH_TOKEN");
          Results results = Runner.path("src/test/java/com/houari/api_tests/Checkapi")
                  .systemProperty("UIOP_URL_BASE", apiHostServer)
.systemProperty("UIOP_AUTH_TOKEN", uiopauthtoken)
.systemProperty("UIOP_URL_BASE", apiHostServer)
.systemProperty("UIOP_AUTH_TOKEN", uiopauthtoken)
.systemProperty("UIOP_URL_BASE", apiHostServer)
.systemProperty("UIOP_AUTH_TOKEN", uiopauthtoken)
.systemProperty("UIOP_URL_BASE", apiHostServer)
.systemProperty("UIOP_AUTH_TOKEN", uiopauthtoken)
.systemProperty("UIOP_URL_BASE", apiHostServer)
.systemProperty("UIOP_AUTH_TOKEN", uiopauthtoken)
.systemProperty("UIOP_URL_BASE", apiHostServer)
.systemProperty("UIOP_AUTH_TOKEN", uiopauthtoken)
.systemProperty("UIOP_URL_BASE", apiHostServer)
.systemProperty("UIOP_AUTH_TOKEN", uiopauthtoken)
.systemProperty("UIOP_URL_BASE", apiHostServer)
.systemProperty("UIOP_AUTH_TOKEN", uiopauthtoken)
                  .reportDir("testReport").parallel(1);
          assertEquals(0, results.getFailCount(), results.getErrorMessages());
      }

  }
