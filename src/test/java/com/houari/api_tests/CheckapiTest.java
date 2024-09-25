
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
          String apiHostServer = System.getenv().getOrDefault("riot_URL_BASE", "http://localhost:4010");
String riotauthtoken = System.getenv().getOrDefault("riot_AUTH_TOKEN", "dummy_riot_AUTH_TOKEN");
String apiHostServer = System.getenv().getOrDefault("riot_URL_BASE", "http://localhost:4010");
String riotauthtoken = System.getenv().getOrDefault("riot_AUTH_TOKEN", "dummy_riot_AUTH_TOKEN");
String apiHostServer = System.getenv().getOrDefault("riot_URL_BASE", "http://localhost:4010");
String riotauthtoken = System.getenv().getOrDefault("riot_AUTH_TOKEN", "dummy_riot_AUTH_TOKEN");
String apiHostServer = System.getenv().getOrDefault("riot_URL_BASE", "http://localhost:4010");
String riotauthtoken = System.getenv().getOrDefault("riot_AUTH_TOKEN", "dummy_riot_AUTH_TOKEN");
String apiHostServer = System.getenv().getOrDefault("riot_URL_BASE", "http://localhost:4010");
String riotauthtoken = System.getenv().getOrDefault("riot_AUTH_TOKEN", "dummy_riot_AUTH_TOKEN");
String apiHostServer = System.getenv().getOrDefault("riot_URL_BASE", "http://localhost:4010");
String riotauthtoken = System.getenv().getOrDefault("riot_AUTH_TOKEN", "dummy_riot_AUTH_TOKEN");
String apiHostServer = System.getenv().getOrDefault("riot_URL_BASE", "http://localhost:4010");
String riotauthtoken = System.getenv().getOrDefault("riot_AUTH_TOKEN", "dummy_riot_AUTH_TOKEN");
String apiHostServer = System.getenv().getOrDefault("riot_URL_BASE", "http://localhost:4010");
String riotauthtoken = System.getenv().getOrDefault("riot_AUTH_TOKEN", "dummy_riot_AUTH_TOKEN");
          Results results = Runner.path("src/test/java/com/houari/api_tests/Checkapi")
                  .systemProperty("riot_URL_BASE", apiHostServer)
.systemProperty("riot_AUTH_TOKEN", riotauthtoken)
.systemProperty("riot_URL_BASE", apiHostServer)
.systemProperty("riot_AUTH_TOKEN", riotauthtoken)
.systemProperty("riot_URL_BASE", apiHostServer)
.systemProperty("riot_AUTH_TOKEN", riotauthtoken)
.systemProperty("riot_URL_BASE", apiHostServer)
.systemProperty("riot_AUTH_TOKEN", riotauthtoken)
.systemProperty("riot_URL_BASE", apiHostServer)
.systemProperty("riot_AUTH_TOKEN", riotauthtoken)
.systemProperty("riot_URL_BASE", apiHostServer)
.systemProperty("riot_AUTH_TOKEN", riotauthtoken)
.systemProperty("riot_URL_BASE", apiHostServer)
.systemProperty("riot_AUTH_TOKEN", riotauthtoken)
.systemProperty("riot_URL_BASE", apiHostServer)
.systemProperty("riot_AUTH_TOKEN", riotauthtoken)
                  .reportDir("testReport").parallel(1);
          assertEquals(0, results.getFailCount(), results.getErrorMessages());
      }

  }
