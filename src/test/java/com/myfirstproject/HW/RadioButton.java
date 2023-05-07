package com.myfirstproject.HW;

import com.github.javafaker.Faker;
import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RadioButton extends TestBase {

    /*
    Create a class : RadioButton Complete the following task.
    Go to https:// www.facebook.com/
    Click on Create an Account button
    Locate the elements of radio buttons
    Then click on the radio buttons for your gender if they are not selected
     */

    @Test
    public void radioButtonTest() {

        //Go to https:// www.facebook.com/

        driver.get("https://www.facebook.com/");

        //Click on Create an Account button

        driver.findElement(By.xpath("//button[@title='Decline optional cookies']")).click();
        driver.findElement(By.linkText("Create new account")).click();

        //Enter first name
        Faker faker = new Faker();
        String firstName = faker.name().firstName();
        driver.findElement(By.name("firstname")).sendKeys(firstName);

        //Enter last name
        String lastName = faker.name().firstName();
        driver.findElement(By.name("lastname")).sendKeys(lastName);

        //Enter mobile number or email
        String email = firstName+lastName+"@gmail.com";
        driver.findElement(By.name("reg_email__")).sendKeys(email);
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys(email);

        //Enter new password
        driver.findElement(By.id("password_step_input")).sendKeys(faker.internet().password());

        //Enter birthday

        WebElement day = driver.findElement(By.name("birthday_day"));
        Select optionsDay = new Select(day);
        int dayFake = faker.number().numberBetween(1, 28);
        optionsDay.selectByValue("8");

        WebElement month = driver.findElement(By.name("birthday_month"));
        Select optionsMonth = new Select(month);
        optionsMonth.selectByValue("8");

        WebElement year = driver.findElement(By.name("birthday_year"));
        Select optionsYear = new Select(year);
        optionsYear.selectByValue("1988");

        //Enter gender

        driver.findElement(By.xpath("//input[@value='1']")).click();

        //Click Sign Up

        driver.findElement(By.name("websubmit")).click();









    }


}