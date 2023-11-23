package responseassertions;

import io.restassured.response.Response;
import models.LoginResponseModel;

import static io.qameta.allure.Allure.step;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AssertionsResponseLoginApi {

    public static void assertPositiveLoginApi(LoginResponseModel response) {
        step("Проверяем что присутствует token : ", () ->
                assertEquals("QpwL5tke4Pnpja7X4",response.getToken()));
    }

    public static void assertNegativeLoginApi(Response response) {
        step("Проверяем, что получен статус код: 400", () ->
                assertEquals(response.statusCode(), 400));
    }

}
