package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public  class Add_Delete_Functionality extends Utils {


    public static void main(String[] args){
        openBrowser();
        //enter username
        // invisibilityOfElementLocated(1000,(By.name("txtUsername")));
        TypeText(By.name("txtUsername"),"Admin");

        //enter password
        TypeText(By.name("txtPassword"),"admin123");

        //click on login
        Click(By.name("Submit"));

       //click on admin on main page
       Click(By.className("firstLevelMenu"));

       //click on job page
        Click(By.id("menu_admin_Job"));

        //click on job title category
        Click(By.id("menu_admin_viewJobTitleList"));

        //verify that we on job title page
        String expectedMessage = "Job Titles";

        String actualMessage = gettextFromElement(By.className("head"));
       // System.out.println(actualMessage);
       if (expectedMessage.equals(actualMessage)) {

            System.out.println("The test case is pass");
        } else {
            System.out.println("The test case is Fail");
        }
       //click on add button
       Click(By.name("btnAdd"));

       //send text in job title
        TypeText(By.name("jobTitle[jobTitle]"),"HRM"+randomDate()+ "Manager");

        //send text in job description
        TypeText(By.name("jobTitle[jobDescription]"),"5 Years of experience, Hard working. ");

        //send text in note
        TypeText(By.name("jobTitle[note]"),"Person should be able to start as soon as possible");

        //click on save button
        Click(By.id("btnSave"));
        if(gettextFromElement(By.xpath("//*[@id=\"frmList_ohrmListComponent\"]/div[2]")).contains( "Successfully Saved")){
            System.out.println("The test case is pass");
        }else{
            System.out.println("The test case is fail");
        }
    }
}
