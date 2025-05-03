package org.erraji;

import com.epam.healenium.SelfHealingDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HealeniumTest {
    public static void main(String[] args) {
        WebDriver originalDriver =new ChromeDriver();
        SelfHealingDriver driver=SelfHealingDriver.create(originalDriver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.saucedemo.com/v1/inventory.html");
        driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).click();
    }
}
