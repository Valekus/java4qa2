package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
public class LoginPage {
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    WebDriver driver;
    //String emailInputID = "";
    String emailInputXpath = "//*[@id='loginForm']//child::*[@name='email']";
    String passwordInputXpath = "//*[@id='loginForm']//child::*[@name='password']";
    String sendButtonXpath = "//*[@id='loginForm']//child::*[@data-element='send']";
    public void enterEmail(String email) {
        driver.findElement(By.xpath(emailInputXpath)).sendKeys(email);
    }
    public void enterPassword(String password) {
        driver.findElement(By.xpath(passwordInputXpath)).sendKeys(password);
    }
    public void clickSendButton() {
        driver.findElement(By.xpath(sendButtonXpath)).sendKeys(Keys.ENTER);
    }
}