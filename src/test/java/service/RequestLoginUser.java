package service;

import io.restassured.response.Response;
import models.LoginResponseModel;

import static io.qameta.allure.Allure.step;
import static io.restassured.RestAssured.given;
import static specs.Specs.requestSpec;
import static specs.Specs.response200Spec;

public class RequestLoginUser {

    public static LoginResponseModel sendLogin(Object body) {
        return step("Отправка запроса", () ->
                given(requestSpec)
                        .when()
                        .body(body)
                        .post("/login")
                        .then()
                        .spec(response200Spec)
                        .extract()
                        .response()
                        .as(LoginResponseModel.class));
    }

    public static Response sendLoginRaw(Object body) {
        return step("Отправка запроса", () ->
                given(requestSpec)
                        .when()
                        .body(body)
                        .post("/login")
                        .then()
                        .extract()
                        .response());
    }

}
