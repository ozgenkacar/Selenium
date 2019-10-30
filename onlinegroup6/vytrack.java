package tests.onlinegroup6;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;
import utils.BrowserUtils;
public class vytrack {
        public static void main(String[] args) {

            WebDriver driver = BrowserFactory.getDriver("chrome");
            driver.get("https://qa2.vytrack.com/user/login ");

            WebElement input= driver.findElement(By.name("_username"));
            input.sendKeys("user151",Keys.ENTER);

            WebElement password  = driver.findElement(By.name("_password"));
            password.sendKeys("UserUser123");
           // password.submit();
            WebElement button = driver.findElement(By.id("_submit"));
            button.click();

            String expectedUrl ="https://qa2.vytrack.com";
            String actualUrl = driver.getCurrentUrl();
            BrowserUtils.wait(5);
            if (expectedUrl.equals(actualUrl)) {
                System.out.println("Test passed");
            } else {
                System.out.println("Test failed");
            }
           BrowserUtils.wait(3);

           driver.quit();
        }
    }







