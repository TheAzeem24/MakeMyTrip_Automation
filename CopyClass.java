package com.testing.selenium;


import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class CopyClass extends TestBase{

    @Test(priority = 1)
    public void test1() throws InterruptedException {
        Thread.sleep(2000);
        mmt.getFirstDiv().click();

        Thread.sleep(2000);
        mmt.getHotels().click();

        Thread.sleep(2000);
        mmt.getSearch().click();

        Thread.sleep(2000);
        String s = "the park hyderabad";
        for (char c: s.toCharArray()) {
            mmt.getSearchInput().sendKeys(c+"");
            Thread.sleep(100);
        }
        Thread.sleep(2000);
        mmt.getFirstItem().click();
        Thread.sleep(2000);
        WebElement element = mmt.getClosingDatePickerContainer();
        js.executeScript("arguments[0].scrollIntoView()", element);
        js.executeScript("arguments[0].click();", element);
        Thread.sleep(2000);
        mmt.getHotelSearchButton().click();
        Thread.sleep(2000);
        mmt.getFirstHotel().click();
        Thread.sleep(2000);
        String wind = "";
        Set<String> windowHandle = driver.getWindowHandles();
        Iterator<String> iterator = windowHandle.iterator();
        while (iterator.hasNext()) {
            wind = iterator.next();
        }
        driver.switchTo().window(wind);
        Thread.sleep(2000);
        mmt.getBookHotel().click();
        Thread.sleep(4000);
    }
}

