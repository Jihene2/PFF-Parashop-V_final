package StepDefsPara;

import org.junit.Test;
import org.testng.annotations.BeforeMethod;
import PageObjects.InscriptionPO;
import SELDriver.SELDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Inscription extends SELDriver {


	
	
	InscriptionPO PO =new InscriptionPO();

	// 1er  scénario 
@BeforeMethod
@Given("Browser is open")
public void browser_is_open() {	
	intialization();
	
}
@Test
@And("User clicks on s enregistrer") 
public void user_clicks_on_s_enregistrer()throws InterruptedException {
	
	         
	PO.Senregister();
}
@Test
@When("^User enter name (.*)$")
public void user_enter_name(String arg1) {
	     PO.SwitchFrame();
	     PO.Name(arg1);
    
}
@Test
@And("^Enter familly name(.*)$")
public void enter_Familly_name(String arg2) {
	
         PO.FamillyName(arg2);
}
@Test
@And("^Enter email (.*)$")
public void enter_Email(String arg3) {
	
	PO.email(arg3);
   
}
@Test
@And("^Enter telephone(.*)$")
public void enter_telephone(String int1) {
     PO.telephone(int1);
}
@Test
@And("^Enter password (.*)$")
public void enter_password(String arg4) {
	
	PO.password(arg4);

}
@Test
@And("^Enter confirm password (.*)$")
public void enter_Confirm_password(String arg5) {
	
    PO.confirmpassword(arg5);
}
@Test
@And("clicks on accept legal mentions")
public void clicks_on_accept_legal_mentions() {
	
	PO.Agree();

}
@Test
@And("clicks on continuer")
public void clicks_on_continuer() {
	
	PO.continuer();
  
}
@Test
@Then("User is signed in on the website")
public void user_is_signed_in_on_the_website() {
    PO.Compte();
    driver.close();
}




}