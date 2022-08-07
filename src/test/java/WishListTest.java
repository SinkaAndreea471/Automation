import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WishListTest {
    private WebDriver driver;

    @Before
    public void initDriver(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test");
        driver.findElement(By.cssSelector("a.skip-link.skip-account")).click();
        driver.findElement(By.cssSelector("a[href*=\"login\"]")).click();
        driver.findElement(By.id("email")).sendKeys(new CharSequence[]{"portiag@gmail.com"});
        driver.findElement(By.id("pass")).sendKeys(new CharSequence[]{"123456789"});
        driver.findElement(By.id("send2")).click();
        WebElement welcomeMessage = driver.findElement(By.cssSelector("p strong"));
        Assert.assertEquals("Hello, Portia Greenbottle!", welcomeMessage.getText());
    }

    @Test
    public void validAddToWishListTest() {
        driver.findElement(By.cssSelector("li.level0.nav-5.parent > a.level0.has-children")).click();
        driver.findElement(By.cssSelector("li.item.last a.product-image")).click();
        driver.findElement(By.cssSelector("a.link-wishlist")).click();
        WebElement addToWishlistMessage = driver.findElement(By.cssSelector("li.success-msg span"));
        Assert.assertEquals("Slim fit Dobby Oxford Shirt has been added to your wishlist. Click here to continue shopping.", addToWishlistMessage.getText());
    }

    @After
    public void closeDriver(){
        driver.quit();
    }
}