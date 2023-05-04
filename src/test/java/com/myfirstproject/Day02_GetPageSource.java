package com.myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.sound.midi.Soundbank;
import java.time.Duration;

public class Day02_GetPageSource {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();//set up
        WebDriver driver = new ChromeDriver();//create chrome driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//implicit wait
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");
        String pageSource = driver.getPageSource();
        if(pageSource.contains("Registry")){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println(pageSource + "NoT TherE");
        }
        driver.quit();

    }
}
