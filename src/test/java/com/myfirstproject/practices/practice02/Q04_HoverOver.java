package com.myfirstproject.practices.practice02;

import com.aventstack.extentreports.gherkin.model.And;
import com.aventstack.extentreports.gherkin.model.Then;
import com.google.common.base.Verify;
import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.security.PublicKey;

public class Q04_HoverOver extends TestBase {

             /*
        Given
             Go to https://www.gmibank.com/
        When
             Hover over "Premium" Deposit Package
        And
             Click on "Book Now"
        Then
             Verify url contains "services"
         */

    @Test
    public void test(){

//        Go to https://www.gmibank.com/

        driver.get("https://www.gmibank.com/");

//        Hover over "Premium" Deposit Package

        WebElement premium = driver.findElement(By.xpath("//h4[.='Premium']"));
        new Actions(driver).moveToElement(premium).perform();

//        Click on "Book Now"

        driver.findElement(By.xpath("(//a[.='Book Now'])[2]")).click();

//        Verify url contains "services"

        String actualUrl = driver.getCurrentUrl();
        Assert.assertTrue(actualUrl.contains("services"));


    }



}
