package ui;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("UITest")
@Owner("Кудрявцев Даниил")
@Feature("Автотесты для UI")
@Story("Раздел 'Пользователи'")
public class SearchUsersTest extends TestBase {

    @Test
    @DisplayName("Поиск пользователя по имени")
    public void searchUserByName() {
        sideBarSteps.user();
        searchUsersStep.searchUser();
        searchUsersStep.checkoutResult();
    }
}
