package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class UploadFile2 {
    static void main() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.guru99.com/test/upload/");

        String filePadth = new File("download.jpg").getAbsolutePath();

        WebElement uploadFile = driver.findElement(By.id("uploadfile_0"));
        uploadFile.sendKeys(filePadth);
    }
}
