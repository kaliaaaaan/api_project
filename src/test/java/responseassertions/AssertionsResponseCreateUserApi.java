package responseassertions;

import models.CreateUserResponseModel;
import models.CreateUsersBodyModel;

import static io.qameta.allure.Allure.step;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssertionsResponseCreateUserApi {

    public static void assertPositiveCreateUserApi(CreateUserResponseModel response, CreateUsersBodyModel userBody) {
        step("Проверяем, что в ответе получено введенное значение name", () ->
                assertEquals(response.getName(), userBody.getName()));
        step("Проверяем, что в ответе получено введенное значение job", () ->
                assertEquals(response.getJob(), userBody.getJob()));
    }
}
