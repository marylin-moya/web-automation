import org.testng.annotations.Test;
import pages.EntryAdModal;
import pages.EntryAdPage;

import static org.testng.Assert.assertFalse;

public class ModalTests extends BaseTest {
    @Test
    public void testModal() {
        EntryAdModal entryAdModal = homePage.clickEntryAdPage();
        EntryAdPage entryAdPage = entryAdModal.closeModal();
        assertFalse(entryAdPage.isModalDisplayed(),"The Modal is displayed");
    }
}
