import org.testng.annotations.Test;
import pages.DropdownPage;


import static org.testng.Assert.assertTrue;

public class DropdownTest extends BaseTest {
    @Test
    public void testDropdown() {
        DropdownPage dropdownPage = homePage.clickDropdown();
        dropdownPage.SelectDropdownOption("Option 1");

    }
}
