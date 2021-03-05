package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditorPage extends BasePage{
    private String editorFrameID = "mce_0_ifr";
    private By textArea = By.id("tinymce");

    public EditorPage(WebDriver driver) {
        super(driver);
    }

    public void switchToEditFrame() {
        driver.switchTo().frame(editorFrameID);
    }
    public void switchToParent() {
        driver.switchTo().parentFrame();
    }

    public void clearTextArea(){
        System.out.println("Clear Text Area");
        switchToEditFrame();
        driver.findElement(textArea).clear();
        switchToParent();
    }

    public void typeText(String text){
        System.out.println("Type Text");
        switchToEditFrame();
        driver.findElement(textArea).sendKeys(text);
        switchToParent();
    }
    public String getText(){
        System.out.println("Get Text");
        switchToEditFrame();
        String text = driver.findElement(textArea).getText();
        switchToParent();
        return text;
    }
}
