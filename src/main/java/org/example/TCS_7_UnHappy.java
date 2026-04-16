package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TCS_7_UnHappy {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://saucelabs.com/request-demo");
// Thêm khoảng trắng vào trước sau + sai định dạng số điện thoại
        WebElement busEmail = driver.findElement(By.xpath("//input[@id='Email']"));
        busEmail.sendKeys("     nguyenttlink@gmail.com        ");

        WebElement fistName = driver.findElement(By.xpath("//input[@id='FirstName']"));
        fistName.sendKeys("     Hoa     ");

        WebElement lastName = driver.findElement(By.xpath("//input[@id='LastName']"));
        lastName.sendKeys("     Nguyeexn      ");

        WebElement company = driver.findElement(By.xpath("//input[@id='Company']"));
        company.sendKeys("      Abc       ");

        WebElement phoneNub = driver.findElement(By.xpath("//input[@id='Phone']"));
        phoneNub.sendKeys("abc@gteswe");

        driver.findElement(By.xpath("//select[@id ='Country']")).click();
        driver.findElement(By.xpath("//select[@id ='Country']/descendant::option [@value ='United States']")).click();

        driver.findElement(By.xpath("//select[@id ='State']")).click();
        driver.findElement(By.xpath("//select[@id ='State']/descendant::option [@value ='Alaska']")).click();

        driver.findElement(By.xpath("//select[@id ='Solution_Interest__c']")).click();
        driver.findElement(By.xpath("//select[@id ='Solution_Interest__c']/descendant::option [@value ='Sauce AI Agents']")).click();

        WebElement comment = driver.findElement(By.id("Sales_Contact_Comments__c"));
        comment.sendKeys("      abc   ");

        WebElement checkBox = driver.findElement(By.id("LblmktoCheckbox_47709_0"));
        checkBox.click();

        WebElement btn = driver.findElement(By.className("mktoButton"));
        btn.click();
    }
}
