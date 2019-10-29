package tests.day4;

import org.openqa.selenium.By;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;
import utils.BrowserUtils;

import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;


public class test1 {
        public static void main(String[] args) {
            String[] names ={"ozgen@email.com","kenan@email.com","omer@email.com","eso@email.com"};
            ArrayList<String> list =new ArrayList<>(Arrays.asList(names));

                WebDriver driver = BrowserFactory.getDriver("chrome");
               driver.get("http://practice.cybertekschool.com/forgot_password");
            for(int i=0; i<list.size();i++) {
               WebElement inputBox = driver.findElement(By.name("email"));
               inputBox.sendKeys(list.get(i), Keys.ENTER);
               WebElement button = driver.findElement(By.id("form_submit"));
               button.click();

            driver.navigate().to("http://practice.cybertekschool.com");

           }
            driver.quit();
        }

    }


