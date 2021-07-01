package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {

    private WebDriver driver;
    public SecureAreaPage(WebDriver driver) {
        this.driver = driver;
    }

    private By secureAreaText = By.id("flash-messages");

    public String getSecureAreaText(){

        return driver.findElement(secureAreaText).getText();

    }
}
