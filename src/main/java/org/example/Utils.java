package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class Utils {
    protected static WebDriver driver;

    public static void openBrowser(){

        System.setProperty("webdriver.chrome.driver","src/test/java/chromedriver.exe");
        //open chrome browser
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        //type url
        driver.get("https://opensource-demo.orangehrmlive.com/");


    }


    public static void invisibilityOfElementLocated(int time, By by) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }
    //parameterized method to get text for verification purpose
    public static String gettextFromElement(By by) {
        return driver.findElement(by).getText();
    }
    public  static void TypeText(By by,String text){driver.findElement(by).sendKeys(text);}
    public static void Click(By by){driver.findElement(by).click();}

    public static String randomDate() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyyHHmmss");
        return formatter.format(date);
    }

}
