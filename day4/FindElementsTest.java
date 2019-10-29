package tests.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class FindElementsTest {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        String expectedTitle = driver.getTitle();
        //step1.open inspecter in chrome and find locator for the element
        //step2.create object of WebElement
        //step3.use webelement
        WebElement button = driver.findElement(By.id("form_submit"));
        // to click on the element
        button.click();
        BrowserUtils.wait(2);
        String actualTitle = driver.getTitle();

        if( actualTitle.equals(expectedTitle)) {
            System.out.println("test passed");
        }else {
            System.out.println("test failed");
            System.out.println("Expected title: " + expectedTitle);
            System.out.println("Actual title: " + actualTitle);
        }

        BrowserUtils.wait(2);
        driver.close();
    }
}
