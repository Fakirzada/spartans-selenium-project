package proejct;

import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowser {
    public static void main(String[] args) {
        ChromeDriver chromeDriver=new ChromeDriver();
        chromeDriver.get("https://google.com");
       // chromeDriver.get("https://facebook.com");
        chromeDriver.manage().window().maximize();
        String  title=chromeDriver.getTitle();
        System.out.println(title);

        // to close browser entirely
        chromeDriver.quit();


    }
}
