package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import SELDriver.SELDriver;

public class RecherchePO extends SELDriver {
	
	//Constructeur 
	public RecherchePO ( ) {
		super();
		PageFactory.initElements(driver,this);
		}
	
// web elements 
	
	//la catégorie solaire 
	private By solaire = By.xpath("/html/body/div[4]/header/div[1]/div[3]/div[2]/ul/li[4]/a/span[1]");
	//la sous catégorie peaux mixte à grasse 
	private By type = By.xpath("/html/body/div[4]/header/div[1]/div[3]/div[2]/ul/li[4]/div/div/div/div/div/div/div/div/div/div/div[1]/div/div/div/div[2]/a/span");
	//Filtre prix 
	private By PriceSort_btn = By.xpath("/html/body/div[4]/div[2]/div/aside/div/div/div/div/div/div/div/div/div/div[1]/div[1]/div/a" );
	//Champ valeur minimal du filtre prix 
	private By Price_Min = By.className("filter-price-min");
	//Champ valeur maximal du filtre prix
	private By Price_Max = By.className("filter-price-max");
	//Bouton ajouter au panier 
	private By Cart_btn = By.id("button-cart");
	//Bouton x pour quitter la popup 
	private By Exit = By.xpath("/html/body/div[1]/div/div[2]/div/div[5]/div/div[2]/a[2]");
	//Bouton panier dans la page d'acceuil 
	private By Cart = By.xpath("/html/body/div[4]/header/div[1]/div[2]/div[3]/div[2]/div/a/i");
	//Boutton supprimer un article 
	private By Delete = By.xpath("/html/body/div[4]/div/div/div/div/form/div/table/tbody/tr/td[4]/div/span/button[2]");
	
	
	
	//Sélectionne la catégorie  solaire 
	public void category () {
		driver.findElement(solaire).click();
		
	}
	
	//Sélectionne la sous catégorie peaux mixte à grasse 
	public void SubCategory() {
		driver.findElement(type).click();
	}
    //Sélectionne le filtre prix et Saisi des champs du filtre prix
	public void PriceSort() {
		
		driver.findElement(PriceSort_btn).click();
		driver.findElement(Price_Min).clear();
		driver.findElement(Price_Min).sendKeys("40");
		driver.findElement(Price_Max).clear();
		driver.findElement(Price_Max).sendKeys("50");
	}
	// clique sur le bouton ajouter au panier 
	public void AddToCart() {
		driver.findElement(Cart_btn).click();
	}
	// quitte la pop-up fiche de description du produit 
	public void ExitPopUp() {
		
		driver.findElement(Exit).click();
	}
	//clique sur le panier dans la page d'acceuil 
	public void GoToCart() {
		driver.findElement(Cart).click();
	}
	//Valider l'ajout du produit au panier
	public void ProductDisplayed() {
		driver.findElement(Delete).isDisplayed();
	}
	//Changement du frame
	public void SwitchFrame2() {
		WebElement frame= driver.findElement(By.xpath("/html/body/div[6]/div[1]/div/div/iframe"));
		driver.switchTo().frame(frame);
	}
	
	//choisi un produit dans la page des recherches 
	public void ChooseProduct()   {
		
		for(int i=0; i<=6;i++){
			  try{
			     driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/div[2]/div[1]/div/div[1]/div[1]/a")).click();
			     break;
			  }
			  catch(Exception e){
				  System.out.println(e.getMessage());
		
	}

	}
}
	

	
}
