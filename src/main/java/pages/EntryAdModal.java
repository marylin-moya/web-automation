package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EntryAdModal extends BasePage {
    private By close = By.cssSelector("div .modal-footer p");
    private By displayedModal = By.cssSelector("div#modal[style='display: block;']");
    private By hiddenModal = By.cssSelector("div#modal[style='display: none;']");
    public EntryAdModal(WebDriver driver) {
        super(driver);
    }

    public EntryAdPage closeModal() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(displayedModal));

        WebElement closeElement = driver.findElement(close);
        closeElement.click();

        wait.until(ExpectedConditions.presenceOfElementLocated(hiddenModal));
        return new EntryAdPage(driver);
    }
}
