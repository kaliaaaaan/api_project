package tests;

import models.CreateUsersBodyModel;
import io.qameta.allure.*;
import lombok.val;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static responseassertions.AssertionsResponseCreateUserApi.assertPositiveCreateUserApi;
import static service.RequestCreateUser.sendCreateUser;

@DisplayName("Создание юзера API POST /users")
public class CreateUser extends TestBase {

    CreateUsersBodyModel body = new CreateUsersBodyModel();

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Проверка создания пользователя")
    @Description("Позитивный сценарий")
    @Owner("Nikolay Pronyushkin")
    @Tag("sanity")
    public void positiveCreateUserTest() {
        body.setName("Neo").setJob("The chosen one");
        val response = sendCreateUser(body);
        assertPositiveCreateUserApi(response, body);
    }

}