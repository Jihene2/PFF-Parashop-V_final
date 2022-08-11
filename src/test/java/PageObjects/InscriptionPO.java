package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import SELDriver.SELDriver;



	public class InscriptionPO extends SELDriver {

				//constructeur		
				public InscriptionPO ( ) {
					super();
					PageFactory.initElements(driver,this);
					}
				
	// les elements DOM relatifs � l'inscription sur le site parashop.tn
				
				// Boutton s'enregister 				
				private By senregistrer= By.xpath("/html[1]/body[1]/div[4]/header[1]/div[1]/div[2]/div[3]/div[1]/div[1]/ul[1]/li[2]/a[1]");
				//Champ pr�nom
				private By firstname= By.id("input-firstname");
				//Champ nom de famille 
				private By lastname= By.id("input-lastname");
				//Champ email
				private By email= By.id("input-email");
				//Champ t�l�phone 
				private By telephone= By.id("input-telephone");
				//Champ mot de passe 
				private By password= By.id("input-password");
				//Champ confirmer le mot de passe 
				private By confirm= By.id("input-confirm");
				//check box accepter les mentions l�gales 
				private By agree= By.xpath("/html/body/div[1]/form/div[2]/div/input");
				//boutton continuer 
				private By continuer= By.xpath("/html/body/div/form/div[2]/div/button");
				//icon compte 
				private By Compte= By.xpath("/html/body/div[4]/header/div[1]/div[2]/div[3]/div[1]/div/ul/li[1]");
				
	// les fonctions 
				
		     // changement du frame    			
			public void SwitchFrame() {
				
				WebElement frame= driver.findElement(By.xpath("/html/body/div[6]/div[1]/div/div/iframe"));
				driver.switchTo().frame(frame);
		   }
			
			// clique sur le boutton s'enregister dans la page d'acceuil 			
	       public void Senregister() {
	    	   
	    	   driver.findElement(senregistrer).click();  	  
	       }
				
			// saisir le pr�nom 		
			public void Name(String arg1) {
				
				 driver.findElement(firstname).sendKeys(arg1);			
			}
			//saisir le nom de famille 
			public void FamillyName(String arg2) {
				
				 driver.findElement(lastname).sendKeys(arg2);
			}
			// saisir le mail 
	        public void email (String arg3) {
				
	        	 driver.findElement(email).sendKeys(arg3);
			}
	        // saisir le num�ro de t�l�phone 
	        public void telephone (String int1) {
				
	        	 driver.findElement(telephone).sendKeys(int1);
			}
			// saisir le mot de passe 
	        public void password (String arg4) {
				
	        	 driver.findElement(password).sendKeys(arg4);
			}
	        // saisir le champ Confirmer le mot de passe 
	        public void confirmpassword (String arg5) {
				
	        	 driver.findElement(confirm).sendKeys(arg5);
			}
	        // Accepter les conditions l�gales et r�glementaires du site 
	        public void Agree () {
				
	        	 driver.findElement(agree).click();
			}
	        //valider l'inscription 
	        public void continuer() {
	        	
	        	 driver.findElement(continuer).click();
	        }
	        // Validation de la Cr�ation de compte 
	        public void Compte() {
	        	
	        driver.findElement(Compte).isDisplayed();
	        }


	
	}