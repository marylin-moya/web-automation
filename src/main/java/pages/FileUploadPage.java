package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage extends BasePage {

    private By inputUploadFile = By.id("file-upload");
    private By uploadButton = By.id("file-submit");

    public FileUploadPage(WebDriver driver) {
        super(driver);
    }

    public UploadedFilePage clickUploadButton() {
        driver.findElement(uploadButton).click();
        return new UploadedFilePage(driver);
    }

    public void selectFile(String path) {
        driver.findElement(inputUploadFile).sendKeys(path);
    }
}
