package test.week_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorpratice {
    public static void main(String[] args) {

        WebDriver driver= new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();

        String text= driver.findElement(By.cssSelector("div.home__categories-grid>div:nth-child(2)>h1")).getText();
        System.out.println(text);
        driver.quit();
    }
}
