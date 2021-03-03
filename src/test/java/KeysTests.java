import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.KeyPressesPage;

import static org.testng.Assert.assertEquals;

public class KeysTests extends BaseTest {
    @Test
    public void testAltKey() {
        KeyPressesPage keyPressesPage = homePage.clickKeyPresses();
        keyPressesPage.typeText("sample" + Keys.ALT);
        assertEquals(keyPressesPage.getResult(), "You entered: ALT", "Wrong Key pressed");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testControlPlusAKeys() throws InterruptedException {
        KeyPressesPage keyPressesPage = homePage.clickKeyPresses();
        keyPressesPage.typeText("this text will be replaced");
        keyPressesPage.selectAll();
        keyPressesPage.typeText("new text");
        assertEquals(keyPressesPage.getResult(), "You entered: T", "Wrong Key pressed");
        assertEquals(keyPressesPage.getValue(), "new text", "Wrong Value typed");
    }
}
