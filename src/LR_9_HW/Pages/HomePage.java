package LR_9_HW.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage {
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    WebDriver driver;
    //String emailInputID = "";
    String emailInputXpath = "//*[@id='loginForm']//child::*[@name='email']";
    String passwordInputXpath = "//*[@id='loginForm']//child::*[@name='password']";
    String sendButtonXpath = "//*[@id='loginForm']//child::*[@data-element='send']";
    String profileNameXpath = "//*[@data-a-target='topmenu-account']";

    public void enterEmail(String email) {
        driver.findElement(By.xpath(emailInputXpath)).sendKeys(email);
    }
    public void enterPassword(String password) {
        driver.findElement(By.xpath(passwordInputXpath)).sendKeys(password);
    }
    public void clickSendButton() {
        driver.findElement(By.xpath(sendButtonXpath)).sendKeys(Keys.ENTER);
    }
    public boolean atPage(){
        return  driver.findElement(By.xpath(profileNameXpath)).isDisplayed();
    }


}