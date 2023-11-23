package tests;

import io.qameta.allure.*;
import lombok.val;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static service.RequestDeleteUser.sendDeleteUserRaw;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Удаление пользователя")
public class DeleteUser extends TestBase {

    @Tag("sanity")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Удаление пользователя с id")
    @Description("Позитивный сценарий")
    @Owner("Nikolay Pronyushkin")
    @ParameterizedTest(name = " = [{0}]")
    @ValueSource(strings = {"2", "4", "0"})
    public void deleteUserTest(int userId) {
        val response = sendDeleteUserRaw(userId);
        assertEquals(response.statusCode(), 204);
    }

}