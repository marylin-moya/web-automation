package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UploadedFilePage extends BasePage {
    private By message = By.cssSelector("div h3");
    private By file = By.id("uploaded-files");

    public UploadedFilePage(WebDriver driver) {
        super(driver);
    }

    public String getMessage() {
        return driver.findElement(message).getText();
    }

    public String getFile() {
        return driver.findElement(file).getText();
    }
}
