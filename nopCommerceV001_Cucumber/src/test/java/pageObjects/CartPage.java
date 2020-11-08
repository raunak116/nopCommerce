package pageObjects;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {

public WebDriver ldriver;
	
	public CartPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
    @FindBy(xpath = "//*[text() = 'Cart']")
    @CacheLookup
    public WebElement cartOption;
    
    @FindBy(xpath = "//*[text() = 'Delete']")
    @CacheLookup
    public List<WebElement> delete;
	
    @FindBy(xpath = "//*[text() = 'Place Order']")
    @CacheLookup
    public WebElement placeOrder;
    
    @FindBy(xpath = "//input[@id = 'name']")
    @CacheLookup
    public WebElement name;
    
    @FindBy(xpath = "//input[@id = 'country']")
    @CacheLookup
    public WebElement country;

    @FindBy(xpath = "//input[@id = 'city']")
    @CacheLookup
    public WebElement city;

    @FindBy(xpath = "//input[@id = 'card']")
    @CacheLookup
    public WebElement creditCard;

    @FindBy(xpath = "//input[@id = 'month']")
    @CacheLookup
    public WebElement month;
    
    @FindBy(xpath = "//input[@id = 'year']")
    @CacheLookup
    public WebElement year;

    @FindBy(xpath = "//*[text() = 'Purchase']")
    @CacheLookup
    public WebElement purchase;

    @FindBy(xpath = "//*[text() = 'OK']")
    @CacheLookup
    public WebElement okButton;
    
	
	public void CartPage() throws InterruptedException {
		clickOn3(ldriver,cartOption, 10);
		Thread.sleep(5000);	    
	}
	
	public static void clickOn3(WebDriver driver1, WebElement element, int timeout){
		new WebDriverWait(driver1, timeout).until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		}
	
	public void Delete() throws InterruptedException {
		delete.get(1).click();
		Thread.sleep(3000);
	}
	
	public void PlaceOrderAt() throws InterruptedException {
		clickOn4(ldriver,placeOrder, 10);
		Thread.sleep(3000);
	}
	
	public static void clickOn4(WebDriver driver1, WebElement element, int timeout){
		new WebDriverWait(driver1, timeout).until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		}
	
	public void FormDetails() throws InterruptedException {
		sendKeys(ldriver, name, 10, "Rauank");
		country.sendKeys("India");
		city.sendKeys("Gurgaon");
		creditCard.sendKeys("1234432112344321");
		month.sendKeys("Oct");
	    year.sendKeys("2020");
	}
	
	public static void sendKeys(WebDriver driver1, WebElement element, int timeout, String value) {
		new WebDriverWait (driver1, timeout).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}
	
	public void PurchaseAt() throws InterruptedException {
		clickOn5(ldriver,purchase, 10);
		Thread.sleep(3000);
	}
	
	public static void clickOn5(WebDriver driver1, WebElement element, int timeout){
		new WebDriverWait(driver1, timeout).until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		}
	
	public void PurchaseDetails(String amount) throws InterruptedException {
	    String str = ldriver.findElement(By.xpath("//p[@class='lead text-muted ']")).getText();
	    //System.out.println(str);
	    
	    String strID = str.split(" ")[1];
	    String strAmount = str.split(" ")[2];
	    
	    System.out.println("Id is: " + strID);
	    System.out.println("is: " + strAmount + " USD");
	    
	   Assert.assertEquals(strAmount, amount);
	   System.out.println("USD of Sony vaio i5 is as expected");
		
	   okButton.click();
	   
	}
	
	
}
