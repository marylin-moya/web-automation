import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecurePage;

import static org.testng.Assert.*;
public class LoginTests extends BaseTest {

    @Test
    public void testLogin() {
        LoginPage loginPage = homePage.clickFormAuthentication();

        loginPage.setUserName("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecurePage securePage = loginPage.clickLoginButton();

        assertTrue(securePage.getMessageText().contains("You logged into a secure area!"),"Incorrect Message");
    }
}
