package com.stepdef;

import com.Base.Base_Class;
import com.Lime_Road_Pom.initial_Page;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Limeroad_stepdef extends Base_Class {

	
	initial_Page ip = new initial_Page(driver);


	
	@Given("launch url {string}")
	public void launch_url(String string) throws InterruptedException {
		Thread.sleep(3000);
		url("https://www.limeroad.com/");

	}

	@Given("User clicks shop men button")
	public void user_clicks_shop_men_button() throws InterruptedException {
		Thread.sleep(3000);
		ip.getShopmen().click();

	}

	@Given("user clicks shoes")
	public void user_clicks_shoes() throws InterruptedException {
		
		
		Thread.sleep(3000);
		ip.getFootware().click();

	}

	@Given("user clicks anujab_Official")
	public void user_clicks_anujab_official() throws InterruptedException {
		
		Thread.sleep(3000);
//	    scroll(ip.getProducts());
	   // Thread.sleep(5000);
		click(ip.getProducts());
	}
	
	
	@Given("user click the the required footware")
	public void user_click_the_the_required_footware() throws InterruptedException {
		Thread.sleep(3000);
		ip.getBlack_shoes().click();
	   
	}
	@Given("user selects the size of footware")
	public void user_selects_the_size_of_footware() throws InterruptedException {
		Thread.sleep(3000);
	   ip.getShoesize().click();
	}
	
	@Given("user clicks add_to_cart")
	public void user_clicks_add_to_cart() throws InterruptedException {
		Thread.sleep(3000);
		
		ip.getCart().click();
	}
	    
	
	
	@Then("user clicks buynow")
	public void user_clicks_buynow() throws InterruptedException {
		Thread.sleep(3000);
		ip.getBuynow().click();
	   
	}




}
