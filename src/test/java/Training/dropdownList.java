package Training;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class dropdownList {
    WebDriver driver;
    String projectPath = System.getProperty("user.dir");
    Select select;

    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver", projectPath + "\\browserDrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void TC_01() {
        driver.get("https://demo.nopcommerce.com/register");
        WebElement day = driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
        select = new Select(day);
        select.selectByVisibleText("1");
//        select.selectByIndex();
//        select.selectByValue();
//        Assert.assertFalse(select.isMultiple());
//        Assert.assertEquals(select.getFirstSelectedOption().getText(), "1");
    }


    public void TC_02() {
        driver.get("https://techydevs.com/demos/themes/html/listhub-demo/listhub/index.html");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.findElement(By.xpath("//div[@class='main-search-input-item user-chosen-select-container']//span[text()='Select a Category']")).click();
//        driver.findElement(By.xpath("//div[@class='chosen-container chosen-container-single chosen-container-active chosen-with-drop']//input")).sendKeys("Travel");
//        select = new Select(driver.findElement(By.xpath("//div[@class='chosen-container chosen-container-single chosen-container-active chosen-with-drop']//ul")));
//        select.selectByVisibleText("Travel");

    }

    @AfterClass
    public void afterClass() {
        //driver.quit();
    }
}
