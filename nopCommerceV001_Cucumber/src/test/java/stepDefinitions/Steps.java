package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LoginPage;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;


public class Steps {
	
	
	public WebDriver driver;
	public LoginPage lp;

	@Given("User Launch Chrome browser")  
		public void User_Launch_Chrome_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yb20\\OneDrive - Sun Life Financial\\Selenium\\Framework2.5\\FrameworkTemplate\\target\\test-classes\\browserdrivers\\chromedriver.exe");
		//System.setProperty("WebDriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromdriver.exe");
		driver = new ChromeDriver();
		
		lp = new LoginPage(driver);
	};

	@When("User opens URL {string}")
		public void User_opens_URL(String url) {
		driver.get(url);
			};


	@When("User enters Email as {string} and Password as {string}")
		public void User_enters_Email_as_and_Password_as(String email, String password) {
		lp.setUserName(email);
		lp.setpassword(password);
	};
	
	
	@When("Click on Login")
		public void Click_on_Login() {
		lp.clickLogin();
	};

	@Then("Page Title should be {string}")
		public void Page_Title_should_be(String title) {
		if(driver.getPageSource().contains("Login was unsuccessful")) {
			driver.close();
			Assert.assertTrue(false);
		}
		else {
			Assert.assertEquals(title, driver.getTitle());
		}
	};

	@When("User click on Log out link") 
		public void User_click_on_Log_out_link() throws InterruptedException {
		lp.clickLogout();
		Thread.sleep(3000);
	};

	@Then("close browser")
		public void close_browser() {
		driver.close();
	};
	


	
	
}
