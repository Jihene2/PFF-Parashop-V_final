package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import SELDriver.SELDriver;



	public class InscriptionPO extends SELDriver {

						
				public InscriptionPO ( ) {
					super();
					PageFactory.initElements(driver,this);
					}
								
				private By senregistrer= By.xpath("/html[1]/body[1]/div[4]/header[1]/div[1]/div[2]/div[3]/div[1]/div[1]/ul[1]/li[2]/a[1]");
				private By firstname= By.id("input-firstname");
				private By lastname= By.id("input-lastname");
				private By email= By.id("input-email");
				private By telephone= By.id("input-telephone");
				private By password= By.id("input-password");
				private By confirm= By.id("input-confirm");
				private By agree= By.xpath("/html/body/div[1]/form/div[2]/div/input");
				private By continuer= By.xpath("/html/body/div/form/div[2]/div/button");
				private By Compte= By.xpath("/html/body/div[4]/header/div[1]/div[2]/div[3]/div[1]/div/ul/li[1]");
				
		        			
			public void SwitchFrame() {
				
				WebElement frame= driver.findElement(By.xpath("/html/body/div[6]/div[1]/div/div/iframe"));
				driver.switchTo().frame(frame);
			}
			
						
	       public void Senregister() {
	    	   
	    	   driver.findElement(senregistrer).click();
	    	  
	       }
				
					
			public void Name(String arg1) {
				
				
				 driver.findElement(firstname).sendKeys(arg1);			
			}
			
			public void FamillyName(String arg2) {
				
				 driver.findElement(lastname).sendKeys(arg2);
			}
			
	        public void email (String arg3) {
				
	        	 driver.findElement(email).sendKeys(arg3);
			}
	        
	        public void telephone (String int1) {
				
	        	 driver.findElement(telephone).sendKeys(int1);
			}
			
	        public void password (String arg4) {
				
	        	 driver.findElement(password).sendKeys(arg4);
			}
	        
	        public void confirmpassword (String arg5) {
				
	        	 driver.findElement(confirm).sendKeys(arg5);
			}
	        
	        public void Agree () {
				
	        	 driver.findElement(agree).click();
			}
	        
	        public void continuer() {
	        	
	        	 driver.findElement(continuer).click();
	        }
	        
	        public void Compte() {
	        	
	        driver.findElement(Compte).isDisplayed();
	        }


	
	}