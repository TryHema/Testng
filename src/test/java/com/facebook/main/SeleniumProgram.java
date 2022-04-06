package com.facebook.main;

import com.facebook.utils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

public class SeleniumProgram extends BaseClass {

    WebDriver driver;

    @DataProvider(name = "LoginData")
    public Object[][] data()
    {
        return new Object[][] {{"thillai","fdsf"},{"arasu","dfsd"}};
    }

    @BeforeClass
    @Parameters("browserName")
    public void samples1(String browser) {
        driver = launchBrowser(browser);
    }

    @BeforeMethod
    @Parameters("openUrl")
    public void samples2(String url) {
        openURL(url);
    }

    @Test (dataProvider = "LoginData")
    public void samples3(String username,String password) {
        WebElement user = driver.findElement(By.id("username"));
        send(user, username);
        WebElement pass = driver.findElement(By.id("password"));
        send(pass, password);
    }

    @AfterMethod
    public void samples4() throws InterruptedException {
        WebElement login = driver.findElement(By.id("login"));
        tap(login);

        Thread.sleep(3000);
    }

    @AfterClass
    public void samples5() {
        closeBrowser();
    }

}
