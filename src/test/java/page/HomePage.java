package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = "a.skip-link.skip-account")
    private WebElement accountLink;

    @FindBy(css = "a[href*=\"login\"]")
    private WebElement loginLink;

    @FindBy(id = "search")
    private WebElement searchField;

    @FindBy(css = ".search-button")
    private WebElement searchButton;

    public void clickAccountLink(){
        accountLink.click();
    }

    public void clickLoginLink(){
        loginLink.click();
    }

    public void setSearchField(String value){
        searchField.sendKeys(value);
    }

    public void clickSearchButton(){
        searchButton.click();
    }
}
