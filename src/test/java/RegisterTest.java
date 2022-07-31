import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {
    public RegisterTest() {
    }

    public void validRegisterTest() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        driver.get("http://testfasttrackit.info/selenium-test");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();
        driver.findElement(By.id("firstname")).sendKeys(new CharSequence[]{"Portia"});
        driver.findElement(By.id("lastname")).sendKeys(new CharSequence[]{"Greenbottle"});
        driver.findElement(By.id("email_address")).sendKeys(new CharSequence[]{"portiag@gmail.com"});
        driver.findElement(By.id("password")).sendKeys(new CharSequence[]{"123456789"});
        driver.findElement(By.id("confirmation")).sendKeys(new CharSequence[]{"123456789"});
        driver.findElement(By.id("is_subscribed")).click();
        driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button > span > span")).click();
        js.executeScript("window.scrollBy(0,1000)", new Object[0]);
        driver.quit();
    }
}