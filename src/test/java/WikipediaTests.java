import org.junit.jupiter.api.Test;
import screens.*;
import screens.components.GettingStartedComponent;

public class WikipediaTests extends TestBase{
    private final MainScreen mainScreen = new MainScreen();

    private final GettingStartedComponent gettingStartedComponent = new GettingStartedComponent();

    @Test
    public void gettingStartedTest(){
        gettingStartedComponent.checkPrimaryTextOnScreen("The Free Encyclopedia")
                .clickContinueButton()
                .checkPrimaryTextOnScreen("New ways to explore")
                .clickContinueButton()
                .checkPrimaryTextOnScreen("Reading lists with sync")
                .clickContinueButton()
                .checkPrimaryTextOnScreen("Data & Privacy")
                .clickDoneButton();
        mainScreen.checkAnnoncementText("Customize your Explore feed");
    }

}
