package dockertest.base;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;
import pages.HomePage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    private  RemoteWebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setup() throws MalformedURLException {
        // driver setup

        DesiredCapabilities dc = DesiredCapabilities.firefox();

        URL url = new URL("http://localhost:4444/wd/hub");
        driver = new RemoteWebDriver(url,dc);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
    }

    @BeforeMethod
    public void launchUrl(){
        driver.get("https://the-internet.herokuapp.com/");
        homePage = new HomePage(driver);
    }

    @AfterClass
    public void tearDown(){
        driver.close();
    }
}
