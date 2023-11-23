package service;

import models.UpdateUserResponseModel;

import static io.qameta.allure.Allure.step;
import static io.restassured.RestAssured.given;
import static specs.Specs.requestSpec;
import static specs.Specs.response200Spec;

public class RequestUpdateUser {

    public static String getUserUrl(int id) {
        return String.format("/users/%d", id);
    }

    public static UpdateUserResponseModel putUpdateUser(Object body, int userId) {
        return step("Отправка запроса на обновление put", () ->
                given(requestSpec)
                        .when()
                        .body(body)
                        .put(getUserUrl(userId))
                        .then()
                        .spec(response200Spec)
                        .extract()
                        .response()
                        .as(UpdateUserResponseModel.class));
    }

    public static UpdateUserResponseModel patchUpdateUser(Object body, int userId) {
        return step("Отправка запроса на обновление patch", () ->
                given(requestSpec)
                        .when()
                        .body(body)
                        .patch(getUserUrl(userId))
                        .then()
                        .spec(response200Spec)
                        .extract()
                        .response()
                        .as(UpdateUserResponseModel.class));
    }

}
