package mobile;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@Tag("Mobile")

public class CourseTask extends TestBaseMobile {

    @CsvSource(value = {
            "course,      Java course",
            "tasks,             Tasks",
    })
    @ParameterizedTest
    @DisplayName("Открытие разделов Course/Java и проверка их содержимого")
    public void checkCourseTask(String param, String expectedText) {
        Common.stepsForApp();
        authenticationStep.goBackButton();
        authenticationStep.navigateMenu();
        courseTask.tag(param);
        courseTask.checkTitle(expectedText);
    }
}
