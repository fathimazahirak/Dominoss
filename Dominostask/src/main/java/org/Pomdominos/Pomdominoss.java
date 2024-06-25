package org.Pomdominos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pomdominoss {
	
	public static WebDriver driver;
	
	@FindBy(xpath="//button[normalize-space()='ORDER ONLINE NOW']")
	private WebElement order;
	
	@FindBy(xpath="//input[@class='srch-cnt-srch-inpt']")
	private WebElement add;
	
	@FindBy(xpath="//input[@placeholder='Enter Area / Locality']")
	private WebElement pin;
	
	@FindBy(xpath="//button[@data-label='Locate_Me']")
	private WebElement locate;
	
	@FindBy(xpath="//span[@class='lst-desc-sec ellipsis']")
	private WebElement suggestions;
	
	@FindBy(xpath="//span[normalize-space()='VEG PIZZA']")
	private WebElement vegpizza;
		
	@FindBy(xpath="//div[@data-label='Veg Pizza']//div[@data-label='Primavera Gourmet-Pizza']//span[contains(text(),'ADD TO CART')]")
	private WebElement gourmet;
		
	@FindBy(xpath="//div[@data-label='Veg Pizza']//div[@data-label='Margherita']//button[@data-label='addTocart']")
	private WebElement margherita;
	
	@FindBy(xpath="//div[@data-label='Veg Pizza']//div[@data-label='Peppy Paneer']//span[contains(text(),'ADD TO CART')]")
	private WebElement peppypaneer;
	
	@FindBy(xpath="//span[normalize-space()='BEVERAGES']")
	private WebElement beverages;
	
	@FindBy(xpath="//div[@data-label='Pepsi 475ml']//span[contains(text(),'ADD TO CART')]")
	private WebElement pepsi;
			
	@FindBy(xpath="//body/div[@id='__next']/div/div[@class='sc-gPEVay ivkyrt']/div/div[@class='mn-cnt']/div[@class='sc-jbKcbu ixOXQV']/div[@class='menu-cnt']/div[@class='menu-right']/div[@class='sc-eqIVtm dWoFoS']/div[contains(@class,'cnt')]/div[@class='crt-itms']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]")
	private WebElement removepizza;
	
	@FindBy(xpath="//*[@id=\"__next\"]/div/div/div[1]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]/div[3]/div/div/div[2]/div/div/div[1]")
	private WebElement removepepsi;
	
	@FindBy(xpath="//span[text()='CHECKOUT']")
	private WebElement checkout;
	
	public WebElement getOrder() {
		return order;}
	public WebElement getAdd() {
		return add;}
	public WebElement getPin() {
		return pin;}
	public WebElement getLocate() {
		return locate;	}
	public WebElement getSuggestions() {
		return suggestions;}
	public WebElement getVegpizza() {
		return vegpizza;}
	public WebElement getGourmet() {
		return gourmet;	}	
	public WebElement getMargherita() {
		return margherita;	}
	public WebElement getPeppypaneer() {
		return peppypaneer;}
	public WebElement getBeverages() {
		return beverages;	}
	public WebElement getPepsi() {
		return pepsi;	}
	public WebElement getRemovepizza() {
		return removepizza;}
	public WebElement getRemovepepsi() {
		return removepepsi;}
	public WebElement getCheckout() {
		return checkout;}

	public Pomdominoss(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	

}
