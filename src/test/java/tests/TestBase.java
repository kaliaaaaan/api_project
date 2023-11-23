package tests;

import config.ApiConfig;
import io.restassured.RestAssured;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    static ApiConfig config = ConfigFactory.create(ApiConfig.class);

    @BeforeAll
    static void setup() {
        RestAssured.baseURI = config.baseUri();
        RestAssured.basePath = config.basePath();
    }

}