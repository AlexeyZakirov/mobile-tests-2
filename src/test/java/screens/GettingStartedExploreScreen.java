package screens;

import io.qameta.allure.Step;
import screens.components.GettingStartedPrimaryTextViewComponent;

import static com.codeborne.selenide.Condition.text;

public class GettingStartedExploreScreen {
    GettingStartedPrimaryTextViewComponent primaryTextViewComponent = new GettingStartedPrimaryTextViewComponent();
    @Step("Проверить главный текст страницы Getting Started - Explore")
    public void checkPrimaryTextOnScreen(){
        primaryTextViewComponent.primaryText.shouldHave(text("New ways to explore"));
    }
}
