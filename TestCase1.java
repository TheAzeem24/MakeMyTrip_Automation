package com.testing.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class TestCase1 extends TestBase{

    @Test(priority = 1)
    public void test1() throws InterruptedException {
        mmt.getFirstDiv().click();

        mmt.getHotels().click();

        mmt.getSearch().click();

        waitFor(Constants.SEARCH_INPUT);
        String s = "the park hyderabad";
        for (char c: s.toCharArray()) {
            mmt.getSearchInput().sendKeys(c+"");
            Thread.sleep(100);
        }
        mmt.getFirstItem().click();

        WebElement element = mmt.getClosingDatePickerContainer();
        js.executeScript("arguments[0].scrollIntoView()", element);
        js.executeScript("arguments[0].click();", element);
        waitFor(Constants.HOTEL_SEARCH_BUTTON);
        mmt.getHotelSearchButton().click();
        waitFor(Constants.FIRST_HOTEL);
        mmt.getFirstHotel().click();

        String wind = "";
        Set<String> windowHandle = driver.getWindowHandles();
        Iterator<String> iterator = windowHandle.iterator();
        while (iterator.hasNext()) {
            wind = iterator.next();
        }
        driver.switchTo().window(wind);

        waitFor(Constants.BOOK_HOTEL);
        mmt.getBookHotel().click();
        Thread.sleep(4000);
    }

    public void waitFor(String xpath) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    }
}
