package tests.mobile;

import com.codeborne.selenide.Condition;
import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
import static pagesMobile.Generations.generationRandomName;
@Tag("Mobile")
public class CommentTest extends TestBaseMobile {
    String name, text;
@Test
    public void commTest(){
    stepsForApp();
    $(AppiumBy.id("com.hitechrush.jaxarush:id/commentsButton")).click();//нажимем на кнопку коментарии
    name = generationRandomName();
    sleep(3000);
    $(AppiumBy.id("com.hitechrush.jaxarush:id/addCommentFab")).click(); // нажимаем добавить комент
    $(AppiumBy.id("com.hitechrush.jaxarush:id/addCommentText")).click();
    $(AppiumBy.id("com.hitechrush.jaxarush:id/addCommentText")).sendKeys(name);
    $(AppiumBy.id("com.hitechrush.jaxarush:id/send")).click();
    $(AppiumBy.xpath("(//android.widget.ImageView[@content-desc=\"JavaRush\"])[2]")).click();
    $(AppiumBy.id("com.hitechrush.jaxarush:id/editButton")).click();
    text = comment.checkoutText.getText();
    Assert.assertEquals(text, name);
    $(AppiumBy.id("com.hitechrush.jaxarush:id/send")).click();

    $(AppiumBy.id("com.hitechrush.jaxarush:id/userDisplayName")).shouldBe(Condition.text("KYT"));
    $(AppiumBy.xpath("(//android.widget.ImageView[@content-desc=\"JavaRush\"])[2]")).click();
    $(AppiumBy.id("com.hitechrush.jaxarush:id/deleteButton")).click();

    


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
