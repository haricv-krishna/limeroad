package com.Lime_Road_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class initial_Page {

public WebDriver driver ;



public WebElement getShopmen() {
	return shopmen;
}

public WebElement getFootware() {
	return footware;
}

public WebElement getProducts() {
	return products;
}

public WebElement getBlack_shoes() {
	return black_shoes;
}

public WebElement getShoesize() {
	return shoesize;
}

public WebElement getCart() {
	return cart;
}

public WebElement getBuynow() {
	return buynow;
}


@FindBy(xpath ="//span[text()='SHOP MEN']")
  private WebElement shopmen;

@FindBy(xpath = "//div[@class='loaderCat vipshoesLdr dIb mA pA r0   h80 b4 l0 t0 ']")
private WebElement footware;

@FindBy(xpath = "//img[@alt='Your Sign To Shop']")
private WebElement products;

@FindBy(xpath = "(//img[@alt='tan patent leather slip on loafers'])[1]")
private WebElement black_shoes;

@FindBy(id = "size_33420697")
private WebElement shoesize;

@FindBy(xpath = "//div[text()='ADD TO CART']")
private WebElement cart;

@FindBy(xpath = "//a[text()='BUY NOW']")
private WebElement buynow;

	public initial_Page(WebDriver driv) {
		  
		driver = driv;
		PageFactory.initElements(driver,this);
		
	}
	
	
	
	

}
