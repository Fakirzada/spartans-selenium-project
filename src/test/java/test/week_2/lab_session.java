package test.week_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
public class lab_session {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));;
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#signinLink"))).click();
       wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#email"))).sendKeys("saeed.123@gmail.com");
      wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#password"))).sendKeys("Saeed@1234");
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#loginBtn"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#accountLink"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#personalPhoneInput"))).clear();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#personalPhoneInput"))).sendKeys("8382405448");
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#personalUpdateBtn"))).clear();

        driver.quit();




    }

}
