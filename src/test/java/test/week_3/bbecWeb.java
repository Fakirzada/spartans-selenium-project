package test.week_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class bbecWeb {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.bbc.com");

        By ancherlocator= By.tagName("a");
        List<WebElement> anncherElemnet=driver.findElements(ancherlocator);
        System.out.println(anncherElemnet.size());
       // System.out.println();

        for( WebElement element: anncherElemnet){

            System.out.println(element.getText());
        }

        By imagTage=By.tagName("img");
        List<WebElement> imagaeElement=driver.findElements(imagTage);
        System.out.println(imagaeElement.size());


        By buttage= By.tagName("button");
        List<WebElement> buttnElement=driver.findElements(buttage);
        System.out.println(buttnElement.size());

        for( WebElement button:buttnElement){
            System.out.println(button.getText());
        }


        List<WebElement>classElements=driver.findElements(By.tagName("class"));
        System.out.println(classElements.size());
        for (WebElement element:classElements)
            System.out.println(element);

        driver.quit();
    }
}
