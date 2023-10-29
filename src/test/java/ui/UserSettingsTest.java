package ui;

import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ui.pages.ProfileSettingsPage;

import static com.codeborne.selenide.Selenide.refresh;
import static com.codeborne.selenide.Selenide.sleep;
import static ui.steps.Common.stepsForWebApp;

@Tag("UI")
@Owner("Кудрявцев Даниил")
@Feature("Автотесты для UI")
@Story("Настройки пользователя")
public class UserSettingsTest extends TestBase {

    ProfileSettingsPage profileSettingsPage = new ProfileSettingsPage();
    @Test
    @DisplayName("Загрузка картинки в профиль")
    public void imageProfileUpload() throws Exception {
        mainPageSteps.closeCookie();
        stepsForWebApp();
        refresh();
        WebDriverRunner.getWebDriver().manage().window().fullscreen();
        sleep(5000);
        sideBarSteps.openSettings();
        userSettingsStep.clickAvatarImage();
        profileSettingsPage.uploadPhoto.uploadFromClasspath("testFilePhoto.jpg");
        userSettingsStep.checkUploadPhoto();
        userSettingsStep.savePhoto();
        userSettingsStep.saveChanges();
        userSettingsStep.checkChanges();
    }
}
