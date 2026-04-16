package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TCS_5_UnHappy {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://saucelabs.com/request-demo");
        WebElement busEmail = driver.findElement(By.id("Email"));
        busEmail.sendKeys("gmail.com");

        WebElement company = driver.findElement(By.xpath("//input[@id='Company']"));
        company.sendKeys("Abc");

        driver.findElement(By.xpath("//select[@id ='Solution_Interest__c']")).click();
        driver.findElement(By.xpath("//select[@id ='Solution_Interest__c']/descendant::option [@value ='Sauce AI Agents']")).click();

        WebElement comment = driver.findElement(By.id("Sales_Contact_Comments__c"));
        comment.sendKeys("abc");

        WebElement checkBox = driver.findElement(By.id("LblmktoCheckbox_47709_0"));
        checkBox.click();

        WebElement btn = driver.findElement(By.className("mktoButton"));
        btn.click();
    }
}
