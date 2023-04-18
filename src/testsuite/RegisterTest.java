package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class RegisterTest extends BaseTest {
    String baseURL = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseURL);
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        //click on the ‘Register’ link
        driver.findElement(By.xpath("//a[@class='ico-register']")).click();
        //Verify the text ‘Register’
        String actualText = driver.findElement(By.xpath("//h1[text()='Register']")).getText();
        String expectedText = "Register";
        Assert.assertEquals("Register not displayed correctly", expectedText, actualText);
    }

    @Test
    public void userShouldRegisterAccountSuccessfully() {
        //click on the ‘Register’ link
        driver.findElement(By.xpath("//a[@class='ico-register']")).click();
        //Select gender radio button
        driver.findElement(By.xpath("//input[@name='Gender' and @value='M']")).click();
        //Enter First name
        driver.findElement(By.id("FirstName")).sendKeys("Narendra");
        //Enter Last name
        driver.findElement(By.name("LastName")).sendKeys("Modi");
        //Select Day Month and Year
        driver.findElement(By.xpath("//select[@name='DateOfBirthDay']")).sendKeys("17");
        driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']")).sendKeys("09");
        driver.findElement(By.xpath("//select[@name='DateOfBirthYear']")).sendKeys("1950");
        //Enter Email address
        driver.findElement(By.id("Email")).sendKeys("jayhind@gmail.com");
        //Enter password
        driver.findElement(By.name("Password")).sendKeys("hindustan123");
        //Enter confirm password
        driver.findElement(By.name("ConfirmPassword")).sendKeys("hindustan123");
        //Click on REGISTER button
        driver.findElement(By.xpath("//button[@id='register-button']")).click();
        //Verify the text 'Your registration completed’
        String actualMessage = driver.findElement(By.xpath("//div[text()='Your registration completed']")).getText();
        String expectedMessage = "Your registration completed";
        Assert.assertEquals("Login not successful", expectedMessage, actualMessage);
    }

    public void tearDown() {
        closeBrowser();
    }
}
