package test.week_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingLinkname {
    public static void main(String[] args) throws InterruptedException {
        WebDriver drive =new ChromeDriver();
        drive.get("https://retail.tekschool-students.com/");
        drive.manage().window().maximize();


        By signInLocetor= By.linkText("Sign in");
        WebElement signInElement= drive.findElement(signInLocetor);
        signInElement.click();

        By emailInLocetor= By.name("email");
        WebElement emailInElement= drive.findElement(emailInLocetor);
        emailInElement.sendKeys("wornglmeail@gmail.com");


        By pwsInLocetor= By.name("password");
        WebElement pwsInLocetorlInElement= drive.findElement(pwsInLocetor);
        pwsInLocetorlInElement.sendKeys("saeed123");

         By btblInLocetor= By.id("loginBtn");
        WebElement btnlInLocetorlongBtn= drive.findElement(btblInLocetor);
        btnlInLocetorlongBtn.click();

        Thread .sleep(1000);

        By errorLocatot= By.className("error");
        WebElement errorElement=drive.findElement(errorLocatot);
        String  errortext=errorElement.getText();
        System.out.println(errortext);
        drive.quit();
    }
}
