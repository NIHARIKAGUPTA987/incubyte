package com.packt.tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Mail extends Login{
    @Test
public void ComposeMail()
{

    System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    String baseUrl = "https://mail.rediff.com/cgi-bin/login.cgi";
    driver.get(baseUrl);
    driver.manage().window().maximize();
    WebElement email = (WebElement) driver.findElement(By.xpath("//input[@type='text']"));
    email.sendKeys("niharika1894@rediffmail.com");
    WebElement Password = (WebElement) driver.findElement(By.id("password"));
    Password.sendKeys("Abc@1234");
    driver.findElement(By.xpath("//input[@type='submit']")).click();
    driver.findElement(By.xpath("//li[@title='Compose a new mail']")).click();
    WebElement  To = driver.findElement(By.xpath("//input[@id='TO_IDcmp2']"));
    To.sendKeys("niharika18@yopmail.com");
    WebElement Subject = driver.findElement(By.xpath("//input[@type='text']"));
    Subject.sendKeys("Automation test");
    driver.findElement(By.xpath("//a[@class='send_ng_compo rd_btn_cmp_send']")).click();
}
}
