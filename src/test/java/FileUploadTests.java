import org.testng.annotations.Test;
import pages.FileUploadPage;
import pages.UploadedFilePage;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTest {
    @Test
    public void testFileUpload() throws InterruptedException {
        FileUploadPage fileUploadPage = homePage.clickFileUploadPage();
        Thread.sleep(5000);
        fileUploadPage.selectFile("D:\\web-automation\\web-automation\\src\\test\\resources\\image1.png");
        Thread.sleep(5000);
        UploadedFilePage uploadedFilePage = fileUploadPage.clickUploadButton();
        Thread.sleep(5000);
        assertEquals(uploadedFilePage.getMessage(),"File Uploaded!");
        assertEquals(uploadedFilePage.getFile(),"image1.png");
    }
}
