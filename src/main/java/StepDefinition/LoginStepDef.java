package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;

public class LoginStepDef {
	
		@Given("^the user is on freecrm.com website$")
		public void the_user_is_on_freecrm_website(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\swati\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		}
	

}
