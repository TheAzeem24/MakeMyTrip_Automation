package com.testing.selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestCaseFlight extends TestBase
{
	@Test(priority = 1)
	public void bookFlight() throws InterruptedException
	{
		
		mmt.getFirstDiv().click();
		
		mmt.getFlight().click();
		
		mmt.getFlightFrom().click();
		waitFor(Constants.fromCity);
		
		
        String from = "hyderabad";
        for (char c: from.toCharArray()) {
            mmt.getFromCity().sendKeys(c+"");
            Thread.sleep(100);
        }
        mmt.getFromSuggestion().click();
        
        waitFor(Constants.toFlight);
        
        String to = "bangaluru";
        for (char c: to.toCharArray()) {
            mmt.getToCity().sendKeys(c+"");
            Thread.sleep(100);
        }
        mmt.getToSuggestion().click();
        waitFor(Constants.fromDate);
        mmt.getfromDate().click();
        waitFor(Constants.searchButton);
        mmt.getSearchButton().click();
        String ok = "";
        Set<String> windowHandles = driver.getWindowHandles();
        Iterator<String> iterator = windowHandles.iterator();
        while(iterator.hasNext())
        {
        	ok = iterator.next();
        }
        driver.switchTo().window(ok);
        mmt.getOk().click();
        waitFor(Constants.viewAll);
        //mmt.getViewFlightPrices().click();
        //js.executeScript("arguments[0].scrollIntoView();", mmt.getViewAll());
        mmt.getViewAll().click();
       
        
        waitFor(Constants.bookFlight);
        //js.executeScript("arguments[0].scrollIntoView();", mmt.getBookFlight());
        mmt.getBookFlight().click();
        
        String tab = "";
        Set<String> windowHandles1 = driver.getWindowHandles();
        Iterator<String> iterator1 = windowHandles1.iterator();
        while(iterator1.hasNext())
        {
        	tab = iterator1.next();
        }
        driver.switchTo().window(tab);
        
       
        waitFor(Constants.newAdult);
        mmt.getNewAdult().click();
        waitFor(Constants.fName);
        js.executeScript("arguments[0].scrollIntoView();", mmt.getFName());
        mmt.getFName().sendKeys(Constants.name);
        mmt.getLName().sendKeys(Constants.name);
        mmt.getFMale().click();
        mmt.getMobileNo().sendKeys(Constants.mobile);
        mmt.getEmailId().sendKeys(Constants.bEmail);
        mmt.getContinueButton().click();
        
		
		
        
        
	}
}
