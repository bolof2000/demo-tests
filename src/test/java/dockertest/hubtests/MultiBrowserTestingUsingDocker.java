package dockertest.hubtests;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class MultiBrowserTestingUsingDocker {


    @Test
    public void testBrowser01() throws MalformedURLException {

        DesiredCapabilities dc = DesiredCapabilities.firefox();

        URL url = new URL("http://localhost:4444/wd/hub");
        RemoteWebDriver driver = new RemoteWebDriver(url,dc);
        driver.get("https://opensource-demo.orangehrmlive.com/");

        System.out.println(driver.getTitle());
        driver.quit();
    }


    @Test
    public void testBrowser2() throws MalformedURLException {

        DesiredCapabilities dc = DesiredCapabilities.firefox();

        URL url = new URL("http://localhost:4444/wd/hub");
        RemoteWebDriver driver = new RemoteWebDriver(url,dc);
        driver.get("https://www.google.com/");

        System.out.println(driver.getTitle());
        driver.quit();
    }


    @Test
    public void testBrowser3() throws MalformedURLException {

        DesiredCapabilities dc = DesiredCapabilities.firefox();

        URL url = new URL("http://localhost:4444/wd/hub");
        RemoteWebDriver driver = new RemoteWebDriver(url,dc);
        driver.get("https://the-internet.herokuapp.com/");

        System.out.println(driver.getTitle());
        driver.quit();
    }



}
