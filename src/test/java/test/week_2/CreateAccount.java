package test.week_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {
    public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver = new ChromeDriver();
        var driver=new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://retail.tekschool-students.com/");

        By getsignIn = By.linkText("Sign in");
        WebElement signin = webDriver.findElement(getsignIn);
        signin.click();

        By CreateAC = By.id("newAccountBtn");
        WebElement CreatAccount = webDriver.findElement(CreateAC);
        CreatAccount.click();

        By WriteName = By.name("name");
        WebElement Writename = webDriver.findElement(WriteName);
        Writename.sendKeys("saeed");

        String emailPrefix = "m_saeed";
        int number = (int) (Math.random() * 100);
        String randomEmail = emailPrefix + number + "@gmail.com";
        //Writename.sendKeys(randomEmail);

        By Email = By.name("email");
        WebElement emailIN = webDriver.findElement(Email);
        emailIN.sendKeys(randomEmail);

        By password = By.name("password");
        WebElement Password = webDriver.findElement(password);
        Password.sendKeys("Kabul123@");

        By ConfirmPass = By.id("confirmPasswordInput");
        WebElement confirmPass = webDriver.findElement(ConfirmPass);
        confirmPass.sendKeys("Kabul123@");

        By signup = By.id("signupBtn");
        WebElement Signup = webDriver.findElement(signup);
        Signup.click();

        By profilePic = By.id("profileImage");
        WebElement ProfilePic = webDriver.findElement(profilePic);
        if(ProfilePic.isDisplayed()){
            System.out.println(" test Pass");
        }else {
            System.out.println(" test not Pass");
        }

        Thread.sleep(3000);
        By profileImageLocator = By.id("profileImage");
        WebElement profileImageElement = webDriver.findElement(profileImageLocator);
        boolean profile = profileImageElement.isDisplayed();
        System.out.println(profile);

        if(profileImageElement.isDisplayed()){
            System.out.println(" test Pass");
        }else {
            System.out.println(" test not Pass");
        }
        webDriver.quit();

    }
}
