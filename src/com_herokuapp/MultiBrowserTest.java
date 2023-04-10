package com_herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTest {

    static String browser = "Chrome";
    static WebDriver driver;

    static String baseurl = "http://the-internet.herokuapp.com/login";

    public static void main(String[] args) {

        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser name .");
        }
        driver.get(baseurl);
        //Maximizing window statement
        driver.manage().window().maximize();
        //Get the title of the page with the method of Get()
        String title = driver.getTitle();
        System.out.println(title);
        //Get the current URL
        System.out.println("Current URL : " + driver.getCurrentUrl());
        //Get the current source
        System.out.println("Current Source : " + driver.getPageSource());
        //Wait statement
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Find the Username from Username Field and Password field
        WebElement usernamefield = driver.findElement(By.name("username"));
        usernamefield.sendKeys("Prime");
        WebElement passwordfield = driver.findElement(By.name("password"));
        passwordfield.sendKeys("Prime123");
        //closing statement
        driver.close();
    }

}
