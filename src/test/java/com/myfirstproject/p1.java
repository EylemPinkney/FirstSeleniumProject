package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class p1 extends TestBase {

    //    https://testcenter.techproeducation.com/index.php?page=radio-buttons
//    Click on Red
//    Click on Football

    @Test
    public void selectByIndexTest() {
//Go to https://testcenter.techproeducation.com/index.php?page=dropdown
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");
//1.Create method selectByIndexTest and Select Option 1 using index
//        1. locating the dropdown
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown']"));

//        2. create a select object
        Select options = new Select(dropdown);

//        3. use select object to select your option
        options.selectByIndex(1);

    }


        @Test
        public void selectByValue(){
            driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");




        }




    }
