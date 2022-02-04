package com.testing.selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MMTWebElements {

    WebDriver driver;

    public MMTWebElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = Constants.HOTELS)
    WebElement hotels;
    public WebElement getHotels() {
        return hotels;
    }

    @FindBy(xpath = Constants.SEARCH)
    WebElement search;
    public WebElement getSearch() {
        return search;
    }

    @FindBy(xpath = Constants.SEARCH_INPUT)
    WebElement searchInput;
    public WebElement getSearchInput() { return searchInput; }

    @FindBy(xpath = Constants.FIRST_DIV)
    WebElement firstDiv;
    public WebElement getFirstDiv() { return firstDiv; }

    @FindBy(xpath = Constants.FIRST_ITEM)
    WebElement firstItem;
    public WebElement getFirstItem() { return firstItem; }

    @FindBy(xpath = Constants.HOTEL_SEARCH_BUTTON)
    WebElement hotelSearchButton;
    public WebElement getHotelSearchButton() { return hotelSearchButton; }

    @FindBy(xpath = Constants.CLOSING_DATE_PICKER_CONTAINER_DIV)
    WebElement closingDatePickerContainer;
    public WebElement getClosingDatePickerContainer() { return closingDatePickerContainer; }

    @FindBy(xpath = Constants.FIRST_HOTEL)
    WebElement firstHotel;
    public WebElement getFirstHotel() { return firstHotel; }

    @FindBy(xpath = Constants.BOOK_HOTEL)
    WebElement bookHotel;
    public WebElement getBookHotel() { return bookHotel; }
}
