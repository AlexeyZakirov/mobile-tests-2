package screens;

import io.qameta.allure.Step;
import screens.components.GettingStartedPrimaryTextViewComponent;

import static com.codeborne.selenide.Condition.text;

public class GettingStartedLanguagesScreen {
    private final GettingStartedPrimaryTextViewComponent primaryTextViewComponent = new GettingStartedPrimaryTextViewComponent();

    @Step("Проверить главный текст страницы Getting Started - Languages")
    public void checkPrimaryTextOnScreen(){
        primaryTextViewComponent.getPrimaryText().shouldHave(text("The Free Encyclopedia"));
    }
}
