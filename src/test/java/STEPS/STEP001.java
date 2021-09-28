package STEPS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class STEP001 {
	public WebDriver driver;
	@Given("Chrome Browser Opened")
	public void chrome_browser_opened() {
	    // Write code here that turns the phrase above into concrete actions
	   
		System.out.println("open the chrome browser");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\00004946\\Desktop\\Automation\\documentation\\chromedriver.exe");
         driver=new ChromeDriver();
        
	}

	@When("Navigate to Amazon.in")
	public void navigate_to_amazon_in() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Navigate to Amazon.in");
		driver.get("https://www.amazon.in");
        System.out.println(driver.getTitle());
	}

	@When("Click Mobiles")
	public void click_mobiles() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Click Mobiles");
		
	}

	@When("Capture the Title")
	public void capture_the_title() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(driver.getTitle());
		
	}

	@Then("The Title should contain Mobile")
	public void the_title_should_contain_mobile() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		
		Thread.sleep(2000);
        driver.close();
	}
}
