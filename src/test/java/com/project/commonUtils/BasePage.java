package com.project.commonUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class BasePage {

    private static BasePage basePage;
    private static WebDriver driver;
    public final static int TIMEOUT = 10;

    private BasePage() {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
        driver.manage().window().maximize();
    }

    public static void openPage(String url) {

        driver.get(url);
    }

    public static WebDriver getDriver() {

        return driver;
    }

    public static void setUpDriver() {

        if (basePage == null) {

            basePage = new BasePage();
        }
    }

    public static void tearDown() {

        if (driver != null) {

            driver.close();
            driver.quit();
        }

        basePage = null;
    }
}
