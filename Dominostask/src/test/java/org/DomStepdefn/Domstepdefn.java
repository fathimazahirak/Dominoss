package org.DomStepdefn;


import java.util.concurrent.TimeUnit;

import org.Basedominos.Baseclass;
import org.Pomdominos.Pomdominoss;
import org.Runnerdom.Runnerdominos;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Domstepdefn extends Baseclass {
      
	WebDriver driver =Runnerdominos.driver;
	
	Pomdominoss dom = new Pomdominoss(driver);
		
	@Given("I launch url and maximize the site")
	public void i_launch_url_and_maximize_the_site() {
	    url(driver,"https://www.dominos.co.in/");
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	}
	@When("I click on order online")
	public void i_click_on_order_online() {
	    toClick(dom.getOrder());
	}
	@When("click on enter address and give pincode")
	public void click_on_enter_address_and_give_pincode() {
	    toClick(dom.getAdd());
	    toSendValue(dom.getPin(),"600086");
	}
	
	@Then("Click locate me and first suggestion")
	public void click_locate_me_and_first_suggestion() {
	    toClick(dom.getLocate());
	    toClick(dom.getSuggestions());	   	    
	}
	
	@Then("Click on Veg pizza")
	public void click_on_veg_pizza() {
	    toClick(dom.getVegpizza());
	}
	@Then("Add Caprese Gourmet Pizza")
	public void add_caprese_gourmet_pizza() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		//driver.switchTo().alert().dismiss();
	    toClick(dom.getGourmet());
	  //  driver.findElement(By.xpath("//span[normalize-space()='NO THANKS']")).click();
	    
	}
	@Then("Add Margherita")
	public void add_margherita() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	    toClick(dom.getMargherita());
	  driver.findElement(By.xpath("//span[normalize-space()='NO THANKS']")).click();
	}
	@Then("Add Peppy Paneer")
	public void add_peppy_paneer() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	    toClick(dom.getPeppypaneer());
	   //driver.findElement(By.xpath("//span[normalize-space()='NO THANKS']")).click();
	}
	@Then("Click on Beverages")
	public void click_on_beverages() throws InterruptedException {
		Thread.sleep(2000);
		driver.manage().deleteAllCookies();
		toClick(dom.getBeverages());
	    
	}
	private JavascriptExecutor JavascriptExecutor(WebDriver driver2) {
		// TODO Auto-generated method stub
		return null;
	}
	@Then("Add Pepsi")
	public void add_pepsi() throws InterruptedException{
		Thread.sleep(2000);
		driver.manage().deleteAllCookies();
	    toClick(dom.getPepsi());
	    for(int i=1;i>=12;i++) {
	    	dom.getPepsi().click();
	    }
	}
	@Then("Remove Margherita and Pepsi")
	public void remove_margherita_and_pepsi() throws InterruptedException  {
		Thread.sleep(2000);;
		driver.manage().deleteAllCookies();
	    toClick(dom.getRemovepizza());
	    for(int i=1;i<7;i++) {
	    toClick(dom.getRemovepepsi());
	    }
	}
	@Then("Click Checkout")
	public void click_checkout() {
	    toClick(dom.getCheckout());
	}









	
	
	
	
	
	
	
	
	
	
	
}
