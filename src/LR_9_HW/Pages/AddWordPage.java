package LR_9_HW.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class AddWordPage {
    public AddWordPage(WebDriver driver) {
        this.driver = driver;
    }
    WebDriver driver;
    //String emailInputID = "";
    String wordSearchXpath = "//*[@id='loginForm']//child::*[@data-a-target = 'topmenu-dict']";
    String searchFieldName = "//*[@id='loginForm']//child::*[@name='search']";
    String addButton = "//*[@button='data-search-submit']";
    String addTranslateId = "//*[@data-tran-id='260945']";

    public void goToSearchPage() {
        driver.findElement(By.xpath(wordSearchXpath)).sendKeys(Keys.ENTER);
    }
    public void serchField(String someWord) {
        driver.findElement(By.xpath(searchFieldName)).sendKeys(someWord);
    }
    public void clickSearchButton() {
        driver.findElement(By.xpath(addButton)).sendKeys(Keys.ENTER);
    }
    public void clickTranslateButton() {
        driver.findElement(By.xpath(addTranslateId)).sendKeys(Keys.ENTER);
    }
    /*public boolean atPage(){
        return  driver.findElement(By.xpath(profileNameXpath)).isDisplayed();
    }*/


}