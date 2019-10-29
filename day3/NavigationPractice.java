package tests.day3;

import org.openqa.selenium.WebDriver;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class NavigationPractice {
    public static void main(String[] args) {

        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://google.com");
        driver.navigate().to("http://amazon.com");
        //wait 3 seconds. this is out custom method.
        //since method is static, we use class name to call the method
        //as a parameter, we provide number of seconds(time in seconds)
        BrowserUtils.wait(3);
        //how to print page title
        System.out.println(driver.getTitle());
        // navigate back to google (previous URL)
        driver.navigate().back();
        //move forward to the amazon again
        driver.navigate().forward();
        //to refresh / reload webpage/website
        driver.navigate().refresh();
        //shutdown browser
        driver.quit();
    }
}
