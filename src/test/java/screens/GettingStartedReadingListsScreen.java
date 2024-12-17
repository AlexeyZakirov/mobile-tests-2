package screens;

import io.qameta.allure.Step;
import screens.components.GettingStartedPrimaryTextViewComponent;

import static com.codeborne.selenide.Condition.text;

public class GettingStartedReadingListsScreen {
    private final GettingStartedPrimaryTextViewComponent primaryTextViewComponent = new GettingStartedPrimaryTextViewComponent();
    @Step("Проверить главный текст страницы Getting Started - Reading Lists")
    public void checkPrimaryTextOnScreen(){
        primaryTextViewComponent.getPrimaryText().shouldHave(text("Reading lists with sync"));
    }
}
