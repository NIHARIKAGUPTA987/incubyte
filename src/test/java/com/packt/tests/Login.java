package com.packt.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import java.util.List;

public class Login {

    public static void main(String args[])
    {

        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //WebDriver driver=new FirefoxDriver();
        String baseUrl = "https://mail.rediff.com/cgi-bin/login.cgi";
        driver.get(baseUrl);
        driver.manage().window().maximize();
        WebElement email = (WebElement) driver.findElement(By.xpath("//input[@type='text']"));
       email.sendKeys("niharika1894@rediffmail.com");
       WebElement Password = (WebElement) driver.findElement(By.id("password"));
        Password.sendKeys("Abc@1234");
        driver.findElement(By.xpath("//input[@type='submit']")).click();

    }
}
