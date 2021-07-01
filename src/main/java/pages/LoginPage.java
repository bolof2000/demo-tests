package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    private By usernameText = By.name("username");
    private By passwordText = By.id("password");
    private By loginButton = By.cssSelector("#login button");
    private By loginFailText = By.id("flash-messages");


    public SecureAreaPage login(String username,String password){
        driver.findElement(usernameText).sendKeys(username);
        driver.findElement(passwordText).sendKeys(password);
        driver.findElement(loginButton).click();
        return new SecureAreaPage(driver);
    }

    public String verifyFailedLoginAttempt(String username,String password){
        driver.findElement(usernameText).sendKeys(username);
        driver.findElement(passwordText).sendKeys(password);
       return driver.findElement(loginFailText).getText();

    }
}
