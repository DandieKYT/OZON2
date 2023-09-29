package tests.mobile;

import com.codeborne.selenide.Condition;
import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;

public class AddLikeLessonTest extends TestBaseMobile {
   String countLike;
    @Test
    @DisplayName("Добавление лайка на страницу лекции")
    public void addLikeLesson(){
        stepsForApp();
        countLike = addLikeLessonPage.count.getText();
        int likeInt = Integer.parseInt(countLike);
        $(AppiumBy.id("com.hitechrush.jaxarush:id/likesButton")).click();
        $(AppiumBy.id("com.hitechrush.jaxarush:id/itemLikeDesc")).click();
        countLike = addLikeLessonPage.count.getText();
        int secondLikeInt = Integer.parseInt(countLike);
        if (secondLikeInt - likeInt == 1) {
            $(AppiumBy.id("com.hitechrush.jaxarush:id/likesButton")).click();
        }
        else {
            System.out.println("Лайк не проставлен");
        }
    }



    private void stepsForApp() {
        auth.signInLink()
                .secretKeyLink()
                .loginKey()
                .loginButton()
                .closeBanner()
                .closeSecondBanner()
                .openLesson();
    }
}
