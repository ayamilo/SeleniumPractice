package com.cbt.test.mypractice;

import com.cbt.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class March232020 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://login1.nextbasecrm.com/stream/?login=yes");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@placeholder=\"Login\"]")).sendKeys("hr47@cybertekschool.com");
        driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("UserUser");
        driver.findElement(By.className("login-btn")).click();
        driver.findElement(By.id("feed-add-post-form-tab-message")).click();
        BrowserUtils.wait(2);
        driver.findElement(By.xpath("//span[@id=\"lhe_button_editor_blogPostForm\"]")).click();



        BrowserUtils.wait(5);
        driver.quit();

      }

}