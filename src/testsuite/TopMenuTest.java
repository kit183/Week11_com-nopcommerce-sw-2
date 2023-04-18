package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TopMenuTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {

        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        //click on the ‘Computers’ Tab
        driver.findElement(By.partialLinkText("Computers")).click();
        //Verify the text ‘Computers’
        String actualText = driver.findElement(By.xpath("//h1[contains(text(),'Computers')]")).getText();
        String expectedText = "Computers";
        Assert.assertEquals("Message not displayed successfully", expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        //click on the ‘Electronics’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Electronics ']")).click();
        //Verify the text ‘Electronics’
        String actualText = driver.findElement(By.xpath("//h1[text()='Electronics']")).getText();
        String expectedText = "Electronics";
        Assert.assertEquals("Electronics not displayed correctly", expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        //click on the ‘Apparel’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Apparel ']")).click();
        //Verify the text ‘Apparel’
        String actualText = driver.findElement(By.xpath("//h1[text()='Apparel']")).getText();
        String expectedText = "Apparel";
        Assert.assertEquals("Apparel not displayed correctly", expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        //click on the ‘Digital downloads’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Digital downloads ']")).click();
        //Verify the text ‘Digital downloads’
        String actualText = driver.findElement(By.xpath("//h1[text()='Digital downloads']")).getText();
        String expectedText = "Digital downloads";
        Assert.assertEquals("Digital downloads not displayed correctly", expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        //click on the ‘Books’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Books ']")).click();
        //Verify the text ‘Books’
        String actualText = driver.findElement(By.xpath("//h1[text()='Books']")).getText();
        String expectedText = "Books";
        Assert.assertEquals("Books not displayed correctly", expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        //click on the ‘Jewelry’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Jewelry ']")).click();
        //Verify the text ‘Jewelry’
        String actualText = driver.findElement(By.xpath("//h1[text()='Jewelry']")).getText();
        String expectedText = "Jewelry";
        Assert.assertEquals("Jewelry not displayed correctly", expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {
        //click on the ‘Gift Cards’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Gift Cards ']")).click();
        //Verify the text ‘Gift Cards’
        String actualText = driver.findElement(By.xpath("//h1[text()='Gift Cards']")).getText();
        String expectedText = "Gift Cards";
        Assert.assertEquals("Gift Cards not displayed correctly", expectedText, actualText);
    }

    @After
    public void tearDown() {
       // driver.close();
    }

}
