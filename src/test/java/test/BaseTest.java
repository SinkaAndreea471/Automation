package test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.AccountPage;
import page.HomePage;
import page.LoginPage;

public class BaseTest {
    public String userEmail = "portiag@gmail.com";
    public String userPass = "123456789";
    public String userName = "Portia Greenbottle";

    // driver
    public WebDriver driver;
    // page objects
    public HomePage homePage;
    public LoginPage loginPage;
    public AccountPage accountPage;


    @Before

    public void initDriver() {
        // init driver
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        //init page objects
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        accountPage = new AccountPage(driver);
;

        // navigate to homepage
        driver.get("http://testfasttrackit.info/selenium-test");
    }

    public void wait(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @After
    public void closeDriver() {
        driver.quit();
    }

}