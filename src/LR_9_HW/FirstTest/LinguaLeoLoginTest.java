package FirstTest;

import LR_9_HW.Pages.HomePage;
import Pages.LoginPage;
import LR_9_HW.Pages.AddWordPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LinguaLeoLoginTest {

@Test
    public void LinguaLeoLoginTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\server\\chromedriver.exe");
        WebDriver driver = new ChromeDriver( );
        LoginPage loginPage = new LoginPage(driver);

        driver.get("https://lingualeo.com/ru");
        driver.findElement(By.id("headEnterBtn")).click();

        loginPage.enterEmail("Valekus777fortech@gmail.com");
        loginPage.enterPassword("10293847q");
        loginPage.clickSendButton();

        try{
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    HomePage homePage = new HomePage(driver);
    assertEquals(homePage.atPage(), false , "If false we can use this massage");






    driver.get("https://lingualeo.com/ru/glossary/learn/dictionary");
    try{
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    /*AddWordPage addWordPage = new AddWordPage(driver);
    //addWordPage.goToSearchPage();
    addWordPage.serchField("some");
    try{
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    addWordPage.clickSearchButton();

    try{
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    addWordPage.clickTranslateButton();*/



}



}
