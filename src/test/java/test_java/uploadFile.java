package test_java;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class uploadFile {
    WebDriver driver;
    String projectPath = System.getProperty("user.dir");
    String service1 = "service1.jpg";
    String service2 = "service2.jpg";
    String service3 = "service3.jpg";

    String service1FilePath = projectPath + "\\uploadFiles\\" + service1;
    String service2FilePath = projectPath + "\\uploadFiles\\" + service2;
    String service3FilePath = projectPath + "\\uploadFiles\\" + service3;



    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver", projectPath + "\\browserDrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://blueimp.github.io/jQuery-File-Upload/");
        driver.manage().window().maximize();
    }


    public void TC_01_Sendkey_one_file() throws InterruptedException {

        //NOTE: The dai dien cho upload file la the <input> type='file'.
        //Upload file
        driver.findElement(By.xpath("//input[@type='file']")).sendKeys(service1FilePath);
        driver.findElement(By.xpath("//input[@type='file']")).sendKeys(service2FilePath);
        driver.findElement(By.xpath("//input[@type='file']")).sendKeys(service3FilePath);

        //Verify files loaded success
        Assert.assertTrue(driver.findElement(By.xpath("//p[@class='name' and text()='" + service1 + "']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//p[@class='name' and text()='" + service2 + "']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//p[@class='name' and text()='" + service3 + "']")).isDisplayed());

        //CLick to Start button -> Upload
        List<WebElement> startButtons = driver.findElements(By.xpath("//table//button[@class='btn btn-primary start']"));
        for (WebElement start : startButtons) {
            start.click();
            Thread.sleep(1000);
        }

        //Verify file uploaded succes
        Assert.assertTrue(driver.findElement(By.xpath("//p[@class='name']//a[text()='" + service1 + "']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//p[@class='name']//a[text()='" + service2 + "']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//p[@class='name']//a[text()='" + service2 + "']")).isDisplayed());
    }

    @Test
    public void TC_02_Sendkey_multi_file() throws InterruptedException {
        //Upload multi files
        // Trick lord: khi upload nhieu files cung 1 luc co the ghep chung vao 1 ham Sendkeys su dung "\n" (xuong dong) de co the upload
        driver.findElement(By.xpath("//input[@type='file']")).sendKeys(service1FilePath + "\n" + service2FilePath + "\n" + service3FilePath);

        //Verify files loaded success
        Assert.assertTrue(driver.findElement(By.xpath("//p[@class='name' and text()='" + service1 + "']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//p[@class='name' and text()='" + service2 + "']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//p[@class='name' and text()='" + service3 + "']")).isDisplayed());

        //CLick to Start button -> Upload
        List<WebElement> startButtons = driver.findElements(By.xpath("//table//button[@class='btn btn-primary start']"));
        for (WebElement start : startButtons) {
            start.click();
            Thread.sleep(1000);
        }

        //Verify file uploaded succes
        Assert.assertTrue(driver.findElement(By.xpath("//p[@class='name']//a[text()='" + service1 + "']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//p[@class='name']//a[text()='" + service2 + "']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//p[@class='name']//a[text()='" + service2 + "']")).isDisplayed());
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}
