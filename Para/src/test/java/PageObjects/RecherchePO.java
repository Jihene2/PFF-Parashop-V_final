package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import SELDriver.SELDriver;

public class RecherchePO extends SELDriver {
	
	public RecherchePO ( ) {
		super();
		PageFactory.initElements(driver,this);
		}
	
	private By solaire = By.xpath("/html/body/div[4]/header/div[1]/div[3]/div[2]/ul/li[4]/a/span[1]");
	private By type = By.xpath("/html/body/div[4]/header/div[1]/div[3]/div[2]/ul/li[4]/div/div/div/div/div/div/div/div/div/div/div[1]/div/div/div/div[2]/a/span");
	private By PriceSort_btn = By.xpath("/html/body/div[4]/div[2]/div/aside/div/div/div/div/div/div/div/div/div/div[1]/div[1]/div/a" );
	private By Price_Min = By.className("filter-price-min");
	private By Price_Max = By.className("filter-price-max");
	private By Cart_btn = By.id("button-cart");
	private By Exit = By.xpath("/html/body/div[1]/div/div[2]/div/div[5]/div/div[2]/a[2]");
	private By Cart = By.xpath("/html/body/div[4]/header/div[1]/div[2]/div[3]/div[2]/div/a/i");
	private By Delete = By.xpath("/html/body/div[4]/div/div/div/div/form/div/table/tbody/tr/td[4]/div/span/button[2]");
	
	
	
	
	public void category () {
		driver.findElement(solaire).click();
		
	}
	
	public void SubCategory() {
		driver.findElement(type).click();
	}
  
	public void PriceSort() {
		
		driver.findElement(PriceSort_btn).click();
		driver.findElement(Price_Min).clear();
		driver.findElement(Price_Min).sendKeys("40");
		driver.findElement(Price_Max).clear();
		driver.findElement(Price_Max).sendKeys("50");
	}
	
	public void AddToCart() {
		driver.findElement(Cart_btn).click();
	}
	
	public void ExitPopUp() {
		
		driver.findElement(Exit).click();
	}
	
	public void GoToCart() {
		driver.findElement(Cart).click();
	}
	
	public void ProductDisplayed() {
		driver.findElement(Delete).isDisplayed();
	}
	
	public void SwitchFrame2() {
		WebElement frame= driver.findElement(By.xpath("/html/body/div[6]/div[1]/div/div/iframe"));
		driver.switchTo().frame(frame);
	}
	
	
	
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
