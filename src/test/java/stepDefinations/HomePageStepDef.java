package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pageObjects.HomePage;
import utils.TestBase;

import java.io.IOException;

public class HomePageStepDef extends TestBase {

    WebDriver driver;
    HomePage hp;
    TestBase testBase;
    @Given("user enters url")
    public void user_enters_url() throws IOException, InterruptedException {

        testBase = new TestBase();
        driver = testBase.WebDriverManager();
        Thread.sleep(3000);
    }
    @Then("user is landes on home page")
    public void user_is_landes_on_home_page() throws InterruptedException {

        String title = driver.getTitle();
        System.out.println(title);
        Thread.sleep(3000);

    }
    @And("validate there is a searchbox")
    public void validate_there_is_a_searchbox() {

       hp = new HomePage(driver);
       hp.ableToClickLogin();
    }

}
