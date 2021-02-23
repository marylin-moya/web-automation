import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseTest {
    private WebDriver driver;

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();

        // Print links quantity
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());

        // Click on Inputs Link
        WebElement inputsLink = driver.findElement(By.linkText("Inputs"));
        inputsLink.click();

        driver.quit();
    }

    public static void main(String args[]) {
        BaseTest baseTest = new BaseTest();
        baseTest.setUp();
    }
}