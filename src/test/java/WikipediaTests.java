import org.junit.jupiter.api.Test;
import screens.*;
import screens.components.ContinueButtonComponent;
import screens.components.DoneButtonComponent;

public class WikipediaTests extends TestBase{
    private final ContinueButtonComponent continueButton = new ContinueButtonComponent();
    private final GettingStartedLanguagesScreen languagesScreen = new GettingStartedLanguagesScreen();
    private final GettingStartedExploreScreen exploreScreen = new GettingStartedExploreScreen();
    private final GettingStartedReadingListsScreen readingListsScreen = new GettingStartedReadingListsScreen();
    private final GettingStartedDataPrivacyScreen dataPrivacyScreen = new GettingStartedDataPrivacyScreen();
    private final DoneButtonComponent doneButton = new DoneButtonComponent();
    private final MainScreen mainScreen = new MainScreen();

    @Test
    public void gettingStartedTest(){
        languagesScreen.checkPrimaryTextOnScreen();
        continueButton.click();
        exploreScreen.checkPrimaryTextOnScreen();
        continueButton.click();
        readingListsScreen.checkPrimaryTextOnScreen();
        continueButton.click();
        dataPrivacyScreen.checkPrimaryTextOnScreen();
        doneButton.click();
        mainScreen.checkAnnoncementText();
    }

}
