package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {

        public WebDriver driver;

        public WebDriver WebDriverManager() throws IOException {
                Properties p = new Properties();
                FileInputStream input = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\data.properties");
                p.load(input);
                String Url = p.getProperty("baseUrl");

                if(driver == null) {
                        if (p.getProperty("browser").equalsIgnoreCase("chrome")) {
                                WebDriverManager.chromedriver().setup();
                                driver = new ChromeDriver();
                        } else {
                                WebDriverManager.firefoxdriver().setup();
                                driver = new FirefoxDriver();
                        }
                        driver.get(Url);
                        driver.manage().window().maximize();
                        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

                }
                return driver;
        }
}
