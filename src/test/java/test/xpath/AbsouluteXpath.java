package test.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AbsouluteXpath {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://retail.tekschool-students.com");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//p[text()='Video Games']")).click();
        driver.findElement(By.xpath("//p[text()='PlayStation 5 Console']")).click();
       driver.findElement(By.xpath("//span[text()='Add to Cart']")).click();

       WebElement print= driver.findElement(By.xpath("//h1[@class='product__name']"));
        System.out.println(print);



        List<WebElement> classElements=driver.findElements(By.tagName("product__name"));
        System.out.println(classElements.size());
        for (WebElement element:classElements)
            System.out.println(element);

        driver.getTitle();

      Thread.sleep(1000);
       driver.quit();

    }
}
