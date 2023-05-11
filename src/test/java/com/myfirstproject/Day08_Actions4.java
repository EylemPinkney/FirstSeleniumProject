package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Day08_Actions4 extends TestBase {

    /*
    Create a class: Action4
    Create a method dragAndDropTest
    Given user is on https://jqueryui.com/droppable/
    And user moves the target element(Drag me to my target) in to destination(Drop here)
     */

    @Test
    public void dragAndDropTest() throws InterruptedException {
        //    Given user is on https://jqueryui.com/droppable/
        driver.get("https://jqueryui.com/droppable/");
        //    And user moves the target element(Drag me to my target) in to destination(Drop here)
        driver.switchTo().frame(0);
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
//        we will move the source in the target so we should use actions class
        Actions actions = new Actions(driver);
        actions.dragAndDrop(source,target).perform();//dragAndDrop moves the element from one place to another
    }

    @Test
    public void dragAndDropByTest(){
        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(0);
        WebElement source = driver.findElement(By.id("draggable"));
        Actions actions = new Actions(driver);

        actions.dragAndDropBy(source,401,138).perform();

        /*
        Drag and Drop by doesnt need a target. When you have a source, you can put x and y offsets of the target location, add perform, it will go to
        the target location.
         */
    }

    @Test
    public void clickAndHoldTest(){
        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(0);
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
        Actions actions = new Actions(driver);

        actions
                .clickAndHold(source)
                .moveToElement(target)
                .build().perform();


    }



}