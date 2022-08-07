import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    private WebDriver driver;

    @Before
    public void initDriver(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test");
    }
    @Test
    public void validLoginTest() {
        driver.findElement(By.cssSelector("a.skip-link.skip-account")).click();
        driver.findElement(By.cssSelector("a[href*=\"login\"]")).click();
        driver.findElement(By.id("email")).sendKeys(new CharSequence[]{"portiag@gmail.com"});
        driver.findElement(By.id("pass")).sendKeys(new CharSequence[]{"123456789"});
        driver.findElement(By.id("send2")).click();
        WebElement welcomeMessage = driver.findElement(By.cssSelector("p strong"));
        Assert.assertEquals("Hello, Portia Greenbottle!", welcomeMessage.getText());
    }


        @After
        public void closeDriver(){
            driver.quit();
    }
}
