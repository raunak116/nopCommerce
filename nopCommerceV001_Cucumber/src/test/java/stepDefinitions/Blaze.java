package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.HomePage;
import pageObjects.CartPage;

public class Blaze {

	public WebDriver driver;
	//HomePage homePage = new HomePage();
	public HomePage hp;
	public CartPage cp;
	
	@Given("^user is on DemoBlaze website Home Page$")
	public void user_is_on_DemoBlaze_website_Home_Page() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yb20\\OneDrive - Sun Life Financial\\Selenium\\Framework2.5\\FrameworkTemplate\\target\\test-classes\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		//homePage.login(driver);
		hp = new HomePage(driver);
		hp.login();
	}

	@When("^user navigates to Laptop section$")
	public void user_navigates_to_Laptop_section() throws Exception {

		hp = new HomePage(driver);
		hp.laptop();
		
	}

	@When("^user adds in the Cart Sony vaio i(\\d+)$")
	public void user_adds_in_the_Cart_Sony_vaio_i(int arg1) throws Exception {
	
		hp = new HomePage(driver);
		hp.SonyVaioi5Add();
		hp.addToCart();
		
	}

	@When("^user adds in the Cart Dell i(\\d+) (\\d+)gb$")
	public void user_adds_in_the_Cart_Dell_i_gb(int arg1, int arg2) throws Exception {
	
		hp = new HomePage(driver);
		hp.mainPage();
		
	}

	@When("^user navigates to the Cart$")
	public void user_navigates_to_the_Cart() throws Exception {
	
		hp = new HomePage(driver);
		hp.Delli78gbAdd();
		
	}

	@When("^user deletes Dell i(\\d+) (\\d+)gb from the Cart$")
	public void user_deletes_Dell_i_gb_from_the_Cart(int arg1, int arg2) throws Exception {
		
		cp = new CartPage(driver);
		cp.CartPage();
		cp.Delete();
	}

	@When("^User Places the Order$")
	public void user_Places_the_Order() throws Exception {
		cp = new CartPage(driver);
		cp.PlaceOrderAt();
	}

	@When("^user fill web form details$")
	public void user_fill_web_form_details() throws Exception {
		cp = new CartPage(driver);
		cp.FormDetails();
	}

	@When("^User carry on Purchase$")
	public void user_carry_on_Purchase() throws Exception {
		cp = new CartPage(driver);
		cp.PurchaseAt();	
	}

	@Then("^PurchaseId and Amount appears$")
	public void purchaseid_and_Amount_appears() throws Exception {

	}

	@Then("^Validate the \"([^\"]*)\"$")
	public void validate_the(String amount) throws Exception {
		cp = new CartPage(driver);
		cp.PurchaseDetails(amount);


	}
	


	
	
}
