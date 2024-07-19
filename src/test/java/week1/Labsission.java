package week1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Labsission {
    public static void main(String[] args) {
       WebDriver diver=new ChromeDriver();
       diver.manage().window().maximize();
       diver.get("https://retail.tekschool-students.com/");

       By getSign= By.id("signinLink");
        WebElement sigin=diver.findElement(getSign);
        sigin.click();
        By getcreateid=By.id("");
       WebElement createAc=diver.findElement(getcreateid);
       createAc.click();


    }
}
