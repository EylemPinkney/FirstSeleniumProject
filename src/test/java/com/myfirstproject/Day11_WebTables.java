package com.myfirstproject;

import com.github.dockerjava.api.model.Driver;
import com.github.dockerjava.api.model.Task;
import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.sql.SQLOutput;
import java.util.List;

public class Day11_WebTables extends TestBase {


    //    Task 5 : Write a method that accepts 2 parameters
//    Parameter 1 = row number
//    Parameter 2 = column number
//    printData(2,3);  => prints data in 2nd row 3rd column
    @Test
    public void printTable(){
        //    Task 1 : Print the entire table
        driver.get("https://the-internet.herokuapp.com/tables");
        extentTest.pass("******PRINT ENTIRE TABLE****");
        String entireTable = driver.findElement(By.xpath("//table[@id='table1']")).getText();
        System.out.println(entireTable);
//        ALTERNATIVELY
        List<WebElement> elements = driver.findElements(By.xpath("//table[@id='table1']//td"));
        for (WebElement eachData : elements){
            System.out.println(eachData.getText());
            extentTest.pass(eachData.getText());
        }


//        GET SPECIFIC INDEXED ELEMENTS
        System.out.println("6TH DATA IN THE TABLE =>>> "+elements.get(5).getText());
    }
    //    Task 2 : Print All Rows
    @Test
    public void printAllRows(){
        driver.get("https://the-internet.herokuapp.com/tables");
        List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='table1']//tr"));
        int rowNum=1;
        for (WebElement eachRow : allRows){
            System.out.println(rowNum + " :  "+eachRow.getText());
            rowNum++;
        }
        System.out.println("2ND ROW DATA : "+allRows.get(1).getText());

        //    Task 3 : Print Last row data only
        System.out.println("LAST ROW DATA : "+allRows.get(allRows.size()-1).getText());
    }
    //    Task 4 : Print column 5 data in the table body
    @Test
    public void printColumns() {
        driver.get("https://the-internet.herokuapp.com/tables");
        List<WebElement> col5Data = driver.findElements(By.xpath("//table[@id='table1']//tr//td[5]"));
        int colNum = 1;
        for (WebElement eachData : col5Data) {
            System.out.println(colNum + " : " + eachData.getText());
            extentTest.pass(eachData.getText());
            colNum++;
        }

        /*
        Webtables topic last example/end of the session
    Task 5 : Write a method that accepts 2 parameters
    Parameter 1 = row number
    Parameter 2 = column number
    printData(2,3); => prints data in 2nd row 3rd column
         */
    }

@Test
        public void t1(){

    driver.get("https://the-internet.herokuapp.com/tables");

    String par1 = driver.findElement(By.xpath("//table[@id='table1']//tr[2]")).getText();
    String par2 = driver.findElement(By.xpath("//table[@id='table1']//tr[2]//td[3]")).getText();

    System.out.println(par2+ " "+ par1);


        }


    }