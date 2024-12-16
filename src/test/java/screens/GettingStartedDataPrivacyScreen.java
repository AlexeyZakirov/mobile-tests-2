package screens;

import io.qameta.allure.Step;
import screens.components.GettingStartedPrimaryTextViewComponent;

import static com.codeborne.selenide.Condition.text;

public class GettingStartedDataPrivacyScreen {
    GettingStartedPrimaryTextViewComponent primaryTextViewComponent = new GettingStartedPrimaryTextViewComponent();
    @Step("Проверить главный текст страницы Getting Started - Data & Privacy")
    public void checkPrimaryTextOnScreen(){
        primaryTextViewComponent.primaryText.shouldHave(text("Data & Privacy"));
    }
}
