package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    private By formAuth = By.linkText("Form Authentication");


    public LoginPage clickFormAuth(){
        driver.findElement(formAuth).click();
        return new LoginPage(driver);
    }
}
