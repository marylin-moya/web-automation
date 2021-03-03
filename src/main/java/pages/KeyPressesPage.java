package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage extends BasePage {
    public KeyPressesPage(WebDriver driver) {
        super(driver);
    }

    private By input = By.id("target");
    private By result = By.id("result");

    public void typeText(String text) {
        driver.findElement(input).sendKeys(text);
    }

    public void selectAll() {
        typeText(Keys.chord(Keys.CONTROL,"A"));
    }

    public String getResult() {
        return driver.findElement(result).getText();
    }
    public String getValue(){
        return driver.findElement(input).getAttribute("value");
    }
}
