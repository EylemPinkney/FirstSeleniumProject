package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class Day09_Authentication extends TestBase {


    @Test

    public void authTest (){

        /*
        username : admin
        password : admin
        url : the-internet.herokuapp.com/basic_auth

        Auth are used for security reason
        One way to auth is to use below syntax:
        https://username:password@URL

        URL FOR AUTH:
        https://admin:admin@the-internet.herokuapp.com/basic_auth
         */

        //This will auth the page

        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

        String actualLoginText = driver.findElement(By.xpath("//div[@id='content']//p")).getText();
        Assert.assertTrue(actualLoginText.contains("Congratulations!"));
    }
}
