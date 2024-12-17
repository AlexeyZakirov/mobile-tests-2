package screens.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class GettingStartedPrimaryTextViewComponent {
    private final SelenideElement primaryText = $(id("org.wikipedia.alpha:id/primaryTextView"));

    public SelenideElement getPrimaryText() {
        return primaryText;
    }
}
