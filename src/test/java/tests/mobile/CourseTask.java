package tests.mobile;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static tests.mobile.Common.stepsForApp;

@Tag("Mobile")

public class CourseTask extends TestBaseMobile {
    @CsvSource(value = {
            "course,      Java course",
            "tasks,             Tasks",
    })
    @ParameterizedTest
    @DisplayName("Открытие разделов Course/Java и проверка их содержимого")
    public void checkCourseTask(String param, String expectedText) {
        stepsForApp();
        auth.goBackButton();
        auth.navigateMenu();
        courseTask.tag(param);
        courseTask.checkTitle(expectedText);
    }
}
