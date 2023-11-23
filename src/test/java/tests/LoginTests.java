package tests;

import io.qameta.allure.*;
import lombok.val;
import models.LoginBodyModel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static responseassertions.AssertionsResponseLoginApi.assertNegativeLoginApi;
import static responseassertions.AssertionsResponseLoginApi.assertPositiveLoginApi;
import static service.RequestLoginUser.sendLogin;
import static service.RequestLoginUser.sendLoginRaw;

@DisplayName("Авторизация API POST /login")
@Owner("Nikolay Pronyushkin")
public class LoginTests extends TestBase {

    LoginBodyModel body = new LoginBodyModel();

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Tag("sanity")
    @DisplayName("Проверка авторизации пользователя")
    @Description("Успешная авторизация")
    public void positiveLoginTest() {
        body.setEmail("eve.holt@reqres.in").setPassword("cityslicka");
        val response = sendLogin(body);
        assertPositiveLoginApi(response);
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Tag("sanity")
    @DisplayName("Негативный сценарий при авторизации")
    @Description("Получение статуса 400")
    public void negativeLoginTest() {
        body.setEmail("login").setPassword("pass");
        val response = sendLoginRaw(body);
        assertNegativeLoginApi(response);
    }

}