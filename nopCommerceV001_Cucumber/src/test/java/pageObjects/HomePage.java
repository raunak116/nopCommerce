package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

public WebDriver ldriver;
	
	public HomePage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
    @FindBy(xpath = "//*[text()= 'Sony vaio i5']")
    @CacheLookup
    public WebElement SonyVaioi5;
	
    
    @FindBy(xpath = "//*[text()='Laptops']")
    @CacheLookup
    public WebElement laptopOption;
    
    @FindBy(xpath = "//*[text()= 'Add to cart']")
    @CacheLookup
    public WebElement addToCartButton;
    
    @FindBy(xpath = "//*[text() = 'Home ']")
    @CacheLookup
    public WebElement homeTab;
    
    @FindBy(xpath = "//*[text()= 'Dell i7 8gb']")
    @CacheLookup
    public WebElement Delli78gb;

	
	public void login() throws InterruptedException {

	ldriver.manage().window().maximize();
	ldriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	ldriver.get("https://www.demoblaze.com/index.html");
	}
	
	public void laptop() {
		clickOn1(ldriver,laptopOption, 10);
	}
	
	public static void clickOn1(WebDriver driver1, WebElement element, int timeout){
		new WebDriverWait(driver1, timeout).until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		}
	
	
	public void SonyVaioi5Add() throws InterruptedException {
		SonyVaioi5.click();
	}
	
	public void addToCart() throws InterruptedException {
		clickOn2(ldriver,addToCartButton, 10);
		Thread.sleep(3000);
		ldriver.switchTo().alert().accept();
	}
	
	public static void clickOn2(WebDriver driver1, WebElement element, int timeout){
		new WebDriverWait(driver1, timeout).until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		}
	
	public void mainPage() throws InterruptedException {
		homeTab.click();
	}
	
	public void Delli78gbAdd() throws InterruptedException {
		clickOn1(ldriver,laptopOption, 10);
		Delli78gb.click();
		clickOn2(ldriver,addToCartButton, 10);
		Thread.sleep(3000);
		ldriver.switchTo().alert().accept();
	}
	
	
	
}
