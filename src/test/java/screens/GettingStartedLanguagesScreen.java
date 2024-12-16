package screens;

import io.qameta.allure.Step;
import screens.components.GettingStartedPrimaryTextViewComponent;

import static com.codeborne.selenide.Condition.text;

public class GettingStartedLanguagesScreen {
    GettingStartedPrimaryTextViewComponent primaryTextViewComponent = new GettingStartedPrimaryTextViewComponent();

    @Step("Проверить главный текст страницы Getting Started - Languages")
    public void checkPrimaryTextOnScreen(){
        primaryTextViewComponent.primaryText.shouldHave(text("The Free Encyclopedia"));
    }
}
