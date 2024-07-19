package week1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class weekPrictic {
    /*
    In Retail app, click on sign in then click on Create new Account
    then fill up the form and sign up. Expectation is to Create new Account.
    once account created make sure profile picture is displayed. (isDisplayed)
    And print result of isDisplayed method.
    Push to your repository
     */

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
       // System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

        // Initialize a new WebDriver instance of the Chrome browser
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to a sample web page
            driver.get("https://retail.tekschool-students.com/profile");

            // Locate the web element
            WebElement element = driver.findElement(By.id("exampleElementId"));

            // Check if the element is displayed
            boolean isDisplayed = element.isDisplayed();

            // Print the result
            if (isDisplayed) {
                System.out.println("The element is displayed on the page.");
            } else {
                System.out.println("The element is not displayed on the page.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
