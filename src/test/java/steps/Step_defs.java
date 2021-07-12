package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page.Change_ColorPage;
import util.BrowserFactory;

public class Step_defs {
	
	WebDriver driver;
	Change_ColorPage changeColorPage;
	
	@Before
	public void beforeRun() {
		
		driver = BrowserFactory.init();
		changeColorPage= PageFactory.initElements(driver, Change_ColorPage.class);
		
	}
	
	@Given ("^Set SkyBlue Background button exists$")
		  public void set_skyBlue_background_button_exists(){
		String actual = changeColorPage.buttonExists();
		Assert.assertEquals("Set SkyBlue Background", actual);
		
	}
	
	@When ("^User click on the button$")
	public void user_click_on_the_button() {
		changeColorPage.clickOnSkyBlueButton();
	}
	
	@Then ("^the background color will change to sky blue$")
	public void the_background_color_will_change_to_sky_blue() {
		
	}
	
	@Given ("^Set White Background button exists$")
	public void set_white_background_button_exists() {
		String actual = changeColorPage.theButtonExists();
		Assert.assertEquals("Set White Background", actual);
	}
	
	@When ("^user click the button$")
	public void user_click_the_button() {
		
	}
	
	@Then ("^the background color will change to white$")
	public void the_background_color_will_change_to_white() {
		
	}
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
