package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Orange_Login {
    public static void invisibilityOfElementLocated(int time, By by) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }
    public static void TypeText(By by,String text){driver.findElement(by).sendKeys(text);}
    public static void Click(By by){driver.findElement(by).click();}
    protected static WebDriver driver;
    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver","src/test/java/chromedriver.exe");
        //open chrome browser
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        //type url
        driver.get("https://opensource-demo.orangehrmlive.com/");

        //enter username
        // invisibilityOfElementLocated(1000,(By.name("txtUsername")));
        TypeText(By.name("txtUsername"),"Admin");

        //enter password
        TypeText(By.name("txtPassword"),"admin123");

        //click on login
        Click(By.name("Submit"));

//        //click on admin on main page
//        Click(By.className("firstLevelMenu"));
//
//        //enter username
//        TypeText(By.name("searchSystemUser[userName]"),"adash");
//
//        //enter user role
//        Click(By.xpath("//select[@name=\"searchSystemUser[userType]\"]/option[3]"));
//
//        //enter employee name
//        TypeText(By.className("ac_input"),"Ananya Dash");
//
//        //enter status
//        Click(By.xpath("//select[@name=\"searchSystemUser[status]\"]/option[2]"));
//
//        //click on search button
//        Click(By.className("searchbutton"));
//
//        //click on user name adash
//        Click(By.xpath("//a[.=\"adash\"]"));
//
//        //click on user role and select admin
//        Click(By.xpath("//a[.=\"Admin\"]"));
//
//        //click on save button
//        Click(By.name("btnSave"));

    }
}
