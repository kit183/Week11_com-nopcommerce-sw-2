package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {

        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        //click on the ‘Sign In’ link
        driver.findElement(By.linkText("Log in")).click();
        //Verify the text ‘Welcome Back!’
        String actualText = driver.findElement(By.xpath("//div[@class='page-title']")).getText();
        String expectedText = "Welcome, Please Sign In!";
        Assert.assertEquals("Message not displayed successfully", expectedText, actualText);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //click on the ‘Sign In’ link
        driver.findElement(By.linkText("Log in")).click();
        //Enter Email address
        driver.findElement(By.id("Email")).sendKeys("jayhind@gmail.com");
        //Enter password
        driver.findElement(By.name("Password")).sendKeys("hindustan123");
        // Click on ‘LOGIN’ button
        driver.findElement(By.xpath("//button[@type='submit' and text()='Log in']")).click();
        // Verify the ‘Log out’ text is display
        String actualText = driver.findElement(By.xpath("//a[@class='ico-logout']")).getText();
        String expectedText="Log out";
        Assert.assertEquals("User not Login Successfully",expectedText,actualText);

    }

    @Test
    public void verifyTheErrorMessage() {
        //click on the ‘Sign In’ link
        driver.findElement(By.linkText("Log in")).click();
        //Enter invalid username
        driver.findElement(By.id("Email")).sendKeys("Jayhind11@gmail.com");
        //Enter invalid password
        driver.findElement(By.name("Password")).sendKeys("hindustan1");
        //Click on Login button
        driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();
        // Verify the error message ‘Login was unsuccessful. Please correct the errors and try again. No customer account found’
        String actualText = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getText();
        String expectedText = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        Assert.assertEquals("Message not displayed successfully", expectedText, actualText);
   }
    public void tearDown(){
        closeBrowser();
    }
}
