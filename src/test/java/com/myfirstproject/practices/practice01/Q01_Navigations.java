package com.myfirstproject.practices.practice01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q01_Navigations {

    public static void main(String[] args) {

        // Set Driver Path

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // Create chrome driver object
        // Maximize the window
        // Open google home page https://www.google.com/
        // Navigate to techproeducation home page https://techproeducation.com/
        // Navigate back to google
        // Navigate forward to techproeducation
        // Refresh the page
        // Close/Quit the browser
        // And last step : print "ALL OK" on console


    }
}
