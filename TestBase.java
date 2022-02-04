package com.testing.selenium;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;



public class TestBase {
    WebDriver driver;
    MMTWebElements mmt;
    Actions act;
    JavascriptExecutor js;
    @Parameters({"browser","url"})
    @BeforeClass
    public void setUp(String browser, String url) {
        if (browser.equalsIgnoreCase("chrome")) {

            System.setProperty("webdriver.chrome.driver",
                    "/Users/maneesh.reddy/Downloads/chromedriver");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver",
                    "C:\\Users\\Anjali Bodige\\Downloads\\edgedriver_win64\\msedgedriver.exe");
            driver = new EdgeDriver();
        }
        driver.manage().window().maximize();
        mmt = new MMTWebElements(driver);
        js = (JavascriptExecutor) driver;
        act = new Actions(driver);
        driver.get(url);
    }

    @AfterClass
    public void tearDown() {
        driver.close();
        driver.quit();
    }
}
