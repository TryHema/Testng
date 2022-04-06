package com.facebook.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class BaseClass {

    public static WebDriver driver;

    public static WebDriver launchBrowser(String browser) {
        if (browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equals("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
        return driver;
    }

    public void openURL(String URl) {
        driver.get(URl);
    }

    public void maxi() {
        driver.manage().window().maximize();
    }

    public void iWait(int time) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
    }

    public void send(WebElement element, String value) {
        element.sendKeys(value);
    }

    public void tap(WebElement element) {
        element.click();
    }

    public void screenshot(String filepath) {
        try {
            TakesScreenshot tk = (TakesScreenshot) driver;
            File src = tk.getScreenshotAs(OutputType.FILE);
            File dest = new File(filepath);
            FileHandler.copy(src, dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void closeBrowser() {
        driver.quit();
    }

    public String uiText(WebElement element) {
        return element.getText();
    }
}
