package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EntryAdPage extends BasePage {
    private By modal = By.cssSelector("div#modal");
    public EntryAdPage(WebDriver driver) {
        super(driver);
    }

    public boolean isModalDisplayed() {
        return driver.findElement(modal).isDisplayed();
    }
}
