package com.myfirstproject.practices.practice02;

import com.aventstack.extentreports.gherkin.model.Given;
import com.aventstack.extentreports.gherkin.model.Then;
import com.google.common.base.Verify;
import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class Q03_Alert extends TestBase {

         /*
        Given
            Go to "http://webdriveruniversity.com/Popup-Alerts/index.html"
        When
            Click "CLICK ME" of JavaScript Alert
        And
            Get the Alert text
        Then
            Verify that message is "I am an alert box!"
        When
            Accept Alert
         */

    @Test

    public void test() throws InterruptedException {


//        Go to "http://webdriveruniversity.com/Popup-Alerts/index.html"

        driver.get("http://webdriveruniversity.com/Popup-Alerts/index.html");
        Thread.sleep(2000);

//        Click "CLICK ME" of JavaScript Alert

        driver.findElement(By.id("button1")).click();
        Thread.sleep(2000);

//        Get the Alert text

       String actualText =  driver.switchTo().alert().getText();
        Thread.sleep(2000);

//        Verify that message is "I am an alert box!"

        Assert.assertEquals("I am an alert box!", actualText);
        Thread.sleep(2000);

//        Accept Alert

        driver.switchTo().alert().accept();
    }
}
