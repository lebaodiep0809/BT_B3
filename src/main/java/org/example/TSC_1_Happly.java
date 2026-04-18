package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class TSC_1_Happly {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://saucelabs.com/request-demo");

        WebElement busEmail = driver.findElement(By.xpath("//input[@id='Email']"));
        busEmail.sendKeys("nguyenttlink@gmail.com");

        WebElement fistName = driver.findElement(By.xpath("//input[@id='FirstName']"));
        fistName.sendKeys("Hoa");

        WebElement lastName = driver.findElement(By.xpath("//input[@id='LastName']"));
        lastName.sendKeys("Nguyeexn");

        WebElement company = driver.findElement(By.xpath("//input[@id='Company']"));
        company.sendKeys("Abc");

        WebElement phoneNub = driver.findElement(By.xpath("//input[@id='Phone']"));
        phoneNub.sendKeys("095478147");

        driver.findElement(By.xpath("//select[@id ='Country']")).click();
        driver.findElement(By.xpath("//select[@id ='Country']/descendant::option [@value ='United States']")).click();

        driver.findElement(By.xpath("//select[@id ='State']")).click();
        driver.findElement(By.xpath("//select[@id ='State']/descendant::option [@value ='Alaska']")).click();

        driver.findElement(By.xpath("//select[@id ='Solution_Interest__c']")).click();
        driver.findElement(By.xpath("//select[@id ='Solution_Interest__c']/descendant::option [@value ='Sauce AI Agents']")).click();

        WebElement comment = driver.findElement(By.id("Sales_Contact_Comments__c"));
        comment.sendKeys("abc");

        // Dùng findElements để trả về một Danh sách (List)
        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@id='mktoCheckbox_47709_0']"));

// Kiểm tra nếu danh sách không rỗng (nghĩa là tìm thấy ít nhất 1 phần tử)
        if (!checkBoxes.isEmpty()) {
            checkBoxes.get(0).click();
        }


        WebElement btn = driver.findElement(By.className("mktoButton"));
        btn.click();

        if (driver.getPageSource().contains("This field is required")) {
            System.out.println("FAIL");
        } else {
            System.out.println("PASS");
        }

        Thread.sleep(100);
        driver.quit(); // luôn chạy

    }
}
