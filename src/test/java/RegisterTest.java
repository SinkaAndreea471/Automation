import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {
    private WebDriver driver;

    @Before
    public void initDriver(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test");
    }
    @Test
    public void validRegisterTest() {
        driver.findElement(By.cssSelector("a.skip-link.skip-account")).click();
        driver.findElement(By.cssSelector("a[href*=\"create\"]")).click();
        driver.findElement(By.id("firstname")).sendKeys(new CharSequence[]{"Porti"});
        driver.findElement(By.id("lastname")).sendKeys(new CharSequence[]{"Greenbttle"});
        driver.findElement(By.id("email_address")).sendKeys(new CharSequence[]{"poriag@gmail.com"});
        driver.findElement(By.id("password")).sendKeys(new CharSequence[]{"13456789"});
        driver.findElement(By.id("confirmation")).sendKeys(new CharSequence[]{"13456789"});
        driver.findElement(By.id("is_subscribed")).click();
        driver.findElement(By.cssSelector("div.buttons-set button.button")).click();
        WebElement welcomeMessage = driver.findElement(By.cssSelector("p strong"));
        Assert.assertEquals("Hello, Porti Greenbttle!", welcomeMessage.getText());
    }
    @After
    public void closeDriver(){
        driver.quit();
    }
}