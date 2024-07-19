package test.week_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateGoogle {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.de/");


        driver.findElement(By.name("q")).sendKeys("TEKSchool");
        Thread.sleep(1000);
        driver.findElement(By.name("btnK")).click();
        //Thread.sleep(2000);
        driver.findElement(By.partialLinkText("TEK SCHOOL Modern Workforce Training Bootcamp")).click();
        /*
        By searchLocatoer=By.id("APjFqb");
        WebElement searchGoogle=driver.findElement(searchLocatoer);
        searchGoogle.sendKeys("TEK School");
        searchGoogle.submit();
        Thread.sleep(1000);
       // driver.quit();

         */

    }
}
