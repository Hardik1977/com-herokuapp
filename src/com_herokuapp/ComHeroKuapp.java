package com_herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ComHeroKuapp {

    public static void main(String[] args) {


    //Launch the browser (How to launch the web browser
    String baseurl = "http://the-internet.herokuapp.com/login";
    //open the URl at WebBrowser
    WebDriver driver = new ChromeDriver();
    driver.get(baseurl);
    //Getting Title for URL
     String title = driver.getTitle();
        System.out.println(title);
        //Getting current URL
        System.out.println("Current URL : " + driver.getCurrentUrl());
        System.out.println("");
        driver.manage().window().maximize();
        //Getting a page source statement
        System.out.println("Page source : " + driver.getPageSource());
        //Wait statement
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //enter the username to username field
        WebElement usernamefield = driver.findElement(By.name("username"));
        usernamefield.sendKeys("Prime");
        //enter the Password to Password field
        WebElement passwordfield = driver.findElement(By.name("password"));
        passwordfield.sendKeys("Prime123");
        //closing Browser
        driver.close();
    }
}
