import org.testng.annotations.Test;
import pages.EditorPage;

import static org.testng.Assert.assertEquals;

public class FrameTests extends BaseTest{
    @Test
    public void testFrame(){
        EditorPage editorPage = homePage.clickEditorPage();

        editorPage.clearTextArea();
        String text1 = "Good Morning";
        editorPage.typeText(text1);

        assertEquals(editorPage.getText(), text1, "Incorrect text");
    }
}
