package com.testing.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class BusesTestCase extends TestBase{
	
	@Test(priority=1)
	public void bookBus() throws InterruptedException {
//		 
		
		
		
		mmt.getFirstDiv().click();
		
		mmt.getBuses().click();
		
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
        mmt.getToFirstSuggestion().click();
        waitFor(Constants.busFromDate);
        mmt.getBusFromDate().click();
        waitFor(Constants.busSearch);
        mmt.getBusSearch().click();
        waitFor(Constants.viewBuses);
        mmt.getViewBuses().click();
        waitFor(Constants.selectSeats);
        mmt.getSelectSeats().click();
        waitFor(Constants.viewSeats);
        mmt.getViewSeats().click();
        waitFor(Constants.seat);
        mmt.getSeat().click();
        waitFor(Constants.bookSeats);
        mmt.getBookSeats().click();
        
        waitFor(Constants.bName);
        mmt.getBName().sendKeys(Constants.name);
        
        waitFor(Constants.bAge);
        mmt.getBAge().sendKeys(Constants.age);
        
        act.moveToElement(mmt.getBGender()).perform();
        mmt.getBMale().click();
       
        waitFor(Constants.bEmail);
        mmt.getBEmail().sendKeys(Constants.email);
        
        waitFor(Constants.bMobile);
        mmt.getBMobile().sendKeys(Constants.mobile);
        
        waitFor(Constants.contonueToBook);
        mmt.getContonueToBook().click();
        
      
        
		
	}
}
