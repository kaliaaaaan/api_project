package tests;

import io.qameta.allure.*;
import lombok.val;
import models.CreateUsersBodyModel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static responseassertions.AssertionsResponseUpdateUsers.assertUpdateUserTestApi;
import static service.RequestUpdateUser.putUpdateUser;

@DisplayName("Изменение пользователя методом PUT")
@Owner("Nikolay Pronyushkin")
public class PutUpdateUsers extends TestBase {

    CreateUsersBodyModel body = new CreateUsersBodyModel();

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Изменение пользователя")
    @Description("Позитивный сценарий")
    public void positiveUpdateUserTestPut() {
        body.setName("Ivan").setJob("Pilot");
        val response = putUpdateUser(body, (11));
        assertUpdateUserTestApi(response, body);

    }

}