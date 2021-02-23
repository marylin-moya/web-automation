import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    private WebDriver driver;

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        //driver.manage().window().maximize();                          //Maximize window
        //driver.manage().window().fullscreen();                        //Fullscreen mode
        //driver.manage().window().setSize(new Dimension(300, 700));    //Specific size

        System.out.println(driver.getTitle());                          //Print page title
        driver.quit();                                                  //Close Browser/Driver
    }

    public static void main(String args[]) {
        BaseTest baseTest = new BaseTest();
        baseTest.setUp();
    }
}