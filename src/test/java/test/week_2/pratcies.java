package test.week_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class pratcies {
    public static void main(String[] args) {
        var diver =new ChromeDriver();
        diver.get("https://www.instagram.com/");
       // var driversufari=new SafariDriver();
        //driversufari.get("https://www.bbc.com/news");


        By singinlocator= By.id("input aria-label");
        WebElement signin=diver.findElement(singinlocator);
        signin.click();

        String titel=diver.getTitle();
        System.out.println(titel);


    }
}
