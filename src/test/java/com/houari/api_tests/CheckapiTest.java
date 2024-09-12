
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
          String urlbase = System.getenv().getOrDefault("url.base", "dummy_url.base");
String authtoken = System.getenv().getOrDefault("AUTH_TOKEN", "dummy_AUTH_TOKEN");
          Results results = Runner.path("src/test/java/com/houari/api_tests/Checkapi")
                  .systemProperty("url.base", urlbase)
.systemProperty("AUTH_TOKEN", authtoken)
                  .reportDir("testReport").parallel(1);
          assertEquals(0, results.getFailCount(), results.getErrorMessages());
      }

  }
