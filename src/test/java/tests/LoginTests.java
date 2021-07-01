package tests;

import com.github.javafaker.Faker;
import dockertest.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;
import pages.HomePage;
import pages.LoginPage;
import pages.SecureAreaPage;

public class LoginTests extends BaseTest {
    LoginPage loginPage;
    SecureAreaPage secureAreaPage;


    @Test
    public void UnsuccessfulLoginTest(){
        loginPage = homePage.clickFormAuth();
       String expected = loginPage.verifyFailedLoginAttempt("test01","bolof2k100");
        System.out.println(expected);
        Assert.assertFalse(expected.contains("Your username is invalid!"));
    }

    @Test
    public void successfulLoginTest(){
       loginPage =  homePage.clickFormAuth();
       secureAreaPage =  loginPage.login("tomsmith","SuperSecretPassword!");
       String expected = secureAreaPage.getSecureAreaText();
        System.out.println(expected);
       //Assert.assertTrue(expected.contains("You logged out of the secure area!x"));
       Assert.assertEquals(expected,"You logged into a secure area!\n" +
               "×");
    }
}
