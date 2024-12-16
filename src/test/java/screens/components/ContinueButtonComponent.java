package screens.components;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class ContinueButtonComponent {
    SelenideElement button = $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button"));

    @Step("Кликнуть \"Continue\"")
    public void click(){
        button.click();
    }
}
