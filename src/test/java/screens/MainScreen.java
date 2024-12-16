package screens;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class MainScreen {
    SelenideElement announcementText = $(id("org.wikipedia.alpha:id/view_announcement_text"));
    @Step("Проверить, что на главном экране текст соответствует")
    public void checkAnnoncementText(){
        announcementText.shouldHave(text("Customize your Explore feed"));
    }
}
