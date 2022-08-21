package test;

import org.junit.Assert;
import org.junit.Test;

public class LoginTest extends BaseTest{


    @Test
    public void validLoginTest(){
        homePage.clickLoginLink();
        homePage.clickLoginLink();
        loginPage.setEmailField(userEmail);
        loginPage.setPasswordField(userPass);
        loginPage.clickLoginButton();
        Assert.assertEquals("Hello, "+userName+"!", accountPage.getWelcomeText());

    }
}

