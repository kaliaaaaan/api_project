package responseassertions;

import models.CreateUsersBodyModel;
import models.UpdateUserResponseModel;

import static io.qameta.allure.Allure.step;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssertionsResponseUpdateUsers {

    public static void assertUpdateUserTestApi(UpdateUserResponseModel response, CreateUsersBodyModel body) {
        step("Сверка данных", () ->
                assertEquals(response.getName(), body.getName()));
        step("Сверка данных", () ->
                assertEquals(response.getJob(), body.getJob()));
    }

}
