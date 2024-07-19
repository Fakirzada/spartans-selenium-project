package test.week_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassPraticesAccount {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();


        By singLocatoer= By.linkText("Sign in");
        WebElement singElementLocato= driver.findElement(singLocatoer);
        singElementLocato.click();

        By CreateAC = By.id("newAccountBtn");
        WebElement CreatAccount = driver.findElement(CreateAC);
        CreatAccount.click();

        String emailPrefix = "m_saeed";
        int number = (int) (Math.random() * 100);
        String randomEmail = emailPrefix + number + "@gmail.com";

        driver.findElement(By.name("name")).sendKeys("Mohamamd");
        driver.findElement(By.name("email")).sendKeys(randomEmail);
        driver.findElement(By.name("password")).sendKeys("Saeed@1234");
        driver.findElement(By.name("confirmPassword")).sendKeys("Saeed@1234");
        By careAccoutnLoct= By.id("signupBtn");
        WebElement signupBtn= driver.findElement(careAccoutnLoct);
        signupBtn.click();


    }
}
