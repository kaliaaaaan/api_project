package tests;

import io.qameta.allure.*;
import lombok.val;
import models.CreateUsersBodyModel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static responseassertions.AssertionsResponseUpdateUsers.assertUpdateUserTestApi;
import static service.RequestUpdateUser.patchUpdateUser;

@Story("Изменение пользователя")
@DisplayName("Изменение пользователя API PUT /users/id")
@Owner("Nikolay Pronyushkin")
public class PatchUpdateUsers extends TestBase {

    CreateUsersBodyModel body = new CreateUsersBodyModel();

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Tag("sanity")
    @DisplayName("Изменение пользователя")
    @Description("Позитивный сценарий")
    public void positiveUpdateUserTest() {
        body.setName("Test").setJob("Job");
        val response = patchUpdateUser(body, (13));
        assertUpdateUserTestApi(response, body);

    }

}
