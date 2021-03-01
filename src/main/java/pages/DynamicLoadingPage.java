package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage extends BasePage {
    private By firstExample = By.xpath("//a[contains(text(),'Example 1')]");

    public DynamicLoadingPage(WebDriver driver) {
        super(driver);
    }

    public DynamicLoadingExample1Page clickExample1() {
        driver.findElement(firstExample).click();
        return new DynamicLoadingExample1Page(driver);
    }
}
