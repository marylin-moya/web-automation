import org.testng.annotations.Test;
import pages.DynamicLoadingExample1Page;
import pages.DynamicLoadingPage;

import static org.testng.Assert.assertEquals;

public class WaitTests extends BaseTest {
    @Test
    public void testWaitUntilLoadingIsHidden() {
        DynamicLoadingPage dynamicLoadingPage = homePage.clickDynamicLoadingPage();
        DynamicLoadingExample1Page dynamicLoadingExample1Page = dynamicLoadingPage.clickExample1();
        dynamicLoadingExample1Page.clickStartButton();
        assertEquals(dynamicLoadingExample1Page.getLoadedText(), "Hello World!", "Loaded text is incorrect");
    }
}
