package tests.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;
import utils.BrowserUtils;

import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;

public class EnterTextPractice2 {
    /*
1. Go to "http://practice.cybertekschool.com/forgot_password"
2. Enter any valid email
3. Click on retrieve password button
4. Verify that URL is equals to "http://practice.cybertekschool.com/email_sent"
     */
    public static void main(String[] args) {
      //  String[] names ={"ozgen","kenan","omer","recep"}
      //  ArrayList<String> list =new ArrayList<>(Arrays.asList(names));
    WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
    WebElement inputBox = driver.findElement(By.name("email"));
        inputBox.sendKeys("ozkcr@icloud.com", Keys.ENTER);
    WebElement confirmationMessage = driver.findElement(By.name("confirmation_message"));

    String expectedMessage = "Your e-mail's been sent!";
    String actualMessage = confirmationMessage.getText();
        if(expectedMessage.equals(actualMessage)){

        System.out.println("test passed");
    }else    {
        System.out.println("test failed");
    }
        driver.close();
    }
}
