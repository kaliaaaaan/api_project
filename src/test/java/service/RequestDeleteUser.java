package service;

import io.restassured.response.Response;

import static io.qameta.allure.Allure.step;
import static io.restassured.RestAssured.given;
import static specs.Specs.requestSpec;
import static specs.Specs.response204Spec;

public class RequestDeleteUser {

    public static String deleteUserUrl(int id) {
        return String.format("/users/%d", id);
    }

    public static Response sendDeleteUserRaw(int id) {
        return step("Удаление пользователя", () ->
                given(requestSpec)
                        .when()
                        .delete(deleteUserUrl(id))
                        .then()
                        .spec(response204Spec)
                        .extract()
                        .response());
    }

}
