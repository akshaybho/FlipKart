package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    @FindBy(xpath ="//header[@class='_3EOQ5Q']")
    WebElement header;
    @FindBy(xpath = "//span[text()='Login']")
    WebElement loginText;
    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void loginButton() throws InterruptedException {

         WebElement button = header.findElement(By.xpath("//div[@class='H6-NpN _3N4_BX']/a"));
         button.click();
         Thread.sleep(3000);
    }

    public void readTitle()
    {
        String text = loginText.getText();
        System.out.println(text);
    }
}
