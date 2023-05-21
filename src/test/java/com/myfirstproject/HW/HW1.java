package com.myfirstproject.HW;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.List;

public class HW1 {

    /*
    Go to ebay page
    Click on electronics section
    Click on all the images with a Width of 225 and a Length of 225
    Print the page title of each page
    Close the page
     */

    static WebDriver driver;
    static List<WebElement> products;

    @BeforeClass
    public static void setUp() throws Exception {
        WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test
    public void test01() throws InterruptedException {
        //Go to ebay page
        driver.get("https://ebay.com");

        //Click on electronics section
        driver.findElement(By.xpath("(//*[text()='Electronics'])[2]")).click();

        //Click on all the images with a Width of 225 and a Length of 225
        //Print the page title of each page
        products = driver.findElements(By.xpath("//*[@width='225' and @height='225']"));
        for (int i = 0; i < products.size(); i++) {
            products = driver.findElements(By.xpath("//*[@width='225' and @height='225']"));
            products.get(i).click();
            Thread.sleep(2000);
            System.out.println(i + 1 + ". title: " + driver.getTitle());
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
        }

    }

    @AfterClass
    public static void afterClass() {
        driver.close();
    }
}