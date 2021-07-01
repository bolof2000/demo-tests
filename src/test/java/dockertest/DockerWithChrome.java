package dockertest;

import com.github.javafaker.Faker;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class DockerWithChrome {


    public static void main(String[] args) throws MalformedURLException {

        Faker faker = new Faker();
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String phoneNumber = faker.phoneNumber().cellPhone();
        String any = faker.finance().creditCard();
        String financeee = faker.finance().iban();

        System.out.println(financeee+" "+ lastName +" "+ phoneNumber+ " "+any+" "+ financeee);





        DesiredCapabilities dc = DesiredCapabilities.chrome();

        URL url = new URL("http://localhost:4444/wd/hub");
        RemoteWebDriver driver = new RemoteWebDriver(url,dc);
        driver.get("https://opensource-demo.orangehrmlive.com/");

        System.out.println(driver.getTitle());
        driver.quit();
    }
}
