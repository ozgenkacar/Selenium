package tests.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;

public class ReadattributesTest {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        WebElement input = driver.findElement(By.name("email"));
        System.out.println(input.getAttribute("pattern"));

        input.sendKeys("ozaydinkcr@gmail.com");
        // how to read entered text
        // it's gonna be inside value attrabute
        System.out.println(input.getAttribute("value"));
        // if button has a type "submit"
        //we can use .submit() method instead ofclick() as well
        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));
        retrievePasswordButton.submit();

                driver.close();



    }
}
