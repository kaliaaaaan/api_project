package service;

import models.CreateUserResponseModel;

import static specs.Specs.*;
import static io.qameta.allure.Allure.step;
import static io.restassured.RestAssured.given;

public class RequestCreateUser {

    public static CreateUserResponseModel sendCreateUser(Object body) {
        return step("Отправка запроса", () ->
                given(requestSpec)
                        .when()
                        .body(body)
                        .post("/users")
                        .then()
                        .spec(response201Spec)
                        .extract()
                        .response()
                        .as(CreateUserResponseModel.class));
    }

}
