package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //  driver.navigate().refresh();
        //  driver.navigate().to("https://saucelabs.com/request-demo");
        // driver.navigate().back();// Quay lại trang saucelabsd
        // driver.navigate().forward();// quay lại trang trước đó
        // String url = driver.getCurrentUrl();
        //  System.out.println("String url là: "+url);
        WebElement element = driver.findElement(By.id("Email")); // Tim
        element.sendKeys("linhntt@gmail.com");//tuog tac

        WebElement firstName = driver.findElement(By.name("FirstName"));
        firstName.sendKeys("Linh");

        WebElement lastName = driver.findElement(By.name("LastName"));
        lastName.sendKeys("Nguyễn");

        WebElement company = driver.findElement(By.className("mktoField mktoTextField mktoHasWidth mktoRequired mktoInvalid"));
        company.sendKeys("HHHH");

        WebElement phoneNumber = driver.findElement(By.xpath("//input[@id='Phone']"));
        //driver.quit();

    }
}
