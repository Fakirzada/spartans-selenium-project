package test.week_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginCssSelector {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("#signinLink")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("saeed.123@gmail.com");
        driver.findElement(By.cssSelector("#password")).sendKeys("Saeed@1234");
        driver.findElement(By.cssSelector("#loginBtn")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#accountLink")).click();
        String text=driver.findElement(By.cssSelector(".account__information-email")).getText();
        System.out.println(text);

        driver.quit();


    }
}
