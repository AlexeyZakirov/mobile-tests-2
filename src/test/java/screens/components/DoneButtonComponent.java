package screens.components;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class DoneButtonComponent {
    private final SelenideElement button = $(id("org.wikipedia.alpha:id/fragment_onboarding_done_button"));
    @Step("Кликнуть кнопку Get Started")
    public void click(){
        button.click();
    }
}
