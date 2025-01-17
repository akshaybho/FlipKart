package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import utils.TestBase;

import java.io.IOException;

public class StepDefs extends TestBase {

    WebDriver driver;
    HomePage hp;
    TestBase testBase;
    LoginPage lp;
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
    public void validate_there_is_a_searchbox() throws InterruptedException {

       hp = new HomePage(driver);
       hp.ableToClickLogin();
        Thread.sleep(3000);
       //hp.clickOnLoginButton();
    }
    @Then("user clicks on login button")
    public void user_clicks_on_login_button() throws InterruptedException, IOException {
        lp = new LoginPage(driver);
        lp.loginButton();
        Thread.sleep(3000);
    }
    @Then("user validate the pageTitle")
    public void user_validate_the_page_title()
    {
        lp.readTitle();
    }


}
