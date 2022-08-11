package StepDefsPara;

import org.junit.Test;
import org.testng.annotations.BeforeMethod;

import PageObjects.RecherchePO;
import SELDriver.SELDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Rechreche extends SELDriver{
	
	RecherchePO recherche= new RecherchePO();
@BeforeMethod	
	@Given("Browser is open and user on homepage")
	public void browser_is_open_and_user_on_homepage() {
	    intialization();
	}
@Test
	@When("User choose category")
	public void user_choose_category() {
	   recherche.category();
	}
@Test
	@And("choose sub category")
	public void choose_sub_category() {
	    recherche.SubCategory();
	}
@Test
	@And("choose price filter")
	public void choose_price_filter() {
	    recherche.PriceSort();
	}
@Test
	@And("choose product")
	public void choose_product() throws InterruptedException {
	
        recherche.ChooseProduct();
        Thread.sleep(3000);
	}
@Test
	@And("click on add to cart")
	public void click_on_add_to_cart() throws InterruptedException {
	recherche.SwitchFrame2(); 
	Thread.sleep(3000);
	recherche.AddToCart();
	Thread.sleep(3000);	
	recherche.ExitPopUp();
	}
@Test
	@And("verify cart")
	public void verify_cart() throws InterruptedException {
	Thread.sleep(2000); 
	driver.switchTo().defaultContent();
	recherche.GoToCart();
	}
@Test
	@Then("the poduct is added to cart")
	public void the_poduct_is_added_to_cart() {
	recherche.ProductDisplayed();
	driver.close();
	}

}
